package com.example.roomsiswa.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.roomsiswa.data.entity.Mahasiswa
import com.example.roomsiswa.repository.LocalRepositoryMhs
import com.example.roomsiswa.repository.RepositoryMhs

class HomeMhsViewModel (
    private val repositoryMhs: RepositoryMhs
) : ViewModel (){

}

data class HomeUiSate(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)