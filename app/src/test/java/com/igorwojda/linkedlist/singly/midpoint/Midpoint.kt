package com.igorwojda.linkedlist.singly.midpoint

import com.igorwojda.linkedlist.singly.base.Solution
import com.igorwojda.linkedlist.singly.base.Solution.Node
import com.igorwojda.linkedlist.singly.base.Solution.SinglyLinkedList
import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun midpoint(list: Solution.SinglyLinkedList<Char>): Node<Char>? {
    TODO("not implemented")
}

class MidpointTest {
    @Test
    fun `midpoint of list with 0 elements`() {
        SinglyLinkedList<Char>().apply {
            midpoint(this)?.data shouldEqual null
        }
    }

    @Test
    fun `midpoint of list with 3 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')

            midpoint(this)?.data shouldEqual 'b'
        }
    }

    @Test
    fun `midpoint of list with 5 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')
            insertLast('d')
            insertLast('e')

            midpoint(this)?.data shouldEqual 'c'
        }
    }

    @Test
    fun `midpoint of list with 2 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            midpoint(this)?.data shouldEqual 'a'
        }
    }

    @Test
    fun `midpoint of list with 4 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')
            insertLast('d')

            midpoint(this)?.data shouldEqual 'b'
        }
    }
}
