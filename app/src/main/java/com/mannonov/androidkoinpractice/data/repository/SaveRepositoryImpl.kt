package com.mannonov.androidkoinpractice.data.repository

import com.mannonov.androidkoinpractice.data.storage.SaveStorage
import com.mannonov.androidkoinpractice.domain.repository.SaveRepository

class SaveRepositoryImpl(private val saveStorage: SaveStorage) : SaveRepository {

    override fun saveFile(string: String) {
        saveStorage.save(string = string)
    }

    override fun getFile(): String {
        return saveStorage.get()
    }
}