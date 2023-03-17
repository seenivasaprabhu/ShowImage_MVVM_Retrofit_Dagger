package dev.seenu.fitpeotask.presentation

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import dev.seenu.fitpeotask.R
import dev.seenu.fitpeotask.databinding.ActivityMainBinding

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_fitpeotask)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}