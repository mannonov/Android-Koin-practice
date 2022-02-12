package com.mannonov.androidkoinpractice.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mannonov.androidkoinpractice.domain.usecase.GetFileUseCase
import com.mannonov.androidkoinpractice.domain.usecase.SaveFileUseCase

class MainViewModel(
    private val getFileUseCase: GetFileUseCase,
    private val saveFileUseCase: SaveFileUseCase,
) : ViewModel() {

    init {
        Log.d("MainViewModel", "ViewModel created")
    }

    fun getFile(): String {
        return getFileUseCase.getFile()
    }

    fun saveFile(string: String) {
        saveFileUseCase.saveFile(string = string)
    }

}