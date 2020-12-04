package com.lazday.androidretrofit.retrofit;


import com.lazday.androidretrofit.MainModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("data.php") Call<MainModel> getData();
}
