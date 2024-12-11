package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.dependeciesinjection.ContainerApp

class KrsApp : Application() {

    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)
        //instance adalah object yg dibuat dari class
    }
}