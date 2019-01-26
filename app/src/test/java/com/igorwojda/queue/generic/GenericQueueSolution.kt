package com.igorwojda.queue.generic

private object Solution {
    private class GenericQueue<E> {
        private val list = mutableListOf<E>()

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()

        fun isEmpty() = list.isEmpty()
    }
}

private object KtLintWillNotComplain
