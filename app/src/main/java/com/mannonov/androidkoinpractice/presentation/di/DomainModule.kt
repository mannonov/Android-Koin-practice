package com.mannonov.androidkoinpractice.presentation.di

import com.mannonov.androidkoinpractice.domain.usecase.GetFileUseCase
import com.mannonov.androidkoinpractice.domain.usecase.SaveFileUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetFileUseCase> {
        GetFileUseCase(saveRepository = get())
    }

    factory<SaveFileUseCase> {
        SaveFileUseCase(saveRepository = get())
    }

}