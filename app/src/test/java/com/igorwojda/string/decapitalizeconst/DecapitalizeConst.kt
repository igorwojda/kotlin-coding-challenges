package com.igorwojda.string.decapitalizeconst

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun decapitalizeConst(str: String): String {
    TODO("not implemented")
}

class DecapitalizeConstTest {
    @Test
    fun `"FOOBAR" return null`() {
        decapitalizeConst("FOOBAR") shouldEqual "foobar"
    }

    @Test
    fun `"FOO_BAR" return "fooBar"`() {
        decapitalizeConst("FOO_BAR") shouldEqual "fooBar"
    }

    @Test
    fun `"FOO_BAR_BAZ" return "fooBarBaz"`() {
        decapitalizeConst("FOO_BAR_BAZ") shouldEqual "fooBarBaz"
    }

    @Test
    fun `"__F_BAR" return "fBar"`() {
        decapitalizeConst("__F_BAR") shouldEqual "fBar"
    }

    @Test
    fun `"F_BAR" return "fBar"`() {
        decapitalizeConst("F_BAR") shouldEqual "fBar"
    }

    @Test
    fun `empty string return empty string`() {
        decapitalizeConst("") shouldEqual ""
    }
}
