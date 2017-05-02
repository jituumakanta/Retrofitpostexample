package com.example.jitu.retrofitpostexample;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by jitu on 5/3/2017.
 */

public interface RegisterAPI {
    @FormUrlEncoded
    @POST("/HelloHelps/z_set_news_ent.php")
    public void insertUser(
            @Field("pagelink") String pagelink,
            @Field("sourcename") String sourcename,
            @Field("title") String title,
            @Field("imagelink") String imagelink,
            Callback<Response> callback);
}
