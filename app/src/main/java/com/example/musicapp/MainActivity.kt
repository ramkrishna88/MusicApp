package com.example.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapp.View.ClassicFragment
import com.example.musicapp.View.PopFragment
import com.example.musicapp.View.RockFragment
import com.example.musicapp.databinding.ActivityMainBinding
import com.example.musicapp.model.Classic
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    private val classicFragment = ClassicFragment()
    private val popFragment = PopFragment()
    private val rockFragment = RockFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        replaceFragment(classicFragment)


        Music.ClassicComponent.inject(this)
        val  BottomNavigationView = binding.bottomNavigation







        }

    private fun replaceFragment(fragment: ClassicFragment) {

    }


}










