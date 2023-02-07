package com.igorwojda.linkedlist.singly.circularcheck

import com.igorwojda.linkedlist.singly.base.Solution1.SinglyLinkedList

private object Solution1 {
    private fun circularCheck(list: SinglyLinkedList<Char>): Boolean {
        var slowPointer = list.first
        var fastPointer = list.first

        while (fastPointer != null) {
            list.forEach {
                slowPointer = slowPointer?.next
                fastPointer = fastPointer?.next?.next

                if (fastPointer != null && slowPointer == fastPointer) {
                    return true
                }
            }
        }

        return false
    }
}

private object KtLintWillNotComplain
