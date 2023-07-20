package com.igorwojda.linkedlist.singly.addnumbers

object Solution {
    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val n1 = getNumber(l1)
        val n2 = getNumber(l2)

        val result = n1 + n2

        return getList(result)
    }

    private fun getNumber(l1: ListNode?): Int {
        var node = l1
        var numberStr = ""

        while (node != null) {
            numberStr += node.data
            node = node.next
        }

        return numberStr.reversed().toInt()
    }

    private fun getList(int: Int): ListNode? {
        val intStr = int.toString().reversed()
        var list: ListNode? = null
        var lastListNode: ListNode? = null

        intStr.forEach {
            val node = ListNode(it.digitToInt())

            if (list == null) {
                list = node
                lastListNode = node
            } else {
                lastListNode?.next = node
                lastListNode = node
            }
        }

        return list
    }

    private data class ListNode(
        var data: Int,
        var next: ListNode? = null,
    )
}

private object KtLintWillNotComplain
