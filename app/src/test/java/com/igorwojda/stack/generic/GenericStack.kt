package com.igorwojda.stack.generic

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class GenericStack<E> {
    val list = mutableListOf<E>()

    fun push(element: E) {
        TODO("not implemented")
    }

    fun pop(): Int {
        TODO("not implemented")
    }

    fun peek(): Int {
        TODO("not implemented")
    }
}

class GenericIntStackTest {
    @Test
    fun `stack can add and remove items`() {
        GenericStack<Int>().apply {
            push(1)
            pop() shouldEqual 1
            push(2)
            pop() shouldEqual 2
        }
    }

    @Test
    fun `stack can follows first in, last out`() {
        GenericStack<Int>().apply {
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
        GenericStack<Char>().apply {
            push('A')
            push('B')
            push('C')
            peek() shouldEqual 'C'
            pop() shouldEqual 'C'
            peek() shouldEqual 'B'
            pop() shouldEqual 'B'
            peek() shouldEqual 'A'
            pop() shouldEqual 'A'
        }
    }
}
