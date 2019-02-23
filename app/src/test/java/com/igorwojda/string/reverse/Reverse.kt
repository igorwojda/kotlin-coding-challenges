package com.igorwojda.string.reverse

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun reverse(str: String): String {
    TODO("not implemented")
}

class StringReverseTest {
    @Test
    fun `Reverse of "abcd" is "dcba"`() {
        reverse("abcd") shouldEqual "dcba"
    }

    @Test
    fun `Reverse of "aabbccdd" is "ccbbaadd"`() {
        reverse("aabbccdd") shouldEqual "ddccbbaa"
    }
}
