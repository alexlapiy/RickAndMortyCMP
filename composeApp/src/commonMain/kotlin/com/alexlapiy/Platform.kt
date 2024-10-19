package com.alexlapiy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform