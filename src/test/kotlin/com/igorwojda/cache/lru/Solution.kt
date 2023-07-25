package com.igorwojda.cache.lru

// Implementation is using  combination of HashMap and LinkedList.
// Time Complexity: O(1)
private object Solution1 {
    class LRUCache(private val capacity: Int) {
        private val map = HashMap<Int, Node>()

        private var head: Node? = null
        private var tail: Node? = null

        val size get() = map.size

        fun put(key: Int, value: String) {
            // 1. Check if node exicts
            val existingNode = map[key]

            if (existingNode == null) {
                // 2. Check Map capacity
                if (map.size >= capacity) {
                    val removedNode = removeHead()
                    map.remove(removedNode?.key)
                }

                // 3. Add a new node
                val newNode = Node(key, value)

                map[key] = newNode
                addTail(newNode)
            } else {
                existingNode.value = value
                moveToTail(existingNode)
            }
        }

        private fun addTail(node: Node) {
            // 1. If list is empty
            if (head == null) {
                head = node
            } else {
                node.prev = tail
                tail?.next = node
            }

            tail = node
        }

        private fun removeHead(): Node? {
            // 1. Head exists
            if (head != null) {
                // 2. Store current head to return
                val node = head

                // 3. Remove head
                head = head?.next
                head?.prev = null

                // 4. Remove tail if head is tail
                if (node == tail) tail = null

                return node
            }

            return null
        }

        fun get(key: Int): String? {
            // 1. get the node
            val node = map[key]

            // 2. Move to tail if exists
            if (node != null) {
                moveToTail(node)
            }

            // 3. Return value
            return node?.value
        }

        private fun moveToTail(node: Node) {
            // 1. Check if node is tail
            if (node != tail) {
                // 2. Remove node from list
                if (node == head) {
                    head = node.next
                } else {
                    node.prev?.next = node.next
                    node.next?.prev = node.prev
                }

                // 3. Add node to tail
                addTail(node)
            }
        }

        private data class Node(
            val key: Int,
            var value: String,
            var prev: Node? = null,
            var next: Node? = null,
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
