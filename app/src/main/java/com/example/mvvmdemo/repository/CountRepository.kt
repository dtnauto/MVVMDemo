package com.example.mvvmdemo.repository

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.room.Room
import com.example.mvvmdemo.database.CountDB
import com.example.mvvmdemo.model.Count

class CountRepository(var application: Application) {
    var num = Count(0,0).num

    var db = Room.databaseBuilder(
        application,
        CountDB::class.java, "User Data"
    )
        .allowMainThreadQueries()
        .build()

    var userDao = db.roomCountDAO()

}