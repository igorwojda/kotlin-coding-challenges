package com.igorwojda.queue.combine

private object Solution1 {
    class Queue<E> {
        private val list = mutableListOf<E>()

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()
    }

    fun combine(q1: Queue<*>, q2: Queue<*>): Queue<*> {
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
