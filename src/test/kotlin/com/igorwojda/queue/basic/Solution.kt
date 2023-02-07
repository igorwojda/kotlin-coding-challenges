package com.igorwojda.queue.basic

/*
Linked List based implementation

Time complexity:
Insertion: O(1)
Removal: O(1)
Searching: O(n)
Access: O(n)
*/
private object Solution1 {
    private class Queue<E> {
        var size = 0
            private set

        private var first: Node<E>? = null
        private var last: Node<E>? = null

        fun add(element: E) {
            val node = Node(element)

            if (first == null) {
                first = node
            } else {
                last?.next = node
            }

            size++
            last = node
        }

        fun remove(): E? {
            if (size == 0) return null

            val node = first
            first = node?.next
            size--
            return node?.data
        }

        fun peek() = first?.data

        fun isEmpty() = first == null
    }

    private data class Node<E>(val data: E, var next: Node<E>? = null)
}

/*
List based implementation

It's important to notice that adding element to the beginning of the array or removing element from the beginning is
expensive operation (all subsequent items have to be re-indexed):

Option A - add to the end, remove from the beginning:
Insert at the end O(1)
Remove at the end O(1)

Option B - add to the beginning, remove from the end:
Bad idea to add elements at the beginning:
Insert at the beginning O(n)
Remove at the beginning O(n) - we have to re-index all the other elements in the list

If we would add new element to the beginning of the list (expensive), we would have to remove them from the end of the
list (cheap). If we would add new element to the end of the array (cheap) we would have to remove ti from the
beginning (expensive). Because of that the list based implementation can't be efficient. We could use linked list
based implementation instead.


Time complexity (add at the beginning and remove from the end):
Insertion: O(n)
Removal: O(1)
Searching: O(n)
Access: O(n)

Solution time complexity (add at the end and remove from the beginning):
Insertion: O(1)
Removal: O(n)
Searching: O(n)
Access: O(n)
*/
private object Solution2 {
    private class Queue<E> {
        private val list = mutableListOf<E>()

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()

        fun isEmpty() = list.isEmpty()

        val size get() = list.size
    }
}

// Two Stack based implementation
private object Solution3 {
    private class Queue<E> {
        val primaryStack = Stack<E>()
        val temporaryStack = Stack<E>()

        val size get() = primaryStack.size

        fun add(element: E) {
            primaryStack.add(element)
            val a = 2
        }

        fun remove(): E? {
            moveElementsToTemporaryStack()
            val result = temporaryStack.remove()
            moveElementsToPrimaryStack()
            return result
        }

        fun peek(): E? {
            moveElementsToTemporaryStack()
            val result = temporaryStack.peek()
            moveElementsToPrimaryStack()

            return result
        }

        private fun moveElementsToTemporaryStack() {
            while (primaryStack.peek() != null) {
                primaryStack.remove()?.let { temporaryStack.add(it) }
            }
        }

        private fun moveElementsToPrimaryStack() {
            while (temporaryStack.peek() != null) {
                temporaryStack.remove()?.let { primaryStack.add(it) }
            }
        }

        fun isEmpty() = primaryStack.isEmpty()
    }

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
