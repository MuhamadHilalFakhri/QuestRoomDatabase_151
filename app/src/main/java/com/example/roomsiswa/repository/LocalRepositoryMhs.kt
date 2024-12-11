package com.example.roomsiswa.repository

import com.example.roomsiswa.data.dao.MahasiswaDao
import com.example.roomsiswa.data.entity.Mahasiswa

class LocalRepositoryMhs
    (private val mahasiswaDao: MahasiswaDao)  : RepositoryMhs
{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}