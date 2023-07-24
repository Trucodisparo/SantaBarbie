package com.keepcoding.androidavanzado.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.keepcoding.androidavanzado.domain.useCase.GetHeroListUseCase
class ListFragmentViewModel(
    val getHeroListUseCase: GetHeroListUseCase
): ViewModel() {
    private var _heroList = MutableLiveData<List<String>>()

    val heroList: LiveData<List<String>> get() = _heroList

    fun getData(){
        _heroList.value = getHeroListUseCase.invoke()
    }

}