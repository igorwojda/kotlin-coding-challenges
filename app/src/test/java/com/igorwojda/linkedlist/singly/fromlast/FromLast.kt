package com.igorwojda.linkedlist.singly.fromlast

import com.igorwojda.linkedlist.singly.base.Solution.Node
import com.igorwojda.linkedlist.singly.base.Solution.SinglyLinkedList
import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun fromLast(list: SinglyLinkedList<Char>, endIndex: Int): Node<Char>? {
    return null
}

class FromLastTest {
    @Test
    fun `returns the node 0 elements from the end`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            fromLast(this, 0)?.data shouldEqual 'b'
        }
    }

    @Test
    fun `returns the node 1 elements from the end`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            fromLast(this, 1)?.data shouldEqual 'a'
        }
    }

    @Test
    fun `fromLast returns the node 3 elements from the end`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')
            insertLast('d')
            insertLast('e')

            fromLast(this, 3)?.data shouldEqual 'b'
        }
    }
}
