package com.mygomii.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mygomii.data.model.WordEntity

@Dao
interface WordDao {
    @Query("SELECT * FROM words")
    suspend fun getAll(): List<WordEntity>

    @Query("SELECT * FROM words WHERE id = :id")
    suspend fun getById(id: Long): WordEntity?

    @Insert
    suspend fun insert(entity: WordEntity)
}