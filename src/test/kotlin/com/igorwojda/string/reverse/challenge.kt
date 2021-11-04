package com.igorwojda.string.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun reverse(str: String): String {
    var reversed = ""
    for (i in str.length - 1 downTo 0) {
        reversed = "$reversed${str[i]}"
    }
    return reversed
}

private class Test {
    @Test
    fun `Reverse of "abcd" is "dcba"`() {
        reverse("abcd") shouldBeEqualTo "dcba"
    }

    @Test
    fun `Reverse of "aabbccdd" is "ccbbaadd"`() {
        reverse("aabbccdd") shouldBeEqualTo "ddccbbaa"
    }
}
