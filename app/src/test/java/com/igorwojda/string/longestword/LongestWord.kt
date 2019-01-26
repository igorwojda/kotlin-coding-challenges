package com.igorwojda.string.longestword

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun longestWord(str: String): String {
    return ""
}

class LongestWordTest {
    @Test
    fun `"flower" return "flower"`() {
        longestWord("flower") shouldEqual "flower"
    }

    @Test
    fun `"flower ig growing fast" return "growing"`() {
        longestWord("flower ig growing fast") shouldEqual "growing"
    }

    @Test
    fun `"This is my jeep" return "jeep"`() {
        longestWord("This is my jeep") shouldEqual "This"
    }

    @Test
    fun `"Home!@#&sweet home" return "sweet"`() {
        longestWord("Home!@&#sweet home") shouldEqual "sweet"
    }
}
