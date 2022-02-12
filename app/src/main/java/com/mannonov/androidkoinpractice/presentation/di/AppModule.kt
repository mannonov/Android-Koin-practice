package com.mannonov.androidkoinpractice.presentation.di

import com.mannonov.androidkoinpractice.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel>{
        MainViewModel(getFileUseCase = get(),saveFileUseCase = get())
    }

}