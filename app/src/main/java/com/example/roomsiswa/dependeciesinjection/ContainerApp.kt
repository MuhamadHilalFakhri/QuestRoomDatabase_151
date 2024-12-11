package com.example.roomsiswa.dependeciesinjection

import android.content.Context
import com.example.roomsiswa.data.database.KrsDatabase
import com.example.roomsiswa.repository.LocalRepositoryMhs
import com.example.roomsiswa.repository.RepositoryMhs

interface InterfaceContainerApp{
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private  val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}