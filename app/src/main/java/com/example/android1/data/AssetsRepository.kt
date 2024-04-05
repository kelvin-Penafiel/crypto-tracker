package com.example.android1.data

import com.example.android1.model.AssetsResponse
import com.example.android1.service.RetrofitInstance

class AssetsRepository {
    private val assetsService = RetrofitInstance.assetsService

    suspend fun getAssets(): AssetsResponse {
        return assetsService.getAssets()
    }
}