package com.igorwojda.datastructure.queue.classic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class Queue {
    fun add(i: Int) {
    }

    fun remove() = 0

    fun peek() = 0
}

class QueueTest {
    @Test
    fun `can add elements to a queue`() {
        Queue().apply { add(1) }
    }

    @Test
    fun `can remove elements from empty queue`() {
        Queue().apply { remove() shouldEqual null }
    }

    @Test
    fun `can remove elements from a queue`() {
        Queue().apply {
            add(1)
            remove()
        }
    }

    @Test
    fun `order of elements is maintained`() {
        Queue().apply {
            add(1)
            add(2)
            add(3)
            remove() shouldEqual 1
            remove() shouldEqual 2
            remove() shouldEqual 3
            remove() shouldEqual null
        }
    }

    @Test
    fun `peek returns, but does not remove element`() {
        Queue().apply {
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
