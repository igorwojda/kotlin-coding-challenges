package com.igorwojda.string.getduplicatedarguments

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun getDuplicatedArguments(vararg strings: String): List<String>? {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `a, b, c returns empty list`() {
        getDuplicatedArguments("a", "b", "c") shouldBeEqualTo listOf()
    }

    @Test
    fun `a, b, c, a returns a`() {
        getDuplicatedArguments("a", "b", "c", "a") shouldBeEqualTo listOf("a")
    }

    @Test
    fun `a, e, a, e, d, a returns a, e`() {
        getDuplicatedArguments("a", "e", "a", "e", "d", "a") shouldBeEqualTo listOf("a", "e")
    }

    @Test
    fun `no arguments returns empty list`() {
        getDuplicatedArguments() shouldBeEqualTo listOf()
    }
}
