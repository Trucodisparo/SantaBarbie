package com.keepcoding.androidavanzado.di.model

import com.keepcoding.androidavanzado.domain.useCase.GetHeroListUseCase
import org.koin.dsl.module


val domainModule  = module {

    single { GetHeroListUseCase() }

}