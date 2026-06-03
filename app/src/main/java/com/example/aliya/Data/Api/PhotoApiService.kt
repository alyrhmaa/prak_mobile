package com.example.aliya.Data.Api

import com.example.aliya.Data.Model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}