package com.javpoblano.payu.API;


import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by javpoblano on 16/06/2016.
 */
public interface ApiDef {
    @POST("/koa/")
    public void update(@Body Update device, Callback<UpdateIn> response);
}
