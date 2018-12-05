package com.igorwojda.datastructure.genericqueue

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class GenericQueue<E> {
    fun add(element: E) {}

    fun remove() = 0

    fun peek() = 0
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

    @Test
    fun `peek returns, but does not remove element`() {
        val q = GenericQueue<Int>()
        q.add(1)
        q.add(2)
        q.peek() shouldEqual 1
        q.peek() shouldEqual 1
        q.remove() shouldEqual 1
        q.peek() shouldEqual 2
        q.remove() shouldEqual 2
        q.peek() shouldEqual null
        q.remove() shouldEqual null
    }
}
