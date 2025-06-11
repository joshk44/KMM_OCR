package com.joseferreyra.ocr_kmm.database

import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import platform.Foundation.NSHomeDirectory

fun getOCRDatabase(): OCRDatabase {
    val dbFile = NSHomeDirectory() + "/ocr.db"
    return Room.databaseBuilder<OCRDatabase>(
        name = dbFile,
        factory = { OCRDatabase::class.instantiateImpl() }
    ).setDriver(BundledSQLiteDriver())
        .fallbackToDestructiveMigration(true)
        .build()
}

