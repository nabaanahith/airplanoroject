package com.sdwdw.myapplication.api;

import com.sdwdw.myapplication.model.HolidayItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Services {
    //from=BGW&to=BEY&data=2019-02-24&adt=1&type=e&chd=0

    // here is the error must be  a list of HolidayItem objects no a sing  object ok ?ok abd
    // if u see [] in json tht's mean a list ok ?tmam run know
    @GET("/api/orders/oneway")
    Call<List<HolidayItem>> getHolidays(
            @Query("from") String from,
            @Query("to") String to,
            @Query("data") String data,
            @Query("adt") String adt,
            @Query("type") String type,
            @Query("chd") String chd);
}
