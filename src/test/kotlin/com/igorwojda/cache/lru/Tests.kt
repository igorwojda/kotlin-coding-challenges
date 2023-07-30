package com.igorwojda.cache.lru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class Tests {
    // Easily switch between a known solution and Challenge code
    val classUnderTest: (Int)->LRUCache<Int, String> = ::LRUCacheImpl // or SolutionN::LRUCacheImpl

    @Test
    fun `lru cache is empty after creation`() {
        val cache = classUnderTest(3)

        cache.size shouldBeEqualTo 0
    }

    @Test
    fun `oldest value is not removed from cache after capacity is exceeded`() {
        val cache = classUnderTest(2)

        cache.put(1, "Value-1")
        cache.put(2, "Value-2")
        cache.put(3, "Value-3")

        cache.size shouldBeEqualTo 2
        cache.get(1) shouldBeEqualTo null
        cache.get(2) shouldBeEqualTo "Value-2"
        cache.get(3) shouldBeEqualTo "Value-3"
    }

    @Test
    fun `retrieved element becomes most recently used`() {
        val cache = classUnderTest(2)
        cache.put(1, "Value-1")
        cache.put(2, "Value-2")
        cache.get(1)
        cache.put(3, "Value-3")

        cache.get(1) shouldBeEqualTo "Value-1"
        cache.get(2) shouldBeEqualTo null
        cache.get(3) shouldBeEqualTo "Value-3"
    }
}
