package com.igorwojda.codingpuzzle.fizzbuzz

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun fizzBuzz(n: Int): List<String> {
    return listOf()
}

class FizzBuzzTest {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldEqual listOf("1", "2", "fizz", "4", "buzz")
    }

    @Test
    fun `Calling fizzbuzz with 15 prints out the correct values`() {

        val list = listOf(
            "1", "2", "fizz", "4", "buzz", "fizz",
            "7", "8", "fizz", "buzz", "11", "fizz",
            "13", "14", "fizzbuzz"
        )

        fizzBuzz(15) shouldEqual list
    }
}

