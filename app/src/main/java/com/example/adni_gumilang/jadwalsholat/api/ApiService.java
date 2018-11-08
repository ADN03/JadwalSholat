package com.example.adni_gumilang.jadwalsholat.api;

import com.example.adni_gumilang.jadwalsholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}
