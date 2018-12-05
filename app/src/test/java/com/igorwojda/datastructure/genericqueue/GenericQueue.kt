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
        GenericQueue<Int>().apply { add(1) }
    }

    @Test
    fun `can remove elements from empty queue`() {
        GenericQueue<Int>().apply { remove() shouldEqual null }
    }

    @Test
    fun `can remove elements from a queue`() {
        GenericQueue<String>().apply {
            add("ABC")
            remove()
        }
    }

    @Test
    fun `order of elements is maintained`() {
        GenericQueue<Char>().apply {
            add('A')
            add('B')
            add('C')
            remove() shouldEqual 'A'
            remove() shouldEqual 'B'
            remove() shouldEqual 'C'
            remove() shouldEqual null
        }
    }

    @Test
    fun `peek returns, but does not remove element`() {
        GenericQueue<Int>().apply {
            add(1)
            add(2)
            peek() shouldEqual 1
            peek() shouldEqual 1
            remove() shouldEqual 1
            peek() shouldEqual 2
            remove() shouldEqual 2
            peek() shouldEqual null
            remove() shouldEqual null
        }
    }
}
