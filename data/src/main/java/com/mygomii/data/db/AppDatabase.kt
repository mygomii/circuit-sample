package com.mygomii.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mygomii.data.dao.WordDao
import com.mygomii.data.model.WordEntity

@Database(entities = [WordEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao
}