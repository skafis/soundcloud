package com.example.entsfrank.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

//import retrofit.http.GET;

//import retrofit.http.GET;

/**
 * Created by frank on 3/12/16.
 */

public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);

}