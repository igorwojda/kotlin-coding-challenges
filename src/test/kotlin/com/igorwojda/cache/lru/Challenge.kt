package com.igorwojda.cache.lru

interface LRUCache<K: Any, V: Any> {
    val size: Int

    fun get(key: K): V?
    fun put(key: K, value: V)
}

class LRUCacheImpl<K: Any, V: Any>(private val capacity: Int) : LRUCache<K, V> {
    override val size: Int get() = TODO("Add your solution here")

    override fun get(key: K): V? {
        TODO("Add your solution here")
    }

    override fun put(key: K, value: V) {
        TODO("Add your solution here")
    }
}
