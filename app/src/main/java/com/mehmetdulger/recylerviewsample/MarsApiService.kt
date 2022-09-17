package com.mehmetdulger.recylerviewsample

import retrofit2.http.GET
import retrofit2.Call

interface MarsApiService {
    @GET("realestate")
    fun getProperties(): Call<List<RealEstateData>>
}