package com.igorwojda.list.flatten

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun flatten(list: List<*>): List<*> {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `flatten test 1`() {
        flatten(listOf(1)) shouldBeEqualTo listOf(1)
    }

    @Test
    fun `flatten test 2`() {
        flatten(listOf(1, listOf(2))) shouldBeEqualTo listOf(1, 2)
    }

    @Test
    fun `flatter test 3`() {
        flatten(listOf(1, listOf(2, listOf(3), emptyList<Any>()))) shouldBeEqualTo listOf(1, 2, 3)
    }

    @Test
    fun `flatter test 4`() {
        flatten(
            listOf(
                1,
                listOf(2, listOf<Any>(emptyList<Any>())),
                listOf(3)
            )
        ) shouldBeEqualTo listOf(1, 2, 3)
    }

    @Test
    fun `flatter test 5`() {
        flatten(
            listOf(
                1,
                listOf(2, listOf(3), listOf(4, listOf(listOf(5))))
            )
        ) shouldBeEqualTo listOf(1, 2, 3, 4, 5)
    }
}
