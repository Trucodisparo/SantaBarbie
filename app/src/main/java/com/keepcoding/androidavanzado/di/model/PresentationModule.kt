package com.keepcoding.androidavanzado.di.model

import com.keepcoding.androidavanzado.presentation.ListFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val pesentationModule = module{
    viewModel{ListFragmentViewModel(get())}

    viewModelOf(::ListFragmentViewModel)
}