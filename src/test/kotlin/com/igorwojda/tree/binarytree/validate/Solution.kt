package com.igorwojda.tree.binarytree.validate

private object Solution1 {
    private fun isValidSearchBinaryTree(node: Node<Int>, min: Int? = null, max: Int? = null): Boolean {
        if (min != null && node.data < min) {
            return false
        }
        if (max != null && node.data > max) {
            return false
        }

        return node.left?.let { isValidSearchBinaryTree(it, min, node.data) } ?: true &&
            node.right?.let { isValidSearchBinaryTree(it, node.data, max) } ?: true
    }

    private data class Node<E : Comparable<E>>(
        var data: E,
        var left: Node<E>? = null,
        var right: Node<E>? = null
    ) {
        fun insert(e: E) {
            if (e < data) { // left node
                if (left == null) {
                    left = Node(e)
                } else {
                    left?.insert(e)
                }
            } else if (e > data) { // right node
                if (right == null) {
                    right = Node(e)
                } else {
                    right?.insert(e)
                }
            }
        }
    }
}

private object KtLintWillNotComplain
