package com.igorwojda.cache.lru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class LRUCache(private val capacity: Int) {
    private val map = HashMap<Int, Node>()
    val size: Int get() = TODO("Add your solution here")

    fun get(key: Int): String? {
        TODO("Add your solution here")
    }

    fun put(key: Int, value: String) {
        TODO("Add your solution here")
    }

    fun clear() {
        TODO("Add your solution here")
    }

    data class Node(var key: Int, var value: String) {
        var prev: Node? = null
        var next: Node? = null
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
    fun `clear the cache`() {
        val lruCache = LRUCache(3)
        lruCache.put(1, "Person1")
        lruCache.put(2, "Person2")

        lruCache.clear()

        lruCache.get(1) shouldBeEqualTo null
        lruCache.get(2) shouldBeEqualTo null
    }
}
