package com.example.wetherapiakmaralabdylmanapkyzyakmaralain_2_20.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherHolderApi {
    @GET("/v1/forecast.json?key=456cc09a5c1b56f93c1b5dd846ead967=no")
    Call<Weather> getWeather(@Query("q") String city);
}
