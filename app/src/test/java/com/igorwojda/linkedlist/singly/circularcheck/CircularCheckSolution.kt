package com.igorwojda.linkedlist.singly.circularcheck

private object Solution {
    private fun circularCheck(list: LinkedList<Char>): Boolean {
        var slowPointer = list.first
        var fastPointer = list.head

        while (fastPointer != null) {
            list.forEach {
                slowPointer = slowPointer?.next
                fastPointer = fastPointer?.next?.next

                if (fastPointer != null && slowPointer == fastPointer) {
                    return true
                }
            }
        }

        return false
    }

    private class LinkedList<E> : Iterable<Node<E>> {
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

        fun getAt(index: Int): Node<E>? {
            if (head == null) {
                return null
            }

            var node = head
            var counter = 0

            while (node != null) {
                if (counter == index) {
                    return node
                }

                counter++
                node = node.next
            }

            return null
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

        operator fun plus(linkedList: LinkedList<E>): LinkedList<E> {
            val result = LinkedList<E>()
            forEach { result.insertLast(it.data) }
            linkedList.forEach { result.insertLast(it.data) }
            return result
        }
    }

    private data class Node<T>(
        val data: T,
        var next: Node<T>? = null
    )
}

private object KtLintWillNotComplain
