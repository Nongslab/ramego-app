package com.nongslab.ramego

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform