package com.example.mydatasiswa.repositori

import com.example.mydatasiswa.apiservice.ServiceApiSiswa
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface ContainerRepositori {
    val repositoriDataSiswa: RepositoriDataSiswa
}

class ContainerDataSiswa : ContainerRepositori {
    private val baseUrl = "http://10.0.2.2/Pengembangan%20Aplikasi%20Mobile/" // Use 10.0.2.2 for emulator and %20 for space

    private val json = Json { ignoreUnknownKeys = true }

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()

    private val retrofitService: ServiceApiSiswa by lazy {
        retrofit.create(ServiceApiSiswa::class.java)
    }

    override val repositoriDataSiswa: RepositoriDataSiswa by lazy {
        JaringanRepositoriDataSiswa(retrofitService)
    }
}