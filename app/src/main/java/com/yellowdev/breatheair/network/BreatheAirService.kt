package com.yellowdev.breatheair.network

/**
 * Created by Ali Kabiri on 2020-01-05.
 */

interface BreatheAirService {

    companion object {
        const val BASE_URL = "https://breatherair.herokuapp.com"
        const val API_ROOT = "$BASE_URL/api"
    }
}