package com.igorwojda.linkedlist.singly.addnumbers

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private data class ListNode(
    var data: Int,
    var next: ListNode? = null,
)

private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    TODO("Add your solution here")
}

private class Test {
    @Test
    fun `add 5, 3, 7 to 2, 3, 3 returns 7, 3, 8`() {
        val number1 = getList(5, 3, 7)
        val number2 = getList(7, 3, 8)
        val result = getList(2, 7, 5, 1)

        addTwoNumbers(number1, number2) shouldBeEqualTo result
    }

    @Test
    fun `add 0 to 0 returns 0`() {
        val number1 = getList(0)
        val number2 = getList(0)
        val result = getList(0)

        addTwoNumbers(number1, number2) shouldBeEqualTo result
    }

    @Test
    fun `add 7 to 2, 3, 5 returns 9, 3, 5`() {
        val number1 = getList(7)
        val number2 = getList(2, 3, 5)
        val result = getList(9, 3, 5)

        addTwoNumbers(number1, number2) shouldBeEqualTo result
    }

    private fun getList(vararg ints: Int): ListNode? {
        var head: ListNode? = null
        var current: ListNode? = null

        ints.forEach {
            val node = ListNode(it)

            if (head == null) {
                head = node
                current = node
            } else {
                current?.next = node
                current = node
            }
        }

        return head
    }
}
