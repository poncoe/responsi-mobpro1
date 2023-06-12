package id.poncoe.responsimobpro.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.poncoe.responsimobpro.model.Kuchenk
import id.poncoe.responsimobpro.network.ApiStatus
import id.poncoe.responsimobpro.network.KuchenkApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val data = MutableLiveData<List<Kuchenk>>()
    private val status = MutableLiveData<ApiStatus>()

    init {
        retrieveData()
    }

    private fun retrieveData() {
        viewModelScope.launch(Dispatchers.IO) {
            status.postValue(ApiStatus.LOADING)
            try {
                data.postValue(KuchenkApi.service.getKuchenk())
                status.postValue(ApiStatus.SUCCESS)
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
                status.postValue(ApiStatus.FAILED)
            }
        }
    }

    fun getData(): LiveData<List<Kuchenk>> = data

    fun getStatus(): LiveData<ApiStatus> = status
}