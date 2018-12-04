package com.igorwojda.codingpuzzle.calitalisesentence

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun capitalize(str: String): String {
    val words = mutableListOf<String>()

    str.split(" ").forEach {
        words.add(it[0].toUpperCase() + it.substring(1))
    }

    return words.joinToString(" ")
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
