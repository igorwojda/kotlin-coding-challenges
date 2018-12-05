package com.igorwojda.codingpuzzle.string.reverse

//Kotlin idiomatic way
private object ReverseSolution1 {
    private fun reverse(str: String): String {
        return str.reversed()
    }
}

private object ReverseSolution2 {
    private fun reverse(str: String): String {
        var reversed = ""
        str.forEach {
            reversed = it + reversed
        }
        return reversed
    }
}

private object ReverseSolution3 {
    private fun reverse(str: String): String {
        return str.foldRight("") { char, reversed -> reversed + char }
    }
}
