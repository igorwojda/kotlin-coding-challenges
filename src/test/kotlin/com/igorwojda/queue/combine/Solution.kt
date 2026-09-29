package com.igorwojda.queue.combine

// Time complexity: O(n^2 + m^2) - n, m are q1, q2 sizes, list removeAt(0) is O(n)
// Space complexity: O(n + m)
private object Solution1 {
    class Queue<E> {
        private val list = mutableListOf<E>()

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()
    }

    fun combine(
        q1: Queue<*>,
        q2: Queue<*>,
    ): Queue<*> {
        val result = Queue<Any>()

        while (true) {
            q1.remove()?.let { result.add(it) }
            q2.remove()?.let { result.add(it) }

            if (q1.peek() == null && q2.peek() == null) {
                break
            }
        }

        return result
    }
}

private object KtLintWillNotComplain
