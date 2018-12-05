package com.igorwojda.datastructure.queue

object QueueSolution {
    class Queue {
        private val list = mutableListOf<Int>()

        fun add(i: Int) {
            list.add(i)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()
    }
}
