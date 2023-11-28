package com.example.myapplication2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAOUser {
    @Query("SELECT name FROM EntityUser")
    fun getAll(): List<EntityUser>

    @Insert
    fun insert(user: EntityUser)
}