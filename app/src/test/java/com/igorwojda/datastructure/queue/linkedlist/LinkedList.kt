package com.igorwojda.datastructure.queue.linkedlist

import org.amshove.kluent.shouldEqual
import org.junit.Test

class LinkedList<E> {
    var head: Node<E>? = null
    val first: Node<E>?
        get() = head

    val size: Int
        get() {
            var count = 0
            var node = head

            while (node != null) {
                count++
                node = node.next
            }

            return count
        }

    var last: Node<E>? = null
        get() {
            var node = head

            while (node?.next != null) {
                node = node.next
            }

            return node
        }

    fun insertFirst(data: E) {
        head = Node(data, head)
    }

    fun clear() {
        head = null
    }

    fun removeFirst() {
        head = head?.next
    }

    fun removeLast() {
        if (head?.next == null) {
            head = null
            return
        }

        var prevNode = head
        var node = head?.next

        while (node?.next != null) {
            prevNode = node
            node = node.next
        }

        prevNode?.next = null
    }

    fun insertLast(data: E) {
        Node(data).also {
            if (head == null) {
                head = it
            } else {
                last?.next = it
            }
        }
    }

    fun getAt(index: Int): Node<E>? {
        if (head == null) {
            return null
        }

        var node = head
        var counter = 0

        while (node != null) {
            if (counter == index) {
                return node
            }

            counter++
            node = node.next
        }

        return null
    }

    fun removeAt(index: Int) {
        if (index == 0) {
            head = head?.next
        } else {
            val prevNode = getAt(index - 1)
            val nextNode = prevNode?.next?.next
            prevNode?.next = nextNode
        }
    }

    fun insertAt(data: E, index: Int) {
        if (index == 0) {
            head = Node(data, head)
        } else {
            val prevNode = getAt(index - 1) ?: last
            val node = prevNode?.next
            prevNode?.next = Node(data, node)
        }
    }

    override fun toString() = head?.toString() ?: "null"
}

data class Node<T>(
    val data: T,
    var next: Node<T>? = null
)

class LinkedListTest {
    @Test
    fun `when list is created head node is null`() {
        LinkedList<Int>().apply {
            head shouldEqual null
        }
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
            first?.data shouldEqual 1
            insertFirst(2)
            first?.data shouldEqual 2
        }
    }

    @Test
    fun `returns the last element`() {
        LinkedList<Int>().apply {
            insertFirst(2)
            last?.data shouldEqual 2
            last?.next shouldEqual null
            insertFirst(1)
            last?.data shouldEqual 2
            last?.next shouldEqual null
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
            first?.data shouldEqual "b"
            removeFirst()
            size shouldEqual 1
            first?.data shouldEqual "c"
        }
    }

    @Test
    fun `removeLast removes the last node when list is empty`() {
        LinkedList<Any>().apply {
            removeLast()
        }
    }

    @Test
    fun `removeLast removes the last node when list is length 1`() {
        LinkedList<String>().apply {
            insertFirst("a")
            removeLast()
            head shouldEqual null
        }
    }

    @Test
    fun `removeLast removes the last node when list is length 2`() {
        LinkedList<String>().apply {
            insertFirst("b")
            insertFirst("a")
            removeLast()
            size shouldEqual 1
            head?.data shouldEqual "a"
        }
    }

    @Test
    fun `removeLast removes the last node when list is length 3`() {
        LinkedList<String>().apply {
            insertFirst("c")
            insertFirst("b")
            insertFirst("a")
            removeLast()
            size shouldEqual 2
            last?.data shouldEqual "b"
        }
    }

    @Test
    fun `add to the end of the list`() {
        LinkedList<String>().apply {
            insertFirst("a")
            insertLast("b")
            size shouldEqual 2
            last?.data shouldEqual "b"
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

            getAt(0)?.data shouldEqual 1
            getAt(1)?.data shouldEqual 2
            getAt(2)?.data shouldEqual 3
            getAt(3)?.data shouldEqual 4
        }
    }

    @Test
    fun `removeAt does not crash on an empty list`() {
        LinkedList<Int>().apply {
            removeAt(0)
            removeAt(1)
            removeAt(2)
        }
    }

    @Test
    fun `removeAt does not crash on an index out of bounds`() {
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
            getAt(0)?.data shouldEqual 1
            removeAt(0)
            getAt(0)?.data shouldEqual 2
        }
    }

    @Test
    fun `removeAt deletes the node at the given index`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)
            getAt(1)?.data shouldEqual 2
            removeAt(1)
            getAt(1)?.data shouldEqual 3
        }
    }

    @Test
    fun `removeAt works on the last node`() {
        LinkedList<Int>().apply {
            insertLast(1)
            insertLast(2)
            insertLast(3)
            insertLast(4)
            getAt(3)?.data shouldEqual 4
            removeAt(3)
            getAt(3) shouldEqual null
        }
    }

    @Test
    fun `inserts a new node with data at the 0 index when the list is empty`() {
        LinkedList<String>().apply {
            insertAt("hi", 0)
            first?.data shouldEqual "hi"
        }
    }

    @Test
    fun `inserts a new node with data at the 0 index when the list has elements`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertLast("c")
            insertAt("hi", 0)
            getAt(0)?.data shouldEqual "hi"
            getAt(1)?.data shouldEqual "a"
            getAt(2)?.data shouldEqual "b"
            getAt(3)?.data shouldEqual "c"
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
            getAt(0)?.data shouldEqual "a"
            getAt(1)?.data shouldEqual "b"
            getAt(2)?.data shouldEqual "hi"
            getAt(3)?.data shouldEqual "c"
            getAt(4)?.data shouldEqual "d"
        }
    }

    @Test
    fun `inserts a new node with data at a last index`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertAt("hi", 2)
            getAt(0)?.data shouldEqual "a"
            getAt(1)?.data shouldEqual "b"
            getAt(2)?.data shouldEqual "hi"
        }
    }

    @Test
    fun `insert a new node when index is out of bounds`() {
        LinkedList<String>().apply {
            insertLast("a")
            insertLast("b")
            insertAt("hi", 30)

            getAt(0)?.data shouldEqual "a"
            getAt(1)?.data shouldEqual "b"
            getAt(2)?.data shouldEqual "hi"
        }
    }
//-=================Iteration
//    @Test
//    fun `applies a transform to each node`() {
//        LinkedList<Int>().apply {
//            insertLast(1)
//            insertLast(2)
//            insertLast(3)
//            insertLast(4)
//
////            forEach(node => {
////                node.data += 10
////            }
//
//            getAt(0).data shouldEqual 11
//            getAt(1).data shouldEqual 12
//            getAt(2).data shouldEqual 13
//            getAt(3).data shouldEqual 14
//        }
//    }
//
//    @Test
//    fun `works with the linked list`() {
//        LinkedList<Int>().apply {
//            insertLast(1)
//            insertLast(2)
//            insertLast(3)
//            insertLast(4)
//
//            //        for (let node of l) {
////            node.data += 10
////        }
//
//            getAt(0).data shouldEqual 11
//            getAt(1).data shouldEqual 12
//            getAt(2).data shouldEqual 13
//            getAt(3).data shouldEqual 14
//        }
//    }

//    @Test
//    fun `for...of works on an empty list`() {
//        LinkedList().apply { }
//            for (let node of l) {
//        }
//    }
}

