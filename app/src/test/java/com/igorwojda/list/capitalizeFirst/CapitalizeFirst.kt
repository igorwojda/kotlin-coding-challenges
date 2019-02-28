package com.igorwojda.list.capitalizeFirst

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun capitalizeFirst(list: List<String>): List<String> {
    TODO("not implemented")
}

class CapitalizeFirstTest {
    @Test
    fun `capitalize list with one string`() {
        capitalizeFirst(listOf("igor")) shouldEqual listOf("Igor")
    }

    @Test
    fun `capitalize list with two strings`() {
        capitalizeFirst(listOf("igor", "wojda")) shouldEqual listOf("Igor", "Wojda")
    }

    @Test
    fun `capitalize empty list`() {
        capitalizeFirst(listOf("")) shouldEqual listOf("")
    }

    @Test
    fun `capitalize list with sentence`() {
        capitalizeFirst(listOf("what a", "beautiful", "morning")) shouldEqual listOf("What a", "Beautiful", "Morning")
    }
}
