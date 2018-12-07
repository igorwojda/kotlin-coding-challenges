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
        val l = LinkedList<Char>()
        midpoint(l)?.data shouldEqual null
    }

    @Test
    fun `midpoint of list with 3 elements`() {
        val l = LinkedList<Char>()
        l.insertLast('a')
        l.insertLast('b')
        l.insertLast('c')
        midpoint(l)?.data shouldEqual 'b'
    }

    @Test
    fun `midpoint of list with 5 elements`() {
        val l = LinkedList<Char>()
        l.insertLast('a')
        l.insertLast('b')
        l.insertLast('c')
        l.insertLast('d')
        l.insertLast('e')
        midpoint(l)?.data shouldEqual 'c'
    }

    @Test
    fun `midpoint of list with 2 elements`() {
        val l = LinkedList<Char>()
        l.insertLast('a')
        l.insertLast('b')
        midpoint(l)?.data shouldEqual 'a'
    }

    @Test
    fun `midpoint of list with 4 elements`() {
        val l = LinkedList<Char>()
        l.insertLast('a')
        l.insertLast('b')
        l.insertLast('c')
        l.insertLast('d')
        midpoint(l)?.data shouldEqual 'b'
    }
}

