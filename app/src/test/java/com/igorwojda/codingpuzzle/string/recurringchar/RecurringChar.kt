package com.igorwojda.codingpuzzle.string.recurringchar

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun recurringChar(str: String): Char? {
    return null
}

class StringRecurringCharTest {
    @Test
    fun `Recurring character in "ABC" is null`() {
        recurringChar("ABC") shouldEqual null
    }

    @Test
    fun `Recurring character in "ABCA" is "A"`() {
        recurringChar("ABCA") shouldEqual 'A'
    }

    @Test
    fun `Recurring character in "BCABA" is "B"`() {
        recurringChar("BCABA") shouldEqual 'B'
    }
}

