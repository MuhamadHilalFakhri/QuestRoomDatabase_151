package com.example.roomsiswa.ui.viewmodel

import com.example.roomsiswa.ui.viewmodel.MahasiswaViewModel.MahasiswaEvent
import java.lang.Error

data class DetailUiState(
    val detailUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)