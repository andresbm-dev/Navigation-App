package com.abm.maasapp.base

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MassApp : Application (){
    override fun onCreate() {
        super.onCreate()

        context = applicationContext


    }


    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
}