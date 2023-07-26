package com.igorwojda.tree.multiway.traversal.depthfirst

private object Solution1 {
    private fun traverseDepthFirstPreOrder(tree: BinarySearchTree<Char>): List<Char> {
        val result = mutableListOf<Char>()
        val stack = Stack<BinaryNode<Char>>()

        tree.root?.let { stack.add(it) }

        while (stack.isNotEmpty()) {
            val node = stack.remove()
            node?.let {
                result.add(it.data)

                it.right?.let { rightNode -> stack.add(rightNode) }
                it.left?.let { leftNode -> stack.add(leftNode) }
            }
        }

        return result
    }

    private fun traverseDepthFirstInOrder(tree: BinarySearchTree<Char>): List<Char> {
        val result = mutableListOf<Char>()
        val stack = Stack<BinaryNode<Char>>()

        var current = tree.root
        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.add(current)
                current = current.left
            }

            current = stack.remove()
            current?.let {
                result.add(it.data)
                current = it.right
            }
        }

        return result
    }

    private fun traverseDepthFirstPostOrder(tree: BinarySearchTree<Char>): List<Char> {
        val result = mutableListOf<Char>()
        val stack = Stack<BinaryNode<Char>>()

        tree.root?.let { stack.add(it) }

        while (stack.isNotEmpty()) {
            val node = stack.peek()
            if (node?.left == null && node?.right == null) {
                val visitedNode = stack.remove()
                visitedNode?.let { result.add(it.data) }
            } else {
                node.right?.let { stack.add(it) }
                node.right = null

                node.left?.let { stack.add(it) }
                node.left = null
            }
        }

        return result
    }

    private fun traverseDepthFirstPreOrderReversed(tree: BinarySearchTree<Char>): List<Char> {
        val result = mutableListOf<Char>()
        val stack = Stack<BinaryNode<Char>>()

        tree.root?.let { stack.add(it) }

        while (stack.isNotEmpty()) {
            val node = stack.remove()
            node?.let {
                result.add(it.data)

                it.left?.let { leftNode -> stack.add(leftNode) }
                it.right?.let { rightNode -> stack.add(rightNode) }
            }
        }

        return result
    }

    private fun traverseDepthFirstInOrderReversed(tree: BinarySearchTree<Char>): List<Char> {
        val result = mutableListOf<Char>()
        val stack = Stack<BinaryNode<Char>>()

        var current = tree.root
        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.add(current)
                current = current.right
            }

            current = stack.remove()
            current?.let {
                result.add(it.data)
                current = it.left
            }
        }

        return result
    }

    private fun traverseDepthFirstPostOrderReversed(tree: BinarySearchTree<Char>): List<Char> {
        val result = mutableListOf<Char>()
        val stack = Stack<BinaryNode<Char>>()

        tree.root?.let { stack.add(it) }

        while (stack.isNotEmpty()) {
            val node = stack.peek()
            if (node?.left == null && node?.right == null) {
                val visitedNode = stack.remove()
                visitedNode?.let { result.add(it.data) }
            } else {
                node.left?.let { stack.add(it) }
                node.left = null

                node.right?.let { stack.add(it) }
                node.right = null
            }
        }

        return result
    }

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
    }

    private data class BinaryNode<E : Comparable<E>>(
        val data: E,
        var left: BinaryNode<E>? = null,
        var right: BinaryNode<E>? = null,
    )

    /*
    Stack can be used as helper class to implement depth first traversal. This is not the most optimal stack implementation,
    however it's enough for this task. Check "Stack challenge" solution for more details and more efficient stack
    implementation.
    */
    private class Stack<E> {
        private val list = mutableListOf<E>()

        val size get() = list.size

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(list.lastIndex)

        fun peek() = list.lastOrNull()

        fun isEmpty() = list.isEmpty()

        fun isNotEmpty() = list.isNotEmpty()
    }
}

// recursive solution
private object Solution2 {
    private class BinarySearchTree<E : Comparable<E>> {
        var root: BinaryNode<E>? = null
            private set

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

        fun traverseDepthFirstPostOrderReversed(): List<E> {
            fun traverse(node: BinaryNode<E>?): List<E> {
                if (node == null) {
                    return emptyList()
                }

                return traverse(node.right) + traverse(node.left) + listOf(node.data)
            }

            return traverse(root)
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
}
