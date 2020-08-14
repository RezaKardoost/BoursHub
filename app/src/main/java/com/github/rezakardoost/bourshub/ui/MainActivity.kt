package com.github.rezakardoost.bourshub.ui

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.rezakardoost.bourshub.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // style navigation and status bar
        if (!isDarkTheme(this)){
            when {
                android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O ->{
                    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                }
                android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M ->{
                    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                }
            }
        }


    }

    private fun isDarkTheme(context: Context): Boolean{
        return context.resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK ==
                Configuration.UI_MODE_NIGHT_YES
    }
}