package com.example.mydatasiswa.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mydatasiswa.modeldata.DetailSiswa
import com.example.mydatasiswa.modeldata.UIStateSiswa
import com.example.mydatasiswa.modeldata.toSiswa
import com.example.mydatasiswa.repositori.RepositoriDataSiswa

class EntryViewModel(private val repositoriDataSiswa: RepositoriDataSiswa) : ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    fun updateUiState(detailSiswa: DetailSiswa) {
        uiStateSiswa = UIStateSiswa(detailSiswa = detailSiswa, isEntryValid = validasiInput(detailSiswa))
    }

    private fun validasiInput(detailSiswa: DetailSiswa = uiStateSiswa.detailSiswa): Boolean {
        return with(detailSiswa) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }

    suspend fun addSiswa() {
        if (validasiInput()) {
            repositoriDataSiswa.postDataSiswa(uiStateSiswa.detailSiswa.toSiswa())
        }
    }
}