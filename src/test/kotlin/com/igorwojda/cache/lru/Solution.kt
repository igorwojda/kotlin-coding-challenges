package com.igorwojda.cache.lru

// Implementation is using  combination of HashMap and LinkedList.
// Time Complexity: O(1)
private object Solution1 {
    class LRUCache(private val capacity: Int) {
        private val map = mutableMapOf<Int, CacheItem>()

        private var head: CacheItem? = null
        private var tail: CacheItem? = null

        val size get() = map.size

        fun put(key: Int, value: String) {
            // Check if node exits
            val existingCacheItem = map[key]

            if (existingCacheItem == null) {
                // Check Map capacity
                if (map.size >= capacity) {
                    val removedNode = removeHead()
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

        private fun addTail(cacheItem: CacheItem) {
            // If list is empty
            if (head == null) {
                head = cacheItem
            } else {
                cacheItem.prev = tail
                tail?.next = cacheItem
            }

            tail = cacheItem
        }

        private fun removeHead(): CacheItem? {
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

        fun get(key: Int): String? {
            // Get the node
            val node = map[key]

            // Move to tail if exists
            if (node != null) {
                moveToTail(node)
            }

            // Return value
            return node?.value
        }

        private fun moveToTail(cacheItem: CacheItem) {
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

        private data class CacheItem(
            val key: Int,
            var value: String,
            var prev: CacheItem? = null,
            var next: CacheItem? = null,
        )
    }
}

// Implementation using LinkedHashMap
// Time Complexity: O(1)
private object Solution2 {
    class LRUCache(private val capacity: Int) {
        val size get() = linkedHashMap.size

        private val linkedHashMap = object :
            LinkedHashMap<Int, String>(capacity, 0.75f, true) {
            override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, String>?): Boolean {
                return size > capacity
            }
        }

        fun put(key: Int, value: String) {
            linkedHashMap[key] = value
        }

        fun get(key: Int): String? {
            return linkedHashMap[key]?.also {
                linkedHashMap.remove(key)
                linkedHashMap[key] = it
            }
        }
    }
}

// Implementation using List
// Time Complexity: O(n)
private object Solution3 {
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
    }
}
