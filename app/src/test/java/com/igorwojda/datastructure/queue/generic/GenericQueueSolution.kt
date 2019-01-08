package com.igorwojda.datastructure.queue.generic

private object GenericQueueSolution {
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
