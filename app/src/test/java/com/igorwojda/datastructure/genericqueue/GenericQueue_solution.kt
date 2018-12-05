package com.igorwojda.datastructure.genericqueue

private class QueueSolution {
    private val list = mutableListOf<Int>()

    fun add(i: Int) {
        list.add(i)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(0)
}
