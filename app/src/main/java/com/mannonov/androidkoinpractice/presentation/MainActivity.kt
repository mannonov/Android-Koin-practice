package com.mannonov.androidkoinpractice.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mannonov.androidkoinpractice.R
import com.mannonov.androidkoinpractice.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val mainVM by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetData.setOnClickListener {
            binding.tvSavedText.text = mainVM.getFile()
        }

        binding.btnSaveData.setOnClickListener {
            mainVM.saveFile(binding.edtInput.text.toString())
        }

    }
}