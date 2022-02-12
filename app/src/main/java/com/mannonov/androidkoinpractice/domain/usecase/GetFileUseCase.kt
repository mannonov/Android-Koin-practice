package com.mannonov.androidkoinpractice.domain.usecase

import com.mannonov.androidkoinpractice.domain.repository.SaveRepository

class GetFileUseCase(private val saveRepository: SaveRepository) {

    fun getFile() : String {
        return saveRepository.getFile()
    }

}