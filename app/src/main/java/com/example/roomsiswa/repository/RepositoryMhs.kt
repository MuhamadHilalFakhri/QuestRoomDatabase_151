package com.example.roomsiswa.repository

import com.example.roomsiswa.data.entity.Mahasiswa

interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)
}