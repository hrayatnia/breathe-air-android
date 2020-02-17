package com.yellowdev.breatheair.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.yellowdev.breatheair.R

class MainFragment : Fragment() {

    companion object {
        private const val TAG = "MainActivity"
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // lat, lang of the Kölle!
        val lat = 50.935173
        val lang = 6.953101
        // TODO - replace this after the UI is ready.
        val stationData = viewModel.getStationData(lat.toString(), lang.toString())
        stationData.observe(viewLifecycleOwner, Observer {
            Log.d(TAG, it.location.name)
        })
    }
}
