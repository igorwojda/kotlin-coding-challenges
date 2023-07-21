package com.igorwojda.cache.lru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class LRUCache(private val capacity: Int) {
    private val list = mutableListOf<Pair<Int, String>>()

    val size get() = list.size

    fun get(key: Int): String? {
        val value = list.firstOrNull { it.first == key }?.second

        if (value != null) {
            val pair = Pair(key, value)
            list.remove(pair)
            list.add(pair)
        }

        return list.firstOrNull { it.first == key }?.second
    }

    fun put(key: Int, value: String) {
        list.removeIf { it.first == key }
        list.add(Pair(key, value))

        if (list.size > capacity) {
            list.removeFirst()
        }
    }

    fun clear() {
        list.clear()
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

    @Test
    fun `clear the cache`() {
        val lruCache = LRUCache(3)
        lruCache.put(1, "Person1")
        lruCache.put(2, "Person2")

        lruCache.clear()

        lruCache.get(1) shouldBeEqualTo null
        lruCache.get(2) shouldBeEqualTo null
    }
}
