package com.igorwojda.linkedlist.circularcheck

import com.igorwojda.linkedlist.base.Solution2


private object Solution {
    private fun circularCheck(list: Solution2.LinkedList<Char>): Boolean {
        var slowPointer = list.first
        var fastPointer = list.head

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
