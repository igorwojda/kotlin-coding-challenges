package com.igorwojda.linkedlist.midpoint

import com.igorwojda.linkedlist.base.Solution2.LinkedList
import com.igorwojda.linkedlist.base.Solution2.Node

private object Solution {
    private fun midpoint(list: LinkedList<Char>): Node<Char>? {
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
