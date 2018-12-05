package com.igorwojda.codingpuzzle.string.reverse

//Kotlin idiomatic way
object ReverseSolution1 {
    private fun reverse(str: String): String {
        return str.reversed()
    }
}

object ReverseSolution2 {
    private fun reverse(str: String): String {
        var reversed = ""
        str.forEach {
            reversed = it + reversed
        }
        return reversed
    }
}

object ReverseSolution3 {
    private fun reverse(str: String): String {
        return str.foldRight("") { char, reversed -> reversed + char }
    }
}
