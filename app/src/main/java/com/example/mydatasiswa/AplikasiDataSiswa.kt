package com.example.mydatasiswa

import android.app.Application
import com.example.mydatasiswa.repositori.ContainerDataSiswa
import com.example.mydatasiswa.repositori.ContainerRepositori

class AplikasiDataSiswa : Application() {
    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: ContainerRepositori

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataSiswa()
    }
}