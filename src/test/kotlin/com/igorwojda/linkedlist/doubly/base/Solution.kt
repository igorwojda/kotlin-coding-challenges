package com.igorwojda.linkedlist.doubly.base

object Solution1 {
    private class DoublyLinkedList<E> : Iterable<Node<E>> {
        var head: Node<E>? = null

        var first: Node<E>? = null
            get() = head

        val last: Node<E>?
            get() {
                var node = head

                while (node?.next != null) {
                    node = node.next
                }

                return node
            }

        val size: Int
            get() {
                var node = head
                var count = 0

                while (node != null) {
                    count++
                    node = node.next
                }

                return count
            }

        fun clear() {
            head = null
        }

        fun insertFirst(e: E) {
            insertAt(e, 0)
        }

        fun removeFirst() {
            head = head?.next
            head?.prev = null
        }

        override fun iterator() = object : Iterator<Node<E>> {
            var node = head
            override fun hasNext() = node != null

            override fun next(): Node<E> {
                val currentNode = node
                node = node?.next
                return currentNode!!
            }
        }

        fun removeLast() {
            if (head?.next == null) {
                head = null
            } else {
                last?.prev?.next = null
            }
        }

        fun insertLast(data: E) {
            var node = head

            while (node?.next != null) {
                node = node.next
            }

            val newNode = Node(data, node)

            if (node == null) {
                head = newNode
            } else {
                node.next = newNode
            }
        }

        fun insertAt(data: E, index: Int) {
            val newNode = Node(data)

            if (head == null || index == 0) {
                newNode.next = head
                head?.prev = newNode
                head = newNode
                return
            }

            var count = 0
            var node = head
            var prevNode: Node<E>? = null

            while (node != null) {
                if (count == index) {
                    break
                }

                count++
                prevNode = node
                node = node.next
            }

            val nextNode = prevNode?.next
            prevNode?.next = newNode
            newNode.prev = prevNode
            newNode.next = nextNode
            nextNode?.prev = newNode
        }

        fun getAt(index: Int): Node<E>? {
            var node = head
            var count = 0

            while (node != null) {
                if (count == index) {
                    return node
                }

                node = node.next
                count++
            }

            return null
        }

        fun setAt(data: E, index: Int) {
            getAt(index)?.data = data
        }

        fun removeAt(index: Int) {
            val node = getAt(index) ?: return
            val prevNode = node.prev
            val nextNode = node.next

            if (prevNode == null && nextNode == null) {
                head = null
            } else if (prevNode != null && nextNode != null) {
                prevNode.next = nextNode
                nextNode.prev = prevNode
            } else if (prevNode == null && nextNode != null) {
                head = nextNode
                nextNode.prev = null
                node.next = null
            } else if (prevNode != null && nextNode == null) {
                prevNode.next = null
                node.prev = null
            }
        }

        operator fun plus(linkedList: DoublyLinkedList<E>): DoublyLinkedList<E> {
            val result = DoublyLinkedList<E>()
            forEach { result.insertLast(it.data) }
            linkedList.forEach { result.insertLast(it.data) }
            return result
        }
    }

    private data class Node<T>(
        var data: T,
        var prev: Node<T>? = null,
        var next: Node<T>? = null
    )
}

private object KtLintWillNotComplain
