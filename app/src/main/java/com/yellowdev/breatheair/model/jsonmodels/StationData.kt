package com.yellowdev.breatheair.model.jsonmodels

import com.google.gson.annotations.SerializedName

/**
 * Created by Ali Kabiri on 2020-01-17.
 */

data class StationData (

    var uuid: String,
    var date: String,
    var error: String,
    var location: Location,
    var offerToDo: ArrayList<Offer>,
    var data: WeatherData

) {
    data class Location(
        var lat: String,
        var lon: String,
        var name: String
    )

    data class Offer(
        var text: String,
        var imageUrl: String
    )

    data class WeatherData(
        @SerializedName("AQIIndex")
        var aqiIndex: Int,
        var pm2: Int,
        var pm10: Int,
        var co2: Int,
        var others: ArrayList<Any> // any for now.
    )
}