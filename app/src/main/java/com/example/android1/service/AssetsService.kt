package com.example.android1.service

import retrofit2.http.GET
import com.example.android1.model.AssetsResponse

interface AssetsService {
    @GET("assets")
    suspend fun getAssets(): AssetsResponse

}