package com.igorwojda.cache.lru

// Implementation is using  combination of HashMap and LinkedList.
// Time Complexity: O(1)
object Solution1 {
    class LRUCacheImpl<K: Any, V: Any>(private val capacity: Int) : LRUCache<K, V> {
        private val map = mutableMapOf<K, CacheItem<K, V>>()

        private var head: CacheItem<K, V>? = null
        private var tail: CacheItem<K, V>? = null

        override val size get() = map.size

        override fun put(key: K, value: V) {
            // Check if node exits
            val existingCacheItem = map[key]

            if (existingCacheItem == null) {
                // Check Map capacity
                if (map.size >= capacity) {
                    val removedNode = removeHead()
                    if (removedNode != null) {
                        map.remove(removedNode.key)
                    }
                    map.remove(removedNode?.key)
                }

                // Add a new node
                val newCacheItem = CacheItem(key, value)

                map[key] = newCacheItem
                addTail(newCacheItem)
            } else {
                existingCacheItem.value = value
                moveToTail(existingCacheItem)
            }
        }

        private fun addTail(cacheItem: CacheItem<K, V>) {
            // If list is empty
            if (head == null) {
                head = cacheItem
            } else {
                cacheItem.prev = tail
                tail?.next = cacheItem
            }

            tail = cacheItem
        }

        private fun removeHead(): CacheItem<K, V>? {
            // Head exists
            if (head != null) {
                // Store current head to return
                val cacheItem = head

                // Remove head
                head = head?.next
                head?.prev = null

                // Remove tail if head is tail
                if (cacheItem == tail) tail = null

                return cacheItem
            }

            return null
        }

        override fun get(key: K): V? {
            // Get the node
            val node = map[key]

            // Move to tail if exists
            if (node != null) {
                moveToTail(node)
            }

            // Return value
            return node?.value
        }

        private fun moveToTail(cacheItem: CacheItem<K, V>) {
            // Check if node is tail
            if (cacheItem != tail) {
                // Remove node from list
                if (cacheItem == head) {
                    head = cacheItem.next
                } else {
                    cacheItem.prev?.next = cacheItem.next
                    cacheItem.next?.prev = cacheItem.prev
                }

                // Add node to tail
                addTail(cacheItem)
            }
        }

        private data class CacheItem<K, V>(
            val key: K,
            var value: V,
            var prev: CacheItem<K, V>? = null,
            var next: CacheItem<K, V>? = null,
        )
    }
}

// Implementation using LinkedHashMap
// Time Complexity: O(1)
object Solution2 {
    class LRUCacheImpl<K: Any, V: Any>(private val capacity: Int): LRUCache<K, V> {
        override val size get() = linkedHashMap.size

        private val linkedHashMap = object :
            LinkedHashMap<K, V>(capacity, 0.75f, true) {
            override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
                return size > capacity
            }
        }

        override fun put(key: K, value: V) {
            linkedHashMap[key] = value
        }

        override fun get(key: K): V? {
            return linkedHashMap[key]?.also {
                linkedHashMap.remove(key)
                linkedHashMap[key] = it
            }
        }
    }
}

// Implementation using List
// Time Complexity: O(n)
object Solution3 {
    class LRUCacheImpl<K: Any, V: Any>(private val capacity: Int): LRUCache<K, V> {
        private val list = mutableListOf<Pair<K, V>>()

        override val size get() = list.size

        override fun get(key: K): V? {
            val value = list.firstOrNull { it.first == key }?.second

            if (value != null) {
                val pair = Pair(key, value)
                list.remove(pair)
                list.add(pair)
            }

            return list.firstOrNull { it.first == key }?.second
        }

        override fun put(key: K, value: V) {
            list.removeIf { it.first == key }
            list.add(Pair(key, value))

            if (list.size > capacity) {
                list.removeFirst()
            }
        }
    }
}
