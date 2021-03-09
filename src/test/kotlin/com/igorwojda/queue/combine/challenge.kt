package com.igorwojda.queue.combine

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun combine(q1: Queue<*>, q2: Queue<*>): Queue<*> {
    TODO("not implemented")
}

private class Queue<E> {
    private val list = mutableListOf<E>()

    fun add(element: E) {
        list.add(element)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(0)

    fun peek() = list.firstOrNull()

    fun isEmpty() = list.isEmpty()
}

private class Test {
    @Test
    fun `can add elements to a queue`() {
        Queue<Int>().apply { add(1) }
    }

    @Test
    fun `can remove elements from empty queue`() {
        Queue<Int>().apply { remove() shouldBeEqualTo null }
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
            remove() shouldBeEqualTo 'A'
            remove() shouldBeEqualTo 'B'
            remove() shouldBeEqualTo 'C'
            remove() shouldBeEqualTo null
        }
    }

    @Test
    fun `peek returns, but does not remove element`() {
        Queue<Int>().apply {
            add(1)
            add(2)
            peek() shouldBeEqualTo 1
            peek() shouldBeEqualTo 1
            remove() shouldBeEqualTo 1
            peek() shouldBeEqualTo 2
            remove() shouldBeEqualTo 2
            peek() shouldBeEqualTo null
            remove() shouldBeEqualTo null
        }
    }

    @Test
    fun `weave can combine two queues wit the same length`() {
        val one = Queue<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(4)
        }

        val two = Queue<String>().apply {
            add("one")
            add("two")
            add("three")
            add("four")
        }

        combine(one, two).also {
            it.remove() shouldBeEqualTo 1
            it.remove() shouldBeEqualTo "one"
            it.remove() shouldBeEqualTo 2
            it.remove() shouldBeEqualTo "two"
            it.remove() shouldBeEqualTo 3
            it.remove() shouldBeEqualTo "three"
            it.remove() shouldBeEqualTo 4
            it.remove() shouldBeEqualTo "four"
            it.remove() shouldBeEqualTo null
        }
    }

    @Test
    fun `weave can combine two queues with different length - first queue is longer`() {
        val one = Queue<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(4)
            add(5)
            add(6)
        }

        val two = Queue<String>().apply {
            add("one")
            add("two")
            add("three")
            add("four")
        }

        combine(one, two).apply {
            remove() shouldBeEqualTo 1
            remove() shouldBeEqualTo "one"
            remove() shouldBeEqualTo 2
            remove() shouldBeEqualTo "two"
            remove() shouldBeEqualTo 3
            remove() shouldBeEqualTo "three"
            remove() shouldBeEqualTo 4
            remove() shouldBeEqualTo "four"
            remove() shouldBeEqualTo 5
            remove() shouldBeEqualTo 6
            remove() shouldBeEqualTo null
        }
    }

    @Test
    fun `weave can combine two queues with different length - second queue is longer`() {
        val one = Queue<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(4)
        }

        val two = Queue<String>().apply {
            add("one")
            add("two")
            add("three")
            add("four")
            add("five")
            add("six")
        }

        combine(one, two).apply {
            remove() shouldBeEqualTo 1
            remove() shouldBeEqualTo "one"
            remove() shouldBeEqualTo 2
            remove() shouldBeEqualTo "two"
            remove() shouldBeEqualTo 3
            remove() shouldBeEqualTo "three"
            remove() shouldBeEqualTo 4
            remove() shouldBeEqualTo "four"
            remove() shouldBeEqualTo "five"
            remove() shouldBeEqualTo "six"
            remove() shouldBeEqualTo null
        }
    }
}
