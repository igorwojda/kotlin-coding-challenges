package com.igorwojda.list.product

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun product(list: List<Int>): Int {
    return -1
}

class ProductTest {
    @Test
    fun `product 0 returns 0`() {
        product(listOf(0)) shouldEqual 0
    }

    @Test
    fun `product 1, 2, 3 returns 6`() {
        product(listOf(1, 2, 3)) shouldEqual 6
    }

    @Test
    fun `product 4, 2, 10 returns 80`() {
        product(listOf(2, 4, 10)) shouldEqual 80
    }
}
