package com.igorwojda.linkedlist.singly.fromlast

import com.igorwojda.linkedlist.singly.base.Solution1.Node
import com.igorwojda.linkedlist.singly.base.Solution1.SinglyLinkedList
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fromLast(list: SinglyLinkedList<Char>, endIndex: Int): Node<Char>? {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `returns the node 0 elements from the end`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            fromLast(this, 0)?.data shouldBeEqualTo 'b'
        }
    }

    @Test
    fun `returns the node 1 elements from the end`() {
        SinglyLinkedList<Char>().apply {
            insertLast('a')
            insertLast('b')

            fromLast(this, 1)?.data shouldBeEqualTo 'a'
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

            fromLast(this, 3)?.data shouldBeEqualTo 'b'
        }
    }
}
