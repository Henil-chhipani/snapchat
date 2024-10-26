package com.example.snapchat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform