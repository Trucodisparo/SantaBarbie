package com.keepcoding.androidavanzado.di

import com.keepcoding.androidavanzado.presentation.ListFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val presentationModule = module {
    viewModel { ListFragmentViewModel(get()) }

    viewModelOf(::ListFragmentViewModel)
}