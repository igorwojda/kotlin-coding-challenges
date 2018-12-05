package com.igorwojda.datastructure.queue.weave

private object WaveSolution {
    class GenericQueue<E> {
        private val list = mutableListOf<E>()

        fun add(element: E) {
            list.add(element)
        }

        fun remove() = if (list.isEmpty()) null else list.removeAt(0)

        fun peek() = list.firstOrNull()
    }

    fun weave(q1: GenericQueue<*>, q2: GenericQueue<*>): GenericQueue<*> {
        val result = GenericQueue<Any>()

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
