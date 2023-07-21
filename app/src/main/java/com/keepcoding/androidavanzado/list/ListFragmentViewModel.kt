package com.keepcoding.androidavanzado.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListFragmentViewModel: ViewModel() {


    private val _heroList = MutableLiveData(listOf("Goku", "Vegeta", "Piccolo", "Frieza", "Krillin"))
    val heroList: LiveData<List<String>> get() = _heroList

    fun getHeroList(): List<String>{return heroList.value ?: listOf()
    }
}