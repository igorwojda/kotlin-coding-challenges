package com.igorwojda.string.capitalizesentence

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun capitalizeSentence(str: String): String {
    TODO("not implemented")
}

class CapitalizeSentenceTest {
    @Test
    fun `"flower" is capitalized to "Flower"`() {
        capitalizeSentence("flower") shouldEqual "Flower"
    }

    @Test
    fun `"this is a house" is capitalised to "This Is A House"`() {
        capitalizeSentence("this is a house") shouldEqual "This Is A House"
    }
}
