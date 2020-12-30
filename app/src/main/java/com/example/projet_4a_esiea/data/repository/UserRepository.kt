package com.example.projet_4a_esiea.data.repository

import com.example.projet_4a_esiea.data.local.DatabaseDao
import com.example.projet_4a_esiea.data.local.models.UserLocal
import com.example.projet_4a_esiea.data.local.models.toData
import com.example.projet_4a_esiea.data.local.models.toEntity
import com.example.projet_4a_esiea.domain.entity.User

class UserRepository(
    private val databaseDao: DatabaseDao
) {
    suspend fun createUser(user: User){
        databaseDao.insert(user.toData())
    }
    fun getUser(email: String, password : String) : User?{
        val userLocal : UserLocal? = databaseDao.findByName(email,password)
        return userLocal?.toEntity()
    }
}