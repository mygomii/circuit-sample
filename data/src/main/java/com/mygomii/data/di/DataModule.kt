package com.mygomii.data.di

import androidx.room.Room
import com.mygomii.data.db.AppDatabase
import com.mygomii.data.repository.WordRepositoryImpl
import com.mygomii.domain.repository.WordRepository
import org.koin.dsl.module

val dataModule = module {
    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, "word_db").build()
    }

    single { get<AppDatabase>().wordDao() }

    single<WordRepository> { WordRepositoryImpl(get()) }
}