package com.igorwojda.cache.lru

// Time Complexity: O(1)
// Implementation is using Java LinkedHashMap
private object Solution1 {
    class LRUCache(capacity: Int) {
        private val internalCache = object : LinkedHashMap<Int, String>() {
            override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, String>?): Boolean {
                return size > capacity
            }
        }

        val size get() = internalCache.size

        fun put(key: Int, value: String) {
            internalCache[key] = value
        }

        fun get(key: Int) = internalCache[key]

        fun remove(key: Int) {
            internalCache.remove(key)
        }

        fun clear() {
            internalCache.clear()
        }
    }
}

// Time Complexity: O(n)
// Implementation is using Java LinkedHashMap
private object Solution2 {
    class LRUCache(private val capacity: Int) : LinkedHashMap<Int, String>(capacity) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, String>?): Boolean {
            return size > capacity
        }
    }
}

// Time Complexity: O(n)
private object Solution3 {
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
}
