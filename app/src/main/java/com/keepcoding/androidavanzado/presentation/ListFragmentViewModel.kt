package com.keepcoding.androidavanzado.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.keepcoding.androidavanzado.domain.useCase.GetHeroListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListFragmentViewModel @Inject constructor(
    val getHeroListUseCase: GetHeroListUseCase
): ViewModel() {
    private var _heroList = MutableLiveData<List<String>>()

    val heroList: LiveData<List<String>> get() = _heroList

    fun getData(){
        _heroList.value = getHeroListUseCase.invoke()
    }

}