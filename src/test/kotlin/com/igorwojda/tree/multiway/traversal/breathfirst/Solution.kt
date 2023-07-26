package com.igorwojda.tree.multiway.traversal.breathfirst

private object Solution1 {
    private class BinarySearchTree<E : Comparable<E>> {
        var root: BinaryNode<E>? = null
            private set

        fun traverseBreathFirst(): List<E> {
            val queue = Queue<BinaryNode<E>>()
            val result = mutableListOf<E>()

            if (isEmpty()) {
                return result
            } else {
                root?.let { queue.add(it) }
            }

            while (queue.isNotEmpty()) {
                val current = queue.remove() ?: break

                result.add(current.data)

                current.left?.let { queue.add(it) }
                current.right?.let { queue.add(it) }
            }

            return result
        }

        fun add(element: E) {
            val newNode = BinaryNode(element)

            if (root == null) {
                root = newNode
                return
            }

            var current: BinaryNode<E> = root ?: return

            while (true) {
                when {
                    current.data == element -> {
                        return
                    }
                    element < current.data -> {
                        if (current.left == null) {
                            current.left = newNode
                            return
                        }

                        current.left?.let { current = it }
                    }
                    element > current.data -> {
                        if (current.right == null) {
                            current.right = newNode
                            return
                        }

                        current.right?.let { current = it }
                    }
                }
            }
        }

        fun contains(element: E): Boolean {
            var current = root

            while (true) {
                if (current == null) {
                    break
                } else if (current.data == element) {
                    return true
                } else if (element < current.data) {
                    current = current.left
                } else if (element > current.data) {
                    current = current.right
                }
            }

            return false
        }

        fun isEmpty() = root == null
    }

    private data class BinaryNode<E : Comparable<E>>(
        val data: E,
        var left: BinaryNode<E>? = null,
        var right: BinaryNode<E>? = null,
    )

    /*
    Queue can be used as helper class to implement breath first traversal. This is not the most optimal queue implementation,
    however it's enough for this task. Check "Queue challenge" solution for more details and more efficient queue
    implementation.
    */
    private class Queue<E> {
        private val list = mutableListOf<E>()

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()

        fun isEmpty() = list.isEmpty()

        fun isNotEmpty() = list.isNotEmpty()

        val size get() = list.size
    }
}

private object KtLintWillNotComplain
