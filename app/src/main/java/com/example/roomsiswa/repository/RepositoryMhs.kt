package com.example.roomsiswa.repository

import com.example.roomsiswa.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs(): Flow<List<Mahasiswa>>
}