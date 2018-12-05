package com.igorwojda.datastructure.weave

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun weave(q1: GenericQueue<*>, q2: GenericQueue<*>): GenericQueue<*> {
    return GenericQueue<Any>()
}

private class GenericQueue<E> {
    private val list = mutableListOf<E>()

    fun add(element: E) {
        list.add(element)
    }

    fun remove() = if (list.isEmpty()) null else list.removeAt(0)

    fun peek() = list.firstOrNull()
}

class WeaveTest {
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

    @Test
    fun `weave can combine two queues wit the same length`() {
        val one = GenericQueue<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(4)
        }

        val two = GenericQueue<String>().apply {
            add("one")
            add("two")
            add("three")
            add("four")
        }

        weave(one, two).also {
            it.remove() shouldEqual 1
            it.remove() shouldEqual "one"
            it.remove() shouldEqual 2
            it.remove() shouldEqual "two"
            it.remove() shouldEqual 3
            it.remove() shouldEqual "three"
            it.remove() shouldEqual 4
            it.remove() shouldEqual "four"
            it.remove() shouldEqual null
        }
    }

    @Test
    fun `weave can combine two queues with different length - first queue is longer`() {
        val one = GenericQueue<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(4)
            add(5)
            add(6)
        }

        val two = GenericQueue<String>().apply {
            add("one")
            add("two")
            add("three")
            add("four")
        }

        weave(one, two).apply {
            remove() shouldEqual 1
            remove() shouldEqual "one"
            remove() shouldEqual 2
            remove() shouldEqual "two"
            remove() shouldEqual 3
            remove() shouldEqual "three"
            remove() shouldEqual 4
            remove() shouldEqual "four"
            remove() shouldEqual 5
            remove() shouldEqual 6
            remove() shouldEqual null
        }
    }

    @Test
    fun `weave can combine two queues with different length - second queue is longer`() {
        val one = GenericQueue<Int>().apply {
            add(1)
            add(2)
            add(3)
            add(4)
        }

        val two = GenericQueue<String>().apply {
            add("one")
            add("two")
            add("three")
            add("four")
            add("five")
            add("six")
        }

        weave(one, two).apply {
            remove() shouldEqual 1
            remove() shouldEqual "one"
            remove() shouldEqual 2
            remove() shouldEqual "two"
            remove() shouldEqual 3
            remove() shouldEqual "three"
            remove() shouldEqual 4
            remove() shouldEqual "four"
            remove() shouldEqual "five"
            remove() shouldEqual "six"
            remove() shouldEqual null
        }
    }
}
