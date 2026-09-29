package com.igorwojda.string.validparentheses

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isValidParentheses(str: String): Boolean {
    TODO("Add your solution here")
}

private class Test {
    @Test
    fun `'()' is valid`() {
        isValidParentheses("()") shouldBeEqualTo true
    }

    @Test
    fun `round, square and curly pairs are valid`() {
        isValidParentheses("()[]{}") shouldBeEqualTo true
    }

    @Test
    fun `round bracket closed by square bracket is not valid`() {
        isValidParentheses("(]") shouldBeEqualTo false
    }

    @Test
    fun `interleaved round and square brackets are not valid`() {
        isValidParentheses("([)]") shouldBeEqualTo false
    }

    @Test
    fun `square brackets nested in curly brackets are valid`() {
        isValidParentheses("{[]}") shouldBeEqualTo true
    }

    @Test
    fun `empty string is valid`() {
        isValidParentheses("") shouldBeEqualTo true
    }

    @Test
    fun `'(' is not valid - unclosed bracket`() {
        isValidParentheses("(") shouldBeEqualTo false
    }

    @Test
    fun `')' is not valid - no matching open bracket`() {
        isValidParentheses(")") shouldBeEqualTo false
    }

    @Test
    fun `'(()' is not valid - unclosed bracket`() {
        isValidParentheses("(()") shouldBeEqualTo false
    }

    @Test
    fun `deeply nested brackets are valid`() {
        isValidParentheses("([]{()})") shouldBeEqualTo true
    }
}
