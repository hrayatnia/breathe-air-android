package com.yellowdev.breatheair.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Ali Kabiri on 2020-01-05.
 */

class ServiceGenerator {

    companion object {

        fun getBreatheAirService(): BreatheAirService {

            val builder = Retrofit.Builder()
                .baseUrl(BreatheAirService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

            val retrofit = builder.build()

            // define interceptors.
            // define custom okhttp client.

            // add the interceptor and custom okhttp client.
            return retrofit.create(BreatheAirService::class.java)
        }
    }
}