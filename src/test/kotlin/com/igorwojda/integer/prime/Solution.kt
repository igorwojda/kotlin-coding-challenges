// PrimeTest.kt

package com.igorwojda.string.Prime

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class PrimeTest {
    private fun primesLessThanX(x: Int): List<Int> {
        // Implementation of primesLessThanX
        TODO()
    }

    @Test
    fun `primesLessThanX returns primes less than X`() {
        val x = 30
        val expected = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)

        primesLessThanX(x) shouldBeEqualTo expected
    }
}
