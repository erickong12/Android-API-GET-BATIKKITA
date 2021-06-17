package com.example.a1822250025ericagustianwinardi.Rest;
//eric agustian winardi 1822250025
import com.example.a1822250025ericagustianwinardi.Model.Batik;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("all")
    Call<Batik> getAllData();
}