package com.igorwojda.linkedlist.fromlast

import com.igorwojda.linkedlist.base.Solution2.LinkedList
import com.igorwojda.linkedlist.base.Solution2.Node

private object Solution {
    private fun fromLast(
        list: LinkedList<Char>,
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
