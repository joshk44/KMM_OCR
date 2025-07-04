package com.joseferreyra.ocr_kmm.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OCRSession(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val dateTime: Long,
    val values: String)

