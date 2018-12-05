package com.igorwojda.datastructure.queue.int

private object IntStackSolution {
    private class IntStack {
        val list = mutableListOf<Int>()

        fun push(element: Int) {
            list.add(element)
        }

        fun pop() = if (list.isEmpty()) null else list.removeAt(list.lastIndex)

        fun peek() = list.lastOrNull()
    }
}
