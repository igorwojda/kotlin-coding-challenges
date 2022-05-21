package com.igorwojda.linkedlist.singly.base

object Solution1 {
    class SinglyLinkedList<E> : Iterable<Node<E>> {
        var head: Node<E>? = null

        val first: Node<E>?
            get() = getAt(0)

        val last: Node<E>?
            get() = getAt(size - 1)

        val size: Int
            get() {
                var count = 0
                var node = head

                while (node != null) {
                    count++
                    node = node.next
                }

                return count
            }

        fun insertFirst(data: E) {
            insertAt(data, 0)
        }

        fun insertLast(data: E) {
            insertAt(data, size)
        }

        fun insertAt(data: E, index: Int) {
            if (index == 0) {
                head = Node(data, head)
            } else {
                val prevNode = getAt(index - 1) ?: last
                val node = prevNode?.next
                prevNode?.next = Node(data, node)
            }
        }

        fun removeFirst() {
            removeAt(0)
        }

        fun removeLast() {
            removeAt(size - 1)
        }

        fun removeAt(index: Int) {
            if (index == 0) {
                head = head?.next
            } else {
                val prevNode = getAt(index - 1)
                val nextNode = prevNode?.next?.next
                prevNode?.next = nextNode
            }
        }

        fun setAt(data: E, index: Int) {
            getAt(index)?.data = data
        }

        fun getAt(index: Int): Node<E>? {
            if (head == null) {
                return null
            }

            var node = head
            var count = 0

            while (node != null) {
                if (count == index) {
                    return node
                }

                count++
                node = node.next
            }

            return null
        }

        fun clear() {
            head = null
        }

        override fun toString() = head.toString()

        override fun iterator() = object : Iterator<Node<E>> {
            var node = head
            override fun hasNext() = node != null

            override fun next(): Node<E> {
                val currentNode = node
                node = node?.next
                return currentNode!!
            }
        }

        operator fun plus(linkedList: SinglyLinkedList<E>): SinglyLinkedList<E> {
            val result = SinglyLinkedList<E>()
            forEach { result.insertLast(it.data) }
            linkedList.forEach { result.insertLast(it.data) }
            return result
        }
    }

    data class Node<T>(
        var data: T,
        var next: Node<T>? = null
    )
}

object Solution2 {  // Just to be different with the implementation of ArrayDeque ;)
    class SinglyLinkedList<E> : Iterable<Node<E>> {
        private val deque: ArrayDeque<Node<E>> = ArrayDeque() // Kotlin standard library
        val head: Node<E>? get() = deque.firstOrNull()
        val size: Int get() = deque.size
        val first: Node<E>? get() = head
        val last: Node<E>? get() = deque.lastOrNull()
        fun setAt(e: E, index: Int) = if (index in deque.indices) deque.set(index, Node(e, deque[index].next)) else null
        fun getAt(index: Int): Node<E>? = deque.getOrNull(index)
        fun insertFirst(e: E) = insertAt(e, 0)
        fun insertLast(e: E) = insertAt(e, deque.size)
        fun removeFirst() = removeAt(0)
        fun removeLast() = removeAt(deque.lastIndex)
        fun clear() = deque.clear()
        inline fun sumBy(function: (Node<E>) -> Int): Int = sumOf(function)
        override fun iterator(): Iterator<Node<E>> = deque.iterator()
        operator fun plus(other: SinglyLinkedList<E>) = SinglyLinkedList<E>().also {
            this@SinglyLinkedList.forEach { insertLast(it.data) }
            other.forEach { insertLast(it.data) }
        }
        fun insertAt(e: E, index: Int) =
            deque.getOrNull(index)?.let {
                deque[index].let { deque.add(index, Node(e, it)) }
            } ?: deque.add(Node(e, null))
        fun removeAt(index: Int): Node<E>? =
            deque.getOrNull(index)?.let {
                deque.getOrNull(index - 1)
                    ?.let {
                        deque[index - 1] = deque.getOrNull(index + 1)
                            ?.let { deque[index - 1].copy(next = it) }
                            ?: let { deque[index - 1].copy(next = null) }
                        deque.removeAt(index)
                    }
                    ?: deque.removeFirst()
            }
    }
    data class Node<T>(
        var data: T,
        var next: Node<T>? = null
    )
}