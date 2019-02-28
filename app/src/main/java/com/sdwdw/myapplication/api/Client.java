package com.sdwdw.myapplication.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    public static  final String  BASE_URI="https://favorite-holiday.herokuapp.com";
    public static Retrofit retrofit=null;
    public  static  Retrofit getclint(){

        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URI)//url before /
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
