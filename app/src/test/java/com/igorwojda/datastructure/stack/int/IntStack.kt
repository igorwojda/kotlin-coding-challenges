package com.igorwojda.datastructure.queue.int

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class IntStack {
    val list = mutableListOf<Int>()

    fun push(element: Int) {}

    fun pop() = 0

    fun peek() = 0
}

class IntStackTest {
    @Test
    fun `stack can add and remove items`() {
        IntStack().apply {
            push(1)
            pop() shouldEqual 1
            push(2)
            pop() shouldEqual 2
        }
    }

    @Test
    fun `stack can follows first in, last out`() {
        IntStack().apply {
            push(1)
            push(2)
            push(3)
            pop() shouldEqual 3
            pop() shouldEqual 2
            pop() shouldEqual 1
        }
    }

    @Test
    fun `peek returns the first element but does not pop it`() {
        IntStack().apply {
            push(1)
            push(2)
            push(3)
            peek() shouldEqual 3
            pop() shouldEqual 3
            peek() shouldEqual 2
            pop() shouldEqual 2
            peek() shouldEqual 1
            pop() shouldEqual 1
        }
    }
}
