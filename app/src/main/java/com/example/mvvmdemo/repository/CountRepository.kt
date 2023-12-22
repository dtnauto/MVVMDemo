package com.example.mvvmdemo.repository

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.mvvmdemo.model.Count

class CountRepository() {
    var num = Count().num
}