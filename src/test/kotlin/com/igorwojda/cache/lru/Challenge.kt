package com.igorwojda.cache.lru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class LRUCache(private val capacity: Int) {
    val size: Int get() = TODO("Add your solution here")

    fun get(key: Int): String? {
        TODO("Add your solution here")
    }

    fun put(key: Int, value: String) {
        TODO("Add your solution here")
    }
}

private class Test {
    @Test
    fun `lru cache is empty after creation`() {
        val lruCache = LRUCache(3)

        lruCache.size shouldBeEqualTo 0
    }

    @Test
    fun `oldest value is not removed from cache after capacity is exceeded`() {
        val lruCache = LRUCache(2)

        lruCache.put(1, "Person1")
        lruCache.put(2, "Person2")
        lruCache.put(3, "Person3")

        lruCache.size shouldBeEqualTo 2
        lruCache.get(1) shouldBeEqualTo null
        lruCache.get(2) shouldBeEqualTo "Person2"
        lruCache.get(3) shouldBeEqualTo "Person3"
    }

    @Test
    fun `retrieved element becomes most recently used`() {
        val lruCache = LRUCache(2)
        lruCache.put(1, "Person1")
        lruCache.put(2, "Person2")
        lruCache.get(1)
        lruCache.put(3, "Person3")

        lruCache.get(1) shouldBeEqualTo "Person1"
        lruCache.get(2) shouldBeEqualTo null
        lruCache.get(3) shouldBeEqualTo "Person3"
    }
}
