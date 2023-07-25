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
        val cache = LRUCache(3)

        cache.size shouldBeEqualTo 0
    }

    @Test
    fun `oldest value is not removed from cache after capacity is exceeded`() {
        val cache = LRUCache(2)

        cache.put(1, "Person1")
        cache.put(2, "Person2")
        cache.put(3, "Person3")

        cache.size shouldBeEqualTo 2
        cache.get(1) shouldBeEqualTo null
        cache.get(2) shouldBeEqualTo "Person2"
        cache.get(3) shouldBeEqualTo "Person3"
    }

    @Test
    fun `retrieved element becomes most recently used`() {
        val cache = LRUCache(2)
        cache.put(1, "Person1")
        cache.put(2, "Person2")
        cache.get(1)
        cache.put(3, "Person3")

        cache.get(1) shouldBeEqualTo "Person1"
        cache.get(2) shouldBeEqualTo null
        cache.get(3) shouldBeEqualTo "Person3"
    }
}
