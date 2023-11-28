package com.example.myapplication2

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [EntityUser::class],
    version = 1
)

abstract class UserDB : RoomDatabase(){

    abstract fun daoUser(): DAOUser
}