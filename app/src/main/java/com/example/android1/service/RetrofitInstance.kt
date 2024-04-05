package com.example.android1.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  RetrofitInstance {

    private val BASE_URL="https://40e40850-1e51-4c1c-ad44-c633c3dfe05e.mock.pstmn.io/v2/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val AssetsService : AssetsService by lazy {
        retrofit.create(AssetsService::class.java)
    }
}