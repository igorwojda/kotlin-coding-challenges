package com.igorwojda.datastructure.queue.int

private object IntQueueSolution {
    private class IntQueue {
        private val list = mutableListOf<Int>()

        fun add(i: Int) {
            list.add(i)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()

        fun isEmpty() = list.isEmpty()
    }
}
