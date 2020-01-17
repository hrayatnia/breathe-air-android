package com.yellowdev.breatheair.network

import com.yellowdev.breatheair.model.jsonmodels.StationData
import com.yellowdev.breatheair.model.jsonmodels.GetWeatherDataPostRequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Ali Kabiri on 2020-01-05.
 */

interface BreatheAirService {

    @POST("/location")
    suspend fun getData(@Body requestBody: GetWeatherDataPostRequestBody): Response<StationData>

    companion object {
        const val BASE_URL = "https://breatherair.herokuapp.com"
        const val API_ROOT = "$BASE_URL/api"
    }
}