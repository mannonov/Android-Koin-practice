package com.mannonov.androidkoinpractice.domain.usecase

import com.mannonov.androidkoinpractice.domain.repository.SaveRepository

class SaveFileUseCase(private val saveRepository: SaveRepository) {

    fun saveFile(string: String) {
        saveRepository.saveFile(string = string)
    }

}