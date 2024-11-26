package com.igorwojda.cache.advancedlru

import java.time.Clock
import java.time.Duration
import java.util.*

// Implementation is using  combination of HashMap and PriorityQueue.
// Time Complexity: O(N) (JVM priority queue is O(log(n)) on offer/poll methods and O(N) on remove(item) method)
internal object Solution1 {
    class AdvancedLRUCache<K: Any, V: Any>(private val capacity: Int, private val clock: Clock = Clock.systemDefaultZone()) : LRUCache<K, V> {
        private val map: MutableMap<K, CacheItem<K, V>> = mutableMapOf()

        private val expiryQueue: PriorityQueue<CacheItem<K, V>> = PriorityQueue { item1, item2 ->
            compareBy<CacheItem<K, V>>({ it.expiryTime }).compare(item1, item2)
        }

        private val priorityQueue: PriorityQueue<CacheItem<K, V>> = PriorityQueue { item1, item2 ->
            compareBy<CacheItem<K, V>>({ it.priority }, { it.lastUsed }).compare(item1, item2)
        }

        override fun put(key: K, value: V, priority: Int, ttl: Duration) {
            remove(key)
            checkAndExpireCachedItems()

            val item = CacheItem(key, value, priority, clock.millis() + ttl.toMillis(), clock.millis())
            map[key] = item

            expiryQueue.offer(item)
            priorityQueue.offer(item)
        }

        override fun get(key: K): V? {
            val item = map[key]

            return if (item == null) {
                null
            } else if (item.expiryTime < clock.millis()) {
                expiryQueue.remove(item)
                priorityQueue.remove(item)
                null
            } else {
                priorityQueue.remove(item)
                priorityQueue.add(item.touch(clock.millis()))
                item.value
            }
        }

        private fun remove(key: K) {
            val item = map[key]

            item?.let {
                expiryQueue.remove(item)
                priorityQueue.remove(item)
                map.remove(key)
            }
        }

        private fun checkAndExpireCachedItems() {
            if (map.size < capacity) return

            while (expiryQueue.isNotEmpty() && expiryQueue.peek().expiryTime < clock.millis()) {
                val item = expiryQueue.poll()
                map.remove(item.key)
                priorityQueue.remove(item)
            }

            if (map.size < capacity) return

            if (priorityQueue.isEmpty()) return

            val item = priorityQueue.poll()
            map.remove(item.key)
            expiryQueue.remove(item)
        }

        private class CacheItem<K, V>(
            val key: K,
            val value: V,
            val priority: Int,
            val expiryTime: Long,
            val lastUsed: Long
        ) {
            // only compare equality by `key`
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is CacheItem<*, *>) return false
                if (key == other.key) return true
                return false
            }

            override fun hashCode(): Int {
                return key.hashCode()
            }

            fun touch(
                lastUsed: Long = this.lastUsed
            ) = CacheItem(key, value, priority, expiryTime, lastUsed)

            override fun toString(): String {
                return "CacheItem(key='$key', value=$value, priority=$priority, expiryTime=$expiryTime, lastUsed=$lastUsed)"
            }
        }

        override fun toString(): String {
            return "AdvancedLRUCache(capacity=$capacity, clock=$clock, map=$map, priorityQueue=$expiryQueue)"
        }
    }
}

private object KtLintWillNotComplain
