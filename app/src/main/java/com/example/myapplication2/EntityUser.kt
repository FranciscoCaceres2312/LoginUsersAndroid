package com.example.myapplication2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EntityUser(
    @PrimaryKey(autoGenerate = true)
    val idUser: Int,
    val name: String,
    val address: String
)