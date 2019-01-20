package com.igorwojda.string.reverse

// Kotlin idiomatic way
private object ReverseSolution1 {
    private fun reverse(str: String): String {
        return str.reversed()
    }
}

// Iterative approach
private object ReverseSolution2 {
    private fun reverse(str: String): String {
        var reversed = ""
        str.forEach {
            reversed = it + reversed
        }
        return reversed
    }
}

// Recursive approach
private fun reverse(str: String): String {
    if (str.isEmpty()) {
        return str
    }

    return reverse(str.drop(1)) + str.first()
}

// Kotlin fold
private object ReverseSolution3 {
    private fun reverse(str: String): String {
        return str.foldRight("") { char, reversed -> reversed + char }
    }
}
