package com.example.expentrack.data.local.database

import android.content.Context
import androidx.room.Room

object DatabaseProvider {
    @Volatile
    private var instance: AppDatabase? = null
    private const val DB_NAME = "expentrack_db"

    fun getDatabase(context: Context): AppDatabase {
        return instance ?: synchronized(this) {
            val dbInstance = Room.databaseBuilder(
                context.applicationContext, AppDatabase::class.java, DB_NAME
            ).build()
            instance = dbInstance
            dbInstance
        }
    }
}