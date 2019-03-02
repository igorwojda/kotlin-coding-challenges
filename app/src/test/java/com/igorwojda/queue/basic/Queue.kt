package com.igorwojda.queue.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class Queue<E> {
    var size = 0
        private set

    fun add(element: E) {
        TODO("not implemented")
    }

    fun remove(): E? = TODO("not implemented")

    fun peek(): E? = TODO("not implemented")

    fun isEmpty(): Boolean {
        TODO("not implemented")
    }
}

class QueueTest {
    @Test
    fun `can add elements to a queue`() {
        Queue<Int>().apply { add(1) }
    }

    @Test
    fun `can remove elements from empty queue`() {
        Queue<Int>().apply { remove() shouldEqual null }
    }

    @Test
    fun `can remove elements from a queue`() {
        Queue<String>().apply {
            add("ABC")
            remove()
        }
    }

    @Test
    fun `order of elements is maintained`() {
        Queue<Char>().apply {
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
        Queue<Int>().apply {
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

    @Test
    fun `isEmpty returns true`() {
        Queue<Int>().isEmpty() shouldEqual true
    }

    @Test
    fun `isEmpty returns false`() {
        Queue<Int>().apply {
            add(1)
            isEmpty() shouldEqual false
        }
    }

    @Test
    fun `queue has correct size`() {
        Queue<Char>().apply {
            size shouldEqual 0

            add('A')
            size shouldEqual 1

            add('B')
            size shouldEqual 2

            add('C')
            size shouldEqual 3

            remove()
            size shouldEqual 2

            remove()
            size shouldEqual 1

            remove()
            size shouldEqual 0
        }
    }
}
