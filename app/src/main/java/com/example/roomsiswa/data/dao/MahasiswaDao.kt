package com.example.roomsiswa.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.roomsiswa.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {

    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}