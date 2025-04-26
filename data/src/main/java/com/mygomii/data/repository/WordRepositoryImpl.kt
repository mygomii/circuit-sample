package com.mygomii.data.repository

import com.mygomii.data.dao.WordDao
import com.mygomii.data.model.WordEntity
import com.mygomii.domain.model.Word
import com.mygomii.domain.repository.WordRepository

class WordRepositoryImpl(
    private val dao: WordDao
) : WordRepository {
    override suspend fun getAllWords(): List<Word> =
        dao.getAll().map { Word(it.id, it.text, it.meaning) }

    override suspend fun getWordById(id: Long): Word? =
        dao.getById(id)?.let { Word(it.id, it.text, it.meaning) }

    override suspend fun insertWord(word: Word) {
        dao.insert(WordEntity(text = word.text, meaning = word.meaning))
    }
}