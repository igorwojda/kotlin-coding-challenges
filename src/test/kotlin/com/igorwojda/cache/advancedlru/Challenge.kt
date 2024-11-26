package com.igorwojda.cache.advancedlru

import java.time.Clock
import java.time.Duration

interface LRUCache<K: Any, V: Any> {
    fun put(key: K, value: V, priority: Int, ttl: Duration)
    fun get(key: K): V?
}

class AdvancedLRUCache<K: Any, V: Any>(private val capacity: Int, private val clock: Clock = Clock.systemDefaultZone()): LRUCache<K, V> {
    override fun put(key: K, value: V, priority: Int, ttl: Duration) {
        TODO("Add your solution here")
    }

    override fun get(key: K): V? {
        TODO("Add your solution here")
    }
}
