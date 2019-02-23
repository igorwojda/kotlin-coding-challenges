package com.igorwojda.queue.twostack

import com.igorwojda.queue.int.IntStackSolution.IntStack
import org.amshove.kluent.shouldEqual
import org.junit.Test

private class TwoStackQueue {
    val stackPrimary = IntStack()

    val stackTemporary = IntStack()

    fun add(element: Int) {
        TODO("not implemented")
    }

    fun remove(): Int? = TODO("not implemented")

    fun peek(): Int? = TODO("not implemented")

    fun isEmpty(): Boolean {
        TODO("not implemented")
    }
}

class TwoStackQueueTest {
    @Test
    fun `can add elements to a queue`() {
        TwoStackQueue().apply { add(1) }
    }

    @Test
    fun `can remove elements from empty queue`() {
        TwoStackQueue().apply { remove() shouldEqual null }
    }

    @Test
    fun `can remove elements from a queue`() {
        TwoStackQueue().apply {
            add(1)
            remove()
        }
    }

    @Test
    fun `order of elements is maintained`() {
        TwoStackQueue().apply {
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
        TwoStackQueue().apply {
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
