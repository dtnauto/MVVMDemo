package com.example.mvvmdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Count(
    @PrimaryKey
    val id: Int,
    @ColumnInfo("Number")
    var num: Int
) {
}