// CompressTextTest.kt

package com.igorwojda.string.CompressText

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class CompressTextTest {
    private fun compress(text: String): String {
        // Implementation of compress
        TODO()
    }

    @Test
    fun `compress returns the compressed text`() {
        val text = "aaabbbccc"
        val expected = "a3b3c3"

        compress(text) shouldBeEqualTo expected
    }
}
