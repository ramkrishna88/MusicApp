package com.example.musicapp.di


import com.example.musicapp.View.ClassicFragment
import com.example.musicapp.View.PopFragment
import com.example.musicapp.View.RockFragment
import com.example.musicapp.MainActivity
import dagger.Component

@Component(
    modules = [
        NetworkModule::class,
        ApplicationModule ::class,
        PresenterModule::class,


    ]
)
interface ClassicComponent {
    fun inject (mainActivity : MainActivity)
    fun inject (classicFragment:ClassicFragment)
    fun inject (popFragment: PopFragment)
    fun inject (rockFragment: RockFragment)
}