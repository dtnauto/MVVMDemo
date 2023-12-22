package com.example.mvvmdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
class Count(
    @ColumnInfo("Number")
    var num: Int = 1
) {
}