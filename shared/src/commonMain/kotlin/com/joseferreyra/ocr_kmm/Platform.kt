package com.joseferreyra.ocr_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
