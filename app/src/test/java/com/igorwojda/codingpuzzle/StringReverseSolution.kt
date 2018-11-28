package com.igorwojda.codingpuzzle

private fun reverseSolution1(str: String): String {
    return str.reversed()
}

private fun reverseSolution2(str: String): String {
    var reversed = ""
    str.forEach {
        reversed = it + reversed
    }
    return reversed
}

private fun reverseSolution3(str: String): String {
    return str.foldRight(""){ char, reversed-> reversed + char }
}
