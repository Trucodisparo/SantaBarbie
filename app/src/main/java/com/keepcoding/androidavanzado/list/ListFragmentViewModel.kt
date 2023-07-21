package com.keepcoding.androidavanzado.list

import androidx.lifecycle.ViewModel

class ListFragmentViewModel: ViewModel() {
    private var list = listOf("Goku", "Vegeta", "Piccolo", "Frieza", "Krillin")

    fun getHeroList(): List<String>{
        return list
    }
}