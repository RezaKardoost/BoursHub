package com.github.rezakardoost.bourshub

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class BoursHub:Application() {
    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY)
        AppCompatDelegate.getDefaultNightMode()

    }
}