package com.igorwojda.string.longestword

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun longestWord(str: String): String {
    TODO("not implemented")
}

class LongestWordTest {
    @Test
    fun `"flower" return "flower"`() {
        longestWord("flower") shouldBeEqualTo "flower"
    }

    @Test
    fun `"flower ig growing fast" return "growing"`() {
        longestWord("flower ig growing fast") shouldBeEqualTo "growing"
    }

    @Test
    fun `"This is my jeep" return "jeep"`() {
        longestWord("This is my jeep") shouldBeEqualTo "This"
    }

    @Test
    fun `"Home!@#&sweet home" return "sweet"`() {
        longestWord("Home!@&#sweet home") shouldBeEqualTo "sweet"
    }
}
