package com.example.musicapp

import android.app.Application
import com.example.musicapp.di.ApplicationModule
import com.example.musicapp.di.ClassicComponent
import com.example.musicapp.di.DaggerClassicComponent


class Music :Application() {

    override fun onCreate() {
        super.onCreate()

        ClassicComponent = DaggerClassicComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        }
    companion object{
        lateinit var ClassicComponent:ClassicComponent
    }




}