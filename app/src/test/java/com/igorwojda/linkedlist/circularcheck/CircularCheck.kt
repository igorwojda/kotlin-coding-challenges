package com.igorwojda.linkedlist.circularcheck

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun circularCheck(list: LinkedList<Char>): Boolean {
    return false
}

class CircularTest {
    @Test
    fun `circular detects circular linked lists`() {
        val l = LinkedList<Char>()
        val a = Node('a')
        val b = Node('b')
        val c = Node('c')

        l.head = a
        a.next = b
        b.next = c
        c.next = b

        circularCheck(l) shouldEqual true
    }

    @Test
    fun `circular detects circular linked lists linked at the head`() {
        val l = LinkedList<Char>()
        val a = Node('a')
        val b = Node('b')
        val c = Node('c')

        l.head = a
        a.next = b
        b.next = c
        c.next = a

        circularCheck(l) shouldEqual true
    }

    @Test
    fun `circular detects non-circular linked lists`() {
        val l = LinkedList<Char>()
        val a = Node('a')
        val b = Node('b')
        val c = Node('c')

        l.head = a
        a.next = b
        b.next = c
        c.next = null

        circularCheck(l) shouldEqual false
    }
}
