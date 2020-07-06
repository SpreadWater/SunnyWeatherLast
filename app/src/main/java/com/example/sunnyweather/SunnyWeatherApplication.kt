package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *@date 2020-7-5
 *@author zhangsan
 *@description
 */
class SunnyWeatherApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        const val TOKEN="7bF56ctSuLuWh7zw"
        lateinit var context : Context
    }
    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}