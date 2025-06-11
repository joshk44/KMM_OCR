package com.joseferreyra.ocr_kmm.database

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

fun getOCRDatabase(context: Context): OCRDatabase {
    val dbFile = context.getDatabasePath(OCRDatabase.DATABASE_NAME)
    return Room.databaseBuilder<OCRDatabase>(
        context = context.applicationContext,
        OCRDatabase::class.java,
        name = dbFile.absolutePath
    )
        .setDriver(BundledSQLiteDriver())
        .build()
}


suspend fun getListOfOCRSession(context: Context): Flow<List<OCRSession>> {


    getOCRDatabase(context).ocrSessionDao().insertSession(
        com.joseferreyra.ocr_kmm.database.OCRSession(
            dateTime = System.currentTimeMillis(),
            values = "Hello, Android!" // Example value
        )
    )


    return getOCRDatabase(context).ocrSessionDao().getAllSessions()
}