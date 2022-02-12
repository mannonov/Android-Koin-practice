package com.mannonov.androidkoinpractice.data.storage

interface SaveStorage {

    fun save(string: String)

    fun get(): String

}