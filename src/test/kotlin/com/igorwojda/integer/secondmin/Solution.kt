// SecondMinTest.kt

package com.igorwojda.string.SecondMin

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class SecondMinTest {
    private fun secondMinimumNumber(numbers: List<Int>): Int? {
        // Implementation of secondMinimumNumber
        TODO()
    }

    @Test
    fun `secondMinimumNumber returns the second minimum number`() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val expected = 2

        secondMinimumNumber(numbers) shouldBeEqualTo expected
    }
}
