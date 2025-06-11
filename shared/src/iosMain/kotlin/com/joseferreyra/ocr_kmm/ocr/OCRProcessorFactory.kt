package com.joseferreyra.ocr_kmm.ocr

actual class OCRProcessorFactory {
    actual fun create(): OCRProcessor {
        return object : OCRProcessor {
            override suspend fun processImage(image: ByteArray): String {
                // Placeholder implementation for Android
                return "Processed image on IOS"
            }
        }
    }
}