package com.example.lab1chnu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class MainActivityViewModel: ViewModel() {
    private var myCount = MutableLiveData<Int>()

    var count = myCount

    init {
        count.value = 0
    }
    fun increaseCount(){
        myCount.value=myCount.value?.inc()
    }
}