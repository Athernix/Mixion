package com.example.mixion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform