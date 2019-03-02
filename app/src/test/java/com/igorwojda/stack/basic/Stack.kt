package com.igorwojda.stack.basic

import org.amshove.kluent.shouldEqual
import org.junit.Test
import java.util.Stack

private class GenericStack<E> {
    val size: Int = TODO("not implemented")

    fun push(element: E) {
        TODO("not implemented")
    }

    fun pop(): E? {
        TODO("not implemented")
    }

    fun peek(): E? {
        TODO("not implemented")
    }

    fun isEmpty(): Boolean {
        TODO("not implemented")
    }
}

class StackTest {
    @Test
    fun `stack can add and remove items`() {
        Stack<Int>().apply {
            push(1)
            pop() shouldEqual 1
            push(2)
            pop() shouldEqual 2
        }
    }

    @Test
    fun `stack can follows first in, last out`() {
        Stack<Int>().apply {
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
        Stack<Char>().apply {
            push('A')
            push('B')
            push('C')
            peek() shouldEqual 'C'
            pop() shouldEqual 'C'
            peek() shouldEqual 'B'
            pop() shouldEqual 'B'
            peek() shouldEqual 'A'
            pop() shouldEqual 'A'
            peek() shouldEqual null
            pop() shouldEqual null
        }
    }

    @Test
    fun `newly created stack is empty`() {
        Stack<Char>().apply {
            isEmpty() shouldEqual true
        }
    }

    @Test
    fun `stack is empty after removing all items`() {
        Stack<Char>().apply {
            push('A')
            push('B')
            push('C')
            peek()
            pop()
            peek()
            pop()
            peek()
            pop()

            isEmpty() shouldEqual true
        }
    }

    @Test
    fun `stack with items is not empty`() {
        Stack<Char>().apply {
            push('A')
            isEmpty() shouldEqual false
            push('B')
            isEmpty() shouldEqual false
            push('C')
            isEmpty() shouldEqual false
        }
    }

    @Test
    fun `stack has correct size`() {
        Stack<Char>().apply {
            size shouldEqual 0

            push('A')
            size shouldEqual 1

            push('B')
            size shouldEqual 2

            push('C')
            size shouldEqual 3

            pop()
            size shouldEqual 2

            pop()
            size shouldEqual 1

            pop()
            size shouldEqual 0
        }
    }
}
