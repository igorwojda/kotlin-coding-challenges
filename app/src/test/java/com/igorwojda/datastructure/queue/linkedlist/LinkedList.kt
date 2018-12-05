package com.igorwojda.datastructure.queue.linkedlist

import org.amshove.kluent.shouldEqual
import org.junit.Test

class LinkedList<E> {
    val head: Node<E>? = null
    val size: Int = 0

    val first: Node<E>? get() = head

    val last: Node<E>?
        get() {
            val node: Node? = null
            while ()
        }

    fun insertFirst(i: E) {
        TODO("not implemented")
    }

    fun insertLast(i: E) {
        TODO("not implemented")
    }

    fun removeFirst() {
        TODO("not implemented")
    }

    fun removeLast() {
        TODO("not implemented")
    }

    fun getAt(index: Int): Node<E>? {
        TODO("not implemented")
    }

    fun insertAt(data: E, index: Int) {
        TODO("not implemented")
    }

    fun removeAt(index: Int): Int {
        TODO("not implemented")
    }

    fun clear() {
    }
}

class Node<T>(
    val data: T,
    val next: Any
)

class LinkedListTest {
    @Test
    fun `has properties "data" and "next"`() {
        val node = Node("a", "b")
        node.data shouldEqual "a"
        node.next shouldEqual "b"
    }

    @Test
    fun `appends a node to the start of the list`() {
        LinkedList<Int>().apply {
            insertFirst(1)
            head?.data shouldEqual 1
            insertFirst(2)
            head?.data shouldEqual 2
        }
    }

    @Test
    fun `returns the number of items in the linked list`() {
        LinkedList<Int>().apply {
            size shouldEqual 0
            insertFirst(1)
            insertFirst(1)
            insertFirst(1)
            insertFirst(1)
            size shouldEqual 4
        }
    }

    @Test
    fun `returns the first element`() {
        LinkedList<Int>().apply {
            insertFirst(1)
            first.data shouldEqual 1
            insertFirst(2)
            first.data shouldEqual 2
        }
    }

    @Test
    fun `returns the last element`() {
        LinkedList<Int>().apply {
            insertFirst(2)
            last.data shouldEqual 2
            last.next shouldEqual null
            insertFirst(1)
            last.data shouldEqual 2
            last.next shouldEqual null
        }
    }

    @Test
    fun `empties out the list`() {
        LinkedList<Int>().apply {
            size shouldEqual 0
            insertFirst(1)
            insertFirst(1)
            insertFirst(1)
            insertFirst(1)
            size shouldEqual 4
            clear()
            size shouldEqual 0
        }
    }

    @Test
    fun `removes the first node when the list has a size of one`() {
        LinkedList<String>().apply {
            insertFirst("a")
            removeFirst()
            size shouldEqual 0
            first shouldEqual null
        }
    }

    @Test
    fun `removes the first node when the list has a size of three`() {
        LinkedList<String>().apply {
            insertFirst("c")
            insertFirst("b")
            insertFirst("a")
            removeFirst()
            size shouldEqual 2
            first.data shouldEqual "b"
            removeFirst()
            size shouldEqual 1
            first.data shouldEqual "c"
        }
    }

    @Test
    fun `RemoveLast removes the last node when list is empty`() {
        LinkedList<Any>().apply {
            removeLast()
        }
    }

    @Test
    fun `RemoveLast removes the last node when list is length 1`() {
        LinkedList<String>().apply {
            insertFirst("a")
            removeLast()
            head shouldEqual null
        }
    }

    @Test
    fun `RemoveLast removes the last node when list is length 2`() {
        LinkedList<String>().apply {
            insertFirst("b")
            insertFirst("a")
            removeLast()
            size shouldEqual 1
            head?.data shouldEqual "a"
        }
    }

    @Test
    fun `RemoveLast removes the last node when list is length 3`() {
        LinkedList<String>().apply {
            insertFirst("c")
            insertFirst("b")
            insertFirst("a")
            removeLast()
            size shouldEqual 2
            last.data shouldEqual "b"
        }
    }

    @Test
    fun `adds to the end of the list`() {
        LinkedList<String>().apply {
            insertFirst("a")

            insertLast("b")

            size shouldEqual 2
            last.data shouldEqual "b"
        }
    }

    @Test
    fun `returns the node at given index`() {
        LinkedList<Int>().apply {
            getAt(10) shouldEqual null

            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)

            getAt(0).data shouldEqual 1
            getAt(1).data shouldEqual 2
            getAt(2).data shouldEqual 3
            getAt(3).data shouldEqual 4
        }
    }

    @Test
    fun `removeAt doesnt crash on an empty list`() {
        LinkedList<Int>().apply {
            removeAt(0)
            removeAt(1)
            removeAt(2)
        }
    }

    @Test
    fun `removeAt doesnt crash on an index out of bounds`() {
        LinkedList<String>().apply {
            insertFirst("a")
            removeAt(1)
        }
    }

    @Test
    fun `removeAt deletes the first node`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)
            getAt(0).data shouldEqual 1
            removeAt(0)
            getAt(0).data shouldEqual 2
        }
    }

    @Test
    fun `removeAt deletes the node at the given index`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)
            getAt(1).data shouldEqual 2
            removeAt(1)
            getAt(1).data shouldEqual 3
        }
    }

    @Test
    fun `removeAt works on the last node`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)
            getAt(3).data shouldEqual 4
            removeAt(3)
            getAt(3) shouldEqual null
        }
    }

    @Test
    fun `inserts a new node with data at the 0 index when the list is empty`() {
        LinkedList<String>().apply {
            insertAt("hi", 0)
            first.data shouldEqual "hi"
        }
    }

    @Test
    fun `inserts a new node with data at the 0 index when the list has elements`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertLast("c")
            insertAt("hi", 0)
            getAt(0).data shouldEqual "hi"
            getAt(1).data shouldEqual "a"
            getAt(2).data shouldEqual "b"
            getAt(3).data shouldEqual "c"
        }
    }

    @Test
    fun `inserts a new node with data at a middle index`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertLast("c")
            insertLast("d")
            insertAt("hi", 2)
            getAt(0).data shouldEqual "a"
            getAt(1).data shouldEqual "b"
            getAt(2).data shouldEqual "hi"
            getAt(3).data shouldEqual "c"
            getAt(4).data shouldEqual "d"
        }
    }

    @Test
    fun `inserts a new node with data at a last index`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertAt("hi", 2)
            getAt(0).data shouldEqual "a"
            getAt(1).data shouldEqual "b"
            getAt(2).data shouldEqual "hi"
        }
    }

    @Test
    fun `insert a new node when index is out of bounds`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertAt("hi", 30)

            getAt(0).data shouldEqual "a"
            getAt(1).data shouldEqual "b"
            getAt(2).data shouldEqual "hi"
        }
    }

    @Test
    fun `applies a transform to each node`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)

//            forEach(node => {
//                node.data += 10
//            }

            getAt(0).data shouldEqual 11
            getAt(1).data shouldEqual 12
            getAt(2).data shouldEqual 13
            getAt(3).data shouldEqual 14
        }
    }

    @Test
    fun `works with the linked list`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)

            //        for (let node of l) {
//            node.data += 10
//        }

            getAt(0).data shouldEqual 11
            getAt(1).data shouldEqual 12
            getAt(2).data shouldEqual 13
            getAt(3).data shouldEqual 14
        }
    }

//    @Test
//    fun `for...of works on an empty list`() {
//        LinkedList().apply { }
//            for (let node of l) {
//        }
//    }
}

