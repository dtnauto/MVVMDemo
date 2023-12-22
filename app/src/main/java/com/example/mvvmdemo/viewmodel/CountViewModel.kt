package com.example.mvvmdemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.model.Count
import com.example.mvvmdemo.repository.CountRepository

class CountViewModel(): ViewModel() {
    var count = MutableLiveData<Int>()
    var num = 0

    init {
        num = CountRepository().num
        count.value = num
    }

    fun updateCount(){
        num++
        count.value = num
    }
}