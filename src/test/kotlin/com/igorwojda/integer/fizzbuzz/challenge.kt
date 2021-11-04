package com.igorwojda.integer.fizzbuzz

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fizzBuzz(n: Int): List<String> {
    val fizzBuzz = mutableListOf<String>()
    for(i in 1..n){
        // Can be replaced with when
        var res = ""
        if(i%3==0)
            res+="Fizz"
        if(i%5==0)
            res+="Buzz"
        if(res.isEmpty())
            fizzBuzz.add(i.toString())
        else
            fizzBuzz.add(res)
    }
    return fizzBuzz
}

private class Test {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 15 prints out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}
