package com.mannonov.androidkoinpractice.domain.repository

interface SaveRepository {

    fun saveFile(string: String)

    fun getFile(): String

}