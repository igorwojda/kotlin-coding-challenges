package com.igorwojda.tree.classic.traversal

private object Solution1 {
    private class BinarySearchTree<E : Comparable<E>> {
        var root: BinaryNode<E>? = null
            private set

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

        fun traverseDepthFirstPreOrder(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return listOf(node.data) + traverse(node.left) + traverse(node.right)
            }

            return traverse(root)
        }

        fun traverseDepthFirstInOrder(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return traverse(node.left) + listOf(node.data) + traverse(node.right)
            }

            return traverse(root)
        }

        fun traverseDepthFirstPostOrder(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return traverse(node.left) + traverse(node.right) + listOf(node.data)
            }

            return traverse(root)
        }

        fun traverseDepthFirstPreOrderReversed(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return listOf(node.data) + traverse(node.right) + traverse(node.left)
            }

            return traverse(root)
        }

        fun traverseDepthFirstInOrderReversed(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return traverse(node.right) + listOf(node.data) + traverse(node.left)
            }

            return traverse(root)
        }

        fun traverseDepthFirstPostOrderReverse(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return traverse(node.right) + traverse(node.left) + listOf(node.data)
            }

            return traverse(root)
        }
    }

    private data class BinaryNode<E : Comparable<E>>(
        val data: E,
        var left: BinaryNode<E>? = null,
        var right: BinaryNode<E>? = null
    )

    /*
    We can use queue as helper class to implement breath first traversal. This is not most optimal queue implementation,
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
