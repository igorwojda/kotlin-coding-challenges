package com.igorwojda.datastructure.genericqueue

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class GenericQueue<E> {
    private val list = mutableListOf<E>()

    fun add(element: E) {
        list.add(element)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(0)
}

class GenericQueueTest {
    @Test
    fun `can add elements to a queue`() {
        val q = GenericQueue<Int>()
        q.add(1)
    }

    @Test
    fun `can remove elements from empty queue`() {
        val q = GenericQueue<Int>()
        q.remove() shouldEqual null
    }

    @Test
    fun `can remove elements from a queue`() {
        val q = GenericQueue<String>()
        q.add("ABC")
        q.remove()
    }

    @Test
    fun `order of elements is maintained`() {
        val q = GenericQueue<Char>()
        q.add('A')
        q.add('B')
        q.add('C')
        q.remove() shouldEqual 'A'
        q.remove() shouldEqual 'B'
        q.remove() shouldEqual 'C'
        q.remove() shouldEqual null
    }
}
