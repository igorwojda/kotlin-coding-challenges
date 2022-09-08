package com.igorwojda.string.surroundedletter

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun surroundedLetter(str: String): Boolean {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `'a' return 'false'`() {
        surroundedLetter("a") shouldBeEqualTo false
    }

    @Test
    fun `'+a+' return 'true'`() {
        surroundedLetter("+a+") shouldBeEqualTo true
    }

    @Test
    fun `'a+' return 'false'`() {
        surroundedLetter("a+") shouldBeEqualTo false
    }

    @Test
    fun `'+a' return 'false'`() {
        surroundedLetter("+a") shouldBeEqualTo false
    }

    @Test
    fun `'+a+b+' return 'true'`() {
        surroundedLetter("+a+b+") shouldBeEqualTo true
    }

    @Test
    fun `'+a++b+' return 'true'`() {
        surroundedLetter("+a++b+") shouldBeEqualTo true
    }

    @Test
    fun `'+ab+' return 'false'`() {
        surroundedLetter("+ab+") shouldBeEqualTo false
    }

    @Test
    fun `'a+b+' return 'false'`() {
        surroundedLetter("a+b+") shouldBeEqualTo false
    }

    @Test
    fun `'+a+b' return 'false'`() {
        surroundedLetter("+a+b") shouldBeEqualTo false
    }

    @Test
    fun `'+a+b+++c++d+e++' return 'true'`() {
        surroundedLetter("+a+b+++c++d+e++") shouldBeEqualTo true
    }

    @Test
    fun `'+++a+d++de++e++' return 'false'`() {
        surroundedLetter("+a+d++de++e+") shouldBeEqualTo false
    }
}
