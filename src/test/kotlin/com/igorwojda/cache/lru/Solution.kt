package com.igorwojda.cache.lru

// Implementation is using  combination of HashMap and LinkedList.
// Time Complexity: O(1)
private object Solution1 {
    class LRUCache(private val capacity: Int) {
        private val map = HashMap<Int, Node>()
        val size get() = map.size

        private var head: Node? = null
        private var end: Node? = null

        fun get(key: Int): String? {
            val node = map[key]
            return if (node != null) {
                remove(node)
                setHead(node)
                node.value
            } else {
                null
            }
        }

        fun put(key: Int, value: String) {
            if (map.containsKey(key)) {
                val old = map[key]
                old?.value = value
                remove(old)
                setHead(old)
            } else {
                val created = Node(key, value)
                if (map.size >= capacity) {
                    map.remove(end?.key)
                    remove(end)
                }
                setHead(created)
                map[key] = created
            }
        }

        private fun setHead(node: Node?) {
            node?.next = head
            node?.prev = null
            if (head != null) head?.prev = node
            head = node
            if (end == null) end = head
        }

        private fun remove(node: Node?) {
            if (node?.prev != null) {
                node.prev?.next = node.next
            } else {
                head = node?.next
            }
            if (node?.next != null) {
                node.next?.prev = node.prev
            } else {
                end = node?.prev
            }
        }

        fun clear() {
            map.clear()
            head = null
            end = null
        }

        data class Node(var key: Int, var value: String) {
            var prev: Node? = null
            var next: Node? = null
        }
    }
}

// Implementation using LinkedHashMap
// Time Complexity: O(1)
private object Solution2 {
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

// Implementation using List
// Time Complexity: O(n)
private object Solution3 {
    class LRUCache(private val capacity: Int) {
        private val list = mutableListOf<Pair<Int, String>>()

        val size get() = list.size

        fun get(key: Int): String? {
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
}
