package com.keepcoding.androidavanzado.di

import com.keepcoding.androidavanzado.domain.useCase.GetHeroListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DomainModule {

    @Provides
    fun providesGetHeroListUseCase(): GetHeroListUseCase{
        return GetHeroListUseCase()
    }
}