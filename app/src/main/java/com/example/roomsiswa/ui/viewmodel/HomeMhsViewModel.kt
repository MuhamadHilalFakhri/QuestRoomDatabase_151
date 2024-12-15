package com.example.roomsiswa.ui.viewmodel

import com.example.roomsiswa.data.entity.Mahasiswa

data class HomeUiSate(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)