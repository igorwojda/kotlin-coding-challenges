package com.igorwojda.datastructure.linkedlist.midpoint

import com.igorwojda.datastructure.linkedlist.base.LinkedListSolutionExtended.LinkedList
import com.igorwojda.datastructure.linkedlist.base.LinkedListSolutionExtended.Node
import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun midpoint(list: LinkedList<Char>): Node<Char>? {
    return null
}

class MidpointTest {
    @Test
    fun `midpoint of list with 0 elements`() {
        LinkedList<Char>().apply {
            midpoint(this)?.data shouldEqual null
        }
    }

    @Test
    fun `midpoint of list with 3 elements`() {
        LinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')

            midpoint(this)?.data shouldEqual 'b'
        }
    }

    @Test
    fun `midpoint of list with 5 elements`() {
        LinkedList<Char>().apply {
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
        LinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            midpoint(this)?.data shouldEqual 'a'
        }
    }

    @Test
    fun `midpoint of list with 4 elements`() {
        LinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')
            insertLast('d')

            midpoint(this)?.data shouldEqual 'b'
        }
    }
}
