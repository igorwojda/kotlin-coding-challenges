package com.igorwojda.datastructure.queue.twostack

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class TwoStackQueue {
    val stackPrimary = IntStack()
    val stackTemporary = IntStack()

    fun add(element: Int) {
    }

    fun remove(): Int? {
        return 0
    }

    fun peek(): Int? {
        return 0
    }
}

private class IntStack {
    val list = mutableListOf<Int>()

    fun push(element: Int) {
        list.add(element)
    }

    fun pop() = if (list.isEmpty()) null else list.removeAt(list.lastIndex)

    fun peek() = list.lastOrNull()
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
