package com.igorwojda.stack.basic

/*
LinkedList based implementation

Time complexity:
Insertion: O(1)
Removal: O(1)
Searching: O(n)
Access: O(n)
*/
private object Solution1 {
    private class Stack<E> {
        private var first: Node<E>? = null

        var size = 0
            private set

        fun add(element: E) {
            val node = Node(element)

            if (first == null) {
                first = node
            } else {
                node.next = first
                first = node
            }

            size++
        }

        fun remove(): E? {
            if (size == 0) return null

            val node = first
            first = first?.next
            size--
            return node?.data
        }

        fun peek(): E? = first?.data

        fun isEmpty() = first == null
    }

    private data class Node<E>(val data: E, var next: Node<E>? = null)
}

/*
List based implementation

It's important to notice that we should add new element to the end of the list, because adding to the
beginning is expensive (all subsequent items have to be re-indexed):

Option A - add to the end, remove from the beginning:
Insert at the end O(1)
Remove at the end O(1)

Option B - add to the beginning, remove from the end:
Bad idea to add elements at the beginning:
Insert at the beginning O(n)
Remove at the beginning O(n) - we have to re-index all the other elements in the list

Solution time complexity:
Insertion: O(1)
Removal: O(1)
Searching: O(n)
Access: O(n)
*/
private object Solution2 {
    private class Stack<E> {
        private val list = mutableListOf<E>()

        val size get() = list.size

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(list.lastIndex)

        fun peek() = list.lastOrNull()

        fun isEmpty() = list.isEmpty()
    }
}
