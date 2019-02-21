package com.igorwojda.linkedlist.singly.fromlast

import com.igorwojda.linkedlist.singly.base.Solution2.Node
import com.igorwojda.linkedlist.singly.base.Solution2.SinglyLinkedList

private object Solution {
    private fun fromLast(
        list: SinglyLinkedList<Char>,
        endIndex: Int
    ): Node<Char>? {
        var slow = list.first
        var fast = list.first

        repeat(endIndex) { fast = fast?.next }

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast?.next
        }

        return slow
    }
}

private object KtLintWillNotComplain
