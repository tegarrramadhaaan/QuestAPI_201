package com.example.mydatasiswa.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mydatasiswa.AplikasiDataSiswa
import com.example.mydatasiswa.ui.viewmodel.EntryViewModel
import com.example.mydatasiswa.ui.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
    this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
)

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiDataSiswa().container.repositoriDataSiswa)
        }
        initializer {
            EntryViewModel(aplikasiDataSiswa().container.repositoriDataSiswa)
        }
    }
}