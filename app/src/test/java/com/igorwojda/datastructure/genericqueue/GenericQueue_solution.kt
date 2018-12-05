package com.igorwojda.datastructure.genericqueue

private class QueueSolution<E> {
    private val list = mutableListOf<E>()

    fun add(element: E) {
        list.add(element)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(0)

    fun peek() = list.firstOrNull()
}
