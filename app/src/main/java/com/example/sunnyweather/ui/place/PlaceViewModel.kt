package com.example.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Place

/**
 *@date 2020-7-5
 *@author zhangsan
 *@description
 */
class PlaceViewModel :ViewModel() {
    private val searchLiveData=MutableLiveData<String>()

    val placeList=ArrayList<Place>()

    val placeLiveData=Transformations.switchMap(searchLiveData){
        query->Repository.searchPlaces(query)
    }
    //query一改变就会调用swithMap的转换函数,也就是调用一次仓库层的网络请求.同时返回一个

    //可供Activity观察的LiveData对象
    fun searchPlaces(query:String){
        searchLiveData.value=query
    }
}