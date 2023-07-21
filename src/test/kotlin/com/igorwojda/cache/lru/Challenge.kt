package com.igorwojda.cache.lru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class LRUCache(private val capacity: Int) {

    private val list = mutableListOf<Pair<Int, String>>()

    val size get() = list.size

    fun get(key: Int): String? {
        return list.firstOrNull { it.first == key }?.second
    }
    fun put(key: Int, value: String) {
        remove(key)
        list.add(Pair(key, value))

        if (list.size > capacity) {
            list.removeFirst()
        }
    }

    fun remove(key: Int) {
        list.removeIf { it.first == key }
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
    fun `put 2 items in lru cache when cache size is 2`() {
        val lruCache = LRUCache(2)

        lruCache.put(1, "Person1")
        lruCache.put(2, "Person2")

        lruCache.size shouldBeEqualTo 2
        lruCache.get(1) shouldBeEqualTo "Person1"
        lruCache.get(2) shouldBeEqualTo "Person2"
    }

    @Test
    fun `put 3 items in lru cache when cache size is 2`() {
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
    fun `remove item from cache`() {
        val lruCache = LRUCache(3)
        lruCache.put(1, "Person1")
        lruCache.put(2, "Person2")
        lruCache.put(3, "Person3")

        lruCache.remove(2)

        lruCache.size shouldBeEqualTo 2
        lruCache.get(1) shouldBeEqualTo "Person1"
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
