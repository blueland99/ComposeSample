package com.blueland.android_compose_sample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.blueland.android_compose_sample.data.remote.APIService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val apiService: APIService) : ViewModel() {

    val data = liveData {
        val result = apiService.getData()
        emit(result)
    }
}