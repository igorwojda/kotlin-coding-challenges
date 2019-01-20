package com.igorwojda.various.anycallback

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun anyCallback(list: List<Int>, callback: (Int) -> Boolean): Boolean {
    if (list.size == 1) {
        return callback(list.first())
    }

    return callback(list.first()) || anyCallback(list.drop(1), callback)
}

class AnyCallbackTest {
    @Test
    fun `any callback returns true`() {
        val callback: ((Int) -> Boolean) = { it > 3 }
        anyCallback(listOf(1, 2, 3, 4), callback) shouldEqual true
    }

    @Test
    fun `any callback returns false`() {
        val callback: ((Int) -> Boolean) = { it > 3 }
        anyCallback(listOf(1, 2, 3), callback) shouldEqual false
    }
}
