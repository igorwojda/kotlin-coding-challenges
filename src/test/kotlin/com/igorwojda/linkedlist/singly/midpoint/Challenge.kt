package com.igorwojda.linkedlist.singly.midpoint

import com.igorwojda.linkedlist.singly.base.Solution1.Node
import com.igorwojda.linkedlist.singly.base.Solution1.SinglyLinkedList
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun midpoint(list: SinglyLinkedList<Char>): Node<Char>? {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `midpoint of list with 0 elements`() {
        SinglyLinkedList<Char>().apply {
            midpoint(this)?.data shouldBeEqualTo null
        }
    }

    @Test
    fun `midpoint of list with 3 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')

            midpoint(this)?.data shouldBeEqualTo 'b'
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

            midpoint(this)?.data shouldBeEqualTo 'c'
        }
    }

    @Test
    fun `midpoint of list with 2 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            midpoint(this)?.data shouldBeEqualTo 'a'
        }
    }

    @Test
    fun `midpoint of list with 4 elements`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')
            insertLast('c')
            insertLast('d')

            midpoint(this)?.data shouldBeEqualTo 'b'
        }
    }
}
