package com.keepcoding.androidavanzado.domain.useCase

import com.keepcoding.androidavanzado.domain.useCase.model.HeroModel

class GetHeroListUseCase {

    fun invoke(): List<HeroModel> = listOf(
        HeroModel("Goku"),
        HeroModel("Vegeta"),
        HeroModel("Piccolo"),
        HeroModel("Frieza"),
        HeroModel("Krillin"),
        HeroModel("Future Trunks"),
        HeroModel("Gohan"),
        HeroModel("Cell"),
        HeroModel("Majin Buu"),
        HeroModel("Goten"),
        HeroModel("Trunks")
    )

    //Devuelva una coleccion de Hero Model
}