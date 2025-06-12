package com.joseferreyra.ocr_kmm.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface OCRSessionDao {

    @Insert
    fun insertSession(session: OCRSession)

    @Query ("SELECT * FROM ocr_sessions")
    fun getAllSessions(): Flow<List<OCRSession>>

    @Delete
    fun deleteSession(ocrSession: OCRSession)
}