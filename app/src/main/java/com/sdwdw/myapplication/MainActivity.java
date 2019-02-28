package com.sdwdw.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.sdwdw.myapplication.api.Client;
import com.sdwdw.myapplication.api.Services;
import com.sdwdw.myapplication.fragments.FlightFragment;
import com.sdwdw.myapplication.model.HolidayItem;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    MaterialEditText from, to, dep, retun, passenger, clss;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        dep = findViewById(R.id.dep);
        retun = findViewById(R.id.retun);
        passenger = findViewById(R.id.passenger);
        clss = findViewById(R.id.clss);

        btn = findViewById(R.id.ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String from1, to1, dep1, retun1, passenger1, clss1;
                from1 = from.getText().toString();
                to1 = to.getText().toString();
                dep1 = dep.getText().toString();
                retun1 = retun.getText().toString();
                passenger1 = passenger.getText().toString();
                clss1 = clss.getText().toString();


                Services apiservices = Client.getclint().create(Services.class);
                Call<List<HolidayItem>> call = apiservices.getHolidays(from1, to1, dep1, retun1, passenger1, clss1);
                call.enqueue(new Callback<List<HolidayItem>>() {
                    @Override
                    public void onResponse(@NonNull Call<List<HolidayItem>> call, @NonNull Response<List<HolidayItem>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            List<HolidayItem> list = response.body();
                            Log.i(TAG, "onResponse: fist item :" +
                                    list.get(0).toString()
                                    );
                        } else Log.e(TAG, "onResponse: error: " + response.message());


                    }

                    @Override
                    public void onFailure(@NonNull Call<List<HolidayItem>> call, @NonNull Throwable t) {
                        Log.e(TAG, "onFailure: ", t);
                    }
                });

            }
        });


        TabLayout tabLayout = findViewById(R.id.tab_layput);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPage viewPage = new ViewPage(getSupportFragmentManager());
        viewPage.addFragment(new

                FlightFragment(), "Roundtrip");
        viewPage.addFragment(new

                FlightFragment(), "One way");
        viewPage.addFragment(new

                FlightFragment(), "Multi-city");

        viewPager.setAdapter(viewPage);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).

                setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).

                setIcon(R.drawable.ic_plane);

    }

    class ViewPage extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragments;
        private ArrayList<String> titles;

        public ViewPage(FragmentManager fm) {
            super(fm);
            this.fragments = new ArrayList<>();
            this.titles = new ArrayList<>();
        }

        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            titles.add(title);
        }


        public CharSequence getPageTitle(int possition) {
            return titles.get(possition);
        }
    }
}
