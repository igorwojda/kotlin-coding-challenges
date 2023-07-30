package com.igorwojda.common.anycallback

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private class Test {
    val functionUnderTest: (list: List<Int>, callback: (Int) -> Boolean)->Boolean = ::anyCallback

    @Test
    fun `any callback returns true`() {
        val callback: ((Int) -> Boolean) = { it > 3 }
        functionUnderTest(listOf(1, 2, 3, 4), callback) shouldBeEqualTo true
    }

    @Test
    fun `any callback returns false`() {
        val callback: ((Int) -> Boolean) = { it > 3 }
        functionUnderTest(listOf(1, 2, 3), callback) shouldBeEqualTo false
    }

    @Test
    fun `empty list returns false`() {
        val callback: ((Int) -> Boolean) = { it > 3 }
        functionUnderTest(emptyList(), callback) shouldBeEqualTo false
    }
}