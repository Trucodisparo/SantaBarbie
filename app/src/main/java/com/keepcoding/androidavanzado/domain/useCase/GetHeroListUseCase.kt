package com.keepcoding.androidavanzado.domain.useCase

import com.keepcoding.androidavanzado.di.model.HeroModel

class GetHeroListUseCase {

    //fun invoke(): List<String> = listOf("Goku", "Vegeta", "Piccolo", "Frieza", "Krillin")

    //Devuelva una coleccion de Hero Model

    fun invoke(): List<HeroModel> = listOf(
        HeroModel("Vegeta"),
        HeroModel("Goku"),
        HeroModel("Picolo"),
        HeroModel("Frieza")
    )
}