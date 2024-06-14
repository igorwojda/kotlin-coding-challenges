package com.igorwojda.cache.advancedlru

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.ZoneId

class Tests {
    // Easily switch between a known solution and Challenge code
    private val classUnderTest: (capacity: Int, clock: Clock)->LRUCache<String, String> = ::AdvancedLRUCache // or SolutionN::AdvancedLRUCache

    private val testClock = object : Clock() {
        private var testTime = Instant.now()
        override fun instant(): Instant {
           return testTime
        }

        fun incTime(duration: Duration) {
            testTime += duration
        }

        override fun withZone(zone: ZoneId?): Clock = TODO("Not yet implemented")
        override fun getZone(): ZoneId = systemDefaultZone().zone
    }

    @Test
    fun `add and get immediately`() {
        val cache = classUnderTest(2, testClock)

        cache.put("A", "apple", 0, Duration.ofMinutes(15))
        cache.get("A") shouldBeEqualTo "apple"

        cache.put("B", "bee", 0, Duration.ofMinutes(15))
        cache.get("B") shouldBeEqualTo "bee"

        cache.put("C", "cat", 0, Duration.ofMinutes(15))
        cache.get("C") shouldBeEqualTo "cat"

        cache.put("E", "echo", 0, Duration.ofMinutes(15))
        cache.get("E") shouldBeEqualTo "echo"
    }

    @Test
    fun `evict by priority`() {
        val cache = classUnderTest(4, testClock)

        // all have the same expiry
        cache.put("B", "bee", 3, Duration.ofMinutes(15))
        cache.put("A", "apple", 1, Duration.ofMinutes(15)) // lowest priority
        cache.put("C", "cat", 5, Duration.ofMinutes(15))
        cache.put("D", "door", 7, Duration.ofMinutes(15))
        cache.put("E", "echo", 9, Duration.ofMinutes(15)) // causes eviction

        // This should be null because "A" was evicted due to lower priority and no items have reached expiry time
        cache.get("A") shouldBeEqualTo null
        cache.get("B") shouldBeEqualTo "bee"
        cache.get("C") shouldBeEqualTo "cat"
        cache.get("D") shouldBeEqualTo "door"
        cache.get("E") shouldBeEqualTo "echo"
    }

    @Test
    fun `evict by priority and last used`() {
        val cache = classUnderTest(4, testClock)

        // some have the same priority
        cache.put("C", "cat", 1, Duration.ofMinutes(12)) // priority 1
        cache.put("A", "apple", 1, Duration.ofMinutes(20)) // priority 1
        cache.put("B", "bee", 1, Duration.ofMinutes(10)) // priority 1
        cache.put("D", "door", 7, Duration.ofMinutes(5))

        // but are accessed most recently in a different order...
        testClock.incTime(Duration.ofSeconds(1))
        cache.get("A")
        testClock.incTime(Duration.ofSeconds(1))
        cache.get("C")
        testClock.incTime(Duration.ofSeconds(1))
        cache.get("B")
        testClock.incTime(Duration.ofSeconds(1))

        cache.put("E", "echo", 9, Duration.ofMinutes(15)) // causes eviction

        // This should be null because "A" was evicted due to lower priority.
        println(cache)
        cache.get("A") shouldBeEqualTo null
        cache.get("B") shouldBeEqualTo "bee"
        cache.get("C") shouldBeEqualTo "cat"
        cache.get("D") shouldBeEqualTo "door"
        cache.get("E") shouldBeEqualTo "echo"
    }

    @Test
    fun `evict by expiry time`() {
        val cache = classUnderTest(100, testClock)

        cache.put("A", "apple", 1, Duration.ofMinutes(15))
        cache.put("B", "bee", 3, Duration.ofMinutes(20))

        testClock.incTime(Duration.ofMinutes(16))

        // This should be null because "A" was evicted due to expiry.
        cache.get("A") shouldBeEqualTo null

        testClock.incTime(Duration.ofMinutes(20))

        cache.put("C", "cat", 5, Duration.ofMinutes(15)) // causes eviction
        cache.put("D", "door", 5, Duration.ofMinutes(15)) // causes eviction

        // this should be null because "B" was evicted due to expiry and later inserts
        cache.get("B") shouldBeEqualTo null

        testClock.incTime(Duration.ofMinutes(14))

        // still here as clock has not moved past expiry
        cache.get("C") shouldBeEqualTo "cat"
        cache.get("D") shouldBeEqualTo "door"
    }
}
