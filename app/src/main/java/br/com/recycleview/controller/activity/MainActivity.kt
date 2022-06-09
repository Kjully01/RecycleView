package br.com.recycleview.controller.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.recycleview.R
import br.com.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}