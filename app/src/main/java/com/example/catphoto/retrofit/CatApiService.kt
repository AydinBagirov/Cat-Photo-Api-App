package com.example.catphoto.retrofit

import com.example.catphoto.model.CatPhoto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApiService {
    @GET("cat")
    suspend fun getCatPhoto(
        @Query("json") json: Boolean = true
    ): Response<CatPhoto>
}