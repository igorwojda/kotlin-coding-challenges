package com.igorwojda.tree.binarytree.insert

private object Solution1 {
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

        fun contains(e: E): Boolean = when {
            e == data -> true
            e < data -> left?.contains(e) ?: false
            e > data -> right?.contains(e) ?: false
            else -> false
        }
    }
}

private object KtLintWillNotComplain
