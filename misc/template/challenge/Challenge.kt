package com.igorwojda.challenge

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun challenge() {

}

private class Test {
    @Test
    fun `simple test`() {
        val actual = challenge()
        actual shouldBeEqualTo "expected"
    }
}
