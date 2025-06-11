package com.joseferreyra.ocr_kmm.database

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase

@Database (
    entities = [OCRSession::class],
    version = 1,
    exportSchema = true
)
abstract class OCRDatabase: RoomDatabase() {


    abstract fun ocrSessionDao(): OCRSessionDao

    companion object {
        const val DATABASE_NAME = "ocr_database"
    }
}