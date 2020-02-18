package com.yellowdev.breatheair

import com.yellowdev.breatheair.model.jsonmodels.GetWeatherDataPostRequestBody
import com.yellowdev.breatheair.model.jsonmodels.StationData
import com.yellowdev.breatheair.network.BreatheAirService
import com.yellowdev.breatheair.network.ServiceGenerator

/**
 * Created by Ali Kabiri on 2020-01-18.
 */
open class StationDataRepository {

    enum class RepositoryResponse {
        BAD_BODY_DATA,
        AUTH_INVALID,
        NO_INTERNET_CONNECTION,
        ENDPOINT_NOT_REACHABLE,
        ENDPOINT_RESPONDED_WITH_UNKNOWN_ERROR,
        UNDERLYING_AUTH_ERROR,
    }

    interface RepositoryCallBack {

        fun done(info: RepositoryResponse)
    }

    lateinit var callBack: RepositoryCallBack

    private var pBreatheAirService: BreatheAirService? = null
    var breatheAirService: BreatheAirService
        get() {
            if (pBreatheAirService == null)
                pBreatheAirService = ServiceGenerator.getBreatheAirService()
            return pBreatheAirService as BreatheAirService
        }
        set(value) {
            pBreatheAirService = value // will be used for testing.
        }

    open suspend fun getStationData(lat: String, long: String): StationData? {

        return breatheAirService.getData(GetWeatherDataPostRequestBody(lat, long)).body()
    }

}