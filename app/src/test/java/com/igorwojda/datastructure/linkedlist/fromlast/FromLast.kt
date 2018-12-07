package com.igorwojda.datastructure.linkedlist.fromlast

import com.igorwojda.datastructure.linkedlist.base.LinkedListSolutionExtended.LinkedList
import com.igorwojda.datastructure.linkedlist.base.LinkedListSolutionExtended.Node
import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun fromLast(list: LinkedList<Char>, endIndex: Int): Node<Char>? {
    return null
}

class FromLastTest {
    @Test
    fun `returns the node 0 elements from the end`() {
        LinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            fromLast(this, 0)?.data shouldEqual 'b'
        }
    }

    @Test
    fun `returns the node 1 elements from the end`() {
        LinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            fromLast(this, 1)?.data shouldEqual 'a'
        }
    }

    @Test
    fun `fromLast returns the node 3 elements from the end`() {
        LinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')
            insertLast('d')
            insertLast('e')

            fromLast(this, 3)?.data shouldEqual 'b'
        }
    }
}
