package com.example.projet_4a_esiea.data.local

import androidx.room.*
import com.example.projet_4a_esiea.data.local.models.UserLocal

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM userlocal")
    fun getAll(): List<UserLocal>


    @Query("SELECT * FROM userlocal WHERE email LIKE :email AND password LIKE :password")
    fun findByName(email: String, password: String): UserLocal?

    @Insert
    fun insert(users: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}