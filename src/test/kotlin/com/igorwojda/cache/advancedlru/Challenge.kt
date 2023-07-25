package com.igorwojda.cache.advancedlru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import java.util.*

class AdvancedLRUCache(private val capacity: Int) {
    fun put(key: String, value: Int, priority: Int, expiryTime: Long) {
        TODO("Add your solution here")
    }

    fun get(key: String): Int? {
        TODO("Add your solution here")
    }

    private fun remove(key: String) {
        TODO("Add your solution here")
    }

    private fun clearCache() {
        TODO("Add your solution here")
    }

    private data class CacheItem(
        val key: String,
        var value: Int,
        var priority: Int,
        var expiryTime: Long,
    ) : Comparable<CacheItem> {
        var lastUsed: Long = System.currentTimeMillis()

        override fun compareTo(other: CacheItem): Int {
            return when {
                this.expiryTime != other.expiryTime -> this.expiryTime.compareTo(other.expiryTime)
                this.priority != other.priority -> this.priority.compareTo(other.priority)
                else -> this.lastUsed.compareTo(other.lastUsed)
            }
        }
    }

    // Returns fixed system time in milliseconds
    private fun getSystemTimeForExpiry() = 1000
}

private class Test {
    @Test
    fun `add and get`() {
        val cache = AdvancedLRUCache(2)
        cache.put("A", 1, 5, 5000)

        cache.get("A") shouldBeEqualTo 1
    }

    @Test
    fun `evict by priority`() {
        val cache = AdvancedLRUCache(2)
        cache.put("A", 1, 1, 3000)
        cache.put("B", 2, 3, 4000)
        cache.put("C", 3, 4, 5000)

        // This should be null because "A" was evicted due to lower priority.
        cache.get("A") shouldBeEqualTo null
        cache.get("B") shouldBeEqualTo 2
        cache.get("C") shouldBeEqualTo 3
    }

    @Test
    fun `evict by expiry`() {
        val cache = AdvancedLRUCache(2)
        cache.put("A", 1, 1, 500)
        cache.put("B", 2, 3, 700)

        // This should be null because "A" was evicted due to expiry.
        cache.get("A") shouldBeEqualTo null
        cache.get("B") shouldBeEqualTo null
    }
}
