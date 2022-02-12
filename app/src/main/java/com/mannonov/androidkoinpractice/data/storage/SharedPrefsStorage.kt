package com.mannonov.androidkoinpractice.data.storage

import android.content.Context

private const val SHARED_PREF_NAME = "saved_file"
private const val FILE_KEY = "file_key"
private const val DEFAULT_FILE_VALUE = "Default file value"

class SharedPrefsStorage(private val context: Context) : SaveStorage {

    private val sharedPreferences =
        context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)

    override fun save(string: String) {
        sharedPreferences.edit().putString(FILE_KEY, string).apply()
    }

    override fun get(): String {
        return sharedPreferences.getString(FILE_KEY, DEFAULT_FILE_VALUE) ?: DEFAULT_FILE_VALUE
    }
}