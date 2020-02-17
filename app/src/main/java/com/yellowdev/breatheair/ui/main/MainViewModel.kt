package com.yellowdev.breatheair.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yellowdev.breatheair.StationDataRepository
import com.yellowdev.breatheair.model.jsonmodels.StationData
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val stationDataRepository = StationDataRepository()

    private lateinit var stationData: LiveData<StationData>

    fun getStationData(lat: String, lang: String): LiveData<StationData> {

        val liveStationData = MutableLiveData<StationData>()
        viewModelScope.launch {
            val stationData = stationDataRepository.getStationData(lat, lang)
            liveStationData.postValue(stationData)
        }
        return liveStationData
    }
}
