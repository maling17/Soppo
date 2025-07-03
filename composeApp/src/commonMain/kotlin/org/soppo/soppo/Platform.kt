package org.soppo.soppo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform