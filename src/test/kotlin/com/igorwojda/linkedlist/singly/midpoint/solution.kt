package com.igorwojda.linkedlist.singly.midpoint

import com.igorwojda.linkedlist.singly.base.Solution1.Node
import com.igorwojda.linkedlist.singly.base.Solution1.SinglyLinkedList

private object Solution1 {
    private fun midpoint(list: SinglyLinkedList<Char>): Node<Char>? {
        var slowPointer = list.first
        var fastPointer = list.first

        list.forEach {
            if (fastPointer?.next?.next == null) {
                return slowPointer
            }
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next
        }

        return null
    }
}

private object KtLintWillNotComplain

// list.forEach
