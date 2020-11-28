package com.example.projet_4a_esiea

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    val counter : MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun onClickedIncrement() {
        counter.value = (counter.value ?: 0) + 1
    }
}