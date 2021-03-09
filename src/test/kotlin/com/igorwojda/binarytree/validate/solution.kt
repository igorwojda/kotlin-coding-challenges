package com.igorwojda.binarytree.validate

private object Solution1 {
    private fun isValidSearchBinaryTree(node: Node<Int>, min: Int? = null, max: Int? = null): Boolean {
        if (min != null && node.data < min) {
            return false
        }

        if (max != null && node.data > max) {
            return false
        }

        val leftNode = node.left
        if (leftNode != null) {
            return isValidSearchBinaryTree(leftNode, min, node.data)
        }

        val rightNode = node.right
        if (rightNode != null) {
            return isValidSearchBinaryTree(rightNode, node.data, max)
        }

        return true
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
