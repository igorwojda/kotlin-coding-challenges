package com.igorwojda.cache.advancedlru

import java.time.Clock
import java.time.Duration

interface LRUCache<T: Any> {
    fun put(key: String, value: T, priority: Int, ttl: Duration)
    fun get(key: String): T?
}

class AdvancedLRUCache<T: Any>(private val capacity: Int, private val clock: Clock = Clock.systemDefaultZone()): LRUCache<T> {
    override fun put(key: String, value: T, priority: Int, ttl: Duration) {
        TODO("Add your solution here")
    }

    override fun get(key: String): T? {
        TODO("Add your solution here")
    }
}
