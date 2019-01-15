package com.igorwojda.string.getduplicatedparams

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun getDuplicatedParams(vararg strings: String): List<String>? {
    return null
}

class CheckDuplicatedParamsTest {
    @Test
    fun `getDuplicatedParams a, b, c returns empty list`() {
        getDuplicatedParams("a", "b", "c") shouldEqual listOf()
    }

    @Test
    fun `getDuplicatedParams a, b, c, a returns a`() {
        getDuplicatedParams("a", "b", "c", "a") shouldEqual listOf("a")
    }

    @Test
    fun `getDuplicatedParams a, e, a, e, d, a returns a, e`() {
        getDuplicatedParams("a", "e", "a", "e", "d", "a") shouldEqual listOf("a", "e")
    }

    @Test
    fun `getDuplicatedParams without argument returns empty list`() {
        getDuplicatedParams() shouldEqual listOf()
    }
}
