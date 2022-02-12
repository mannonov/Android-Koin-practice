package com.mannonov.androidkoinpractice.presentation.di

import com.mannonov.androidkoinpractice.data.repository.SaveRepositoryImpl
import com.mannonov.androidkoinpractice.data.storage.SaveStorage
import com.mannonov.androidkoinpractice.data.storage.SharedPrefsStorage
import com.mannonov.androidkoinpractice.domain.repository.SaveRepository
import org.koin.dsl.module

val dataModule = module {

    single<SaveStorage> {
        SharedPrefsStorage(context = get())
    }

    single<SaveRepository> {
        SaveRepositoryImpl(saveStorage = get())
    }

}