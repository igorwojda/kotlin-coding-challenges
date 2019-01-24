package com.igorwojda.linkedlist.fromlast

private object Solution {
    private fun fromLast(
        list: LinkedListSolutionExtended.LinkedList<Char>,
        endIndex: Int
    ): LinkedListSolutionExtended.Node<Char>? {
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
