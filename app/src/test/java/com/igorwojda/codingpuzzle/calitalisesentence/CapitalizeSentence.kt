package com.igorwojda.codingpuzzle.calitalisesentence

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun capitalize(str: String): String {
    return ""
}

class CapitalizeSentenceTest {
    @Test
    fun `'flower' is capitalized to 'Flower'`() {
        capitalize("flower") shouldEqual "Flower"
    }

    @Test
    fun `'this is a house' is capitalised to 'This Is A House'`() {
        capitalize("this is a house") shouldEqual "This Is A House"
    }
}
