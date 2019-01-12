package com.igorwojda.queue.int

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class IntQueue {
    fun add(i: Int) {
    }

    fun remove(): Int? = 0

    fun peek(): Int? = 0

    fun isEmpty(): Boolean = false
}

class IntQueueTest {
    @Test
    fun `can add elements to a queue`() {
        IntQueue().apply { add(1) }
    }

    @Test
    fun `can remove elements from empty queue`() {
        IntQueue().apply { remove() shouldEqual null }
    }

    @Test
    fun `can remove elements from a queue`() {
        IntQueue().apply {
            add(1)
            remove()
        }
    }

    @Test
    fun `order of elements is maintained`() {
        IntQueue().apply {
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
        IntQueue().apply {
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
        IntQueue().isEmpty() shouldEqual true
    }

    @Test
    fun `isEmpty returns false`() {
        IntQueue().apply {
            add(1)
            isEmpty() shouldEqual false
        }
    }
}
