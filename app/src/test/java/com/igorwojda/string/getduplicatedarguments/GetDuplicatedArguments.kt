package com.igorwojda.string.getduplicatedarguments

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun getDuplicatedArguments(vararg strings: String): List<String>? {
    return null
}

class CheckDuplicatedParamsTest {
    @Test
    fun `getDuplicatedArguments a, b, c returns empty list`() {
        getDuplicatedArguments("a", "b", "c") shouldEqual listOf()
    }

    @Test
    fun `getDuplicatedArguments a, b, c, a returns a`() {
        getDuplicatedArguments("a", "b", "c", "a") shouldEqual listOf("a")
    }

    @Test
    fun `getDuplicatedArguments a, e, a, e, d, a returns a, e`() {
        getDuplicatedArguments("a", "e", "a", "e", "d", "a") shouldEqual listOf("a", "e")
    }

    @Test
    fun `getDuplicatedArguments without argument returns empty list`() {
        getDuplicatedArguments() shouldEqual listOf()
    }
}
