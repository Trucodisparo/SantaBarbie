package com.keepcoding.androidavanzado.di

import com.keepcoding.androidavanzado.domain.useCase.GetHeroListUseCase
import org.koin.dsl.module

val domainModule = module {
    single {GetHeroListUseCase()}
}