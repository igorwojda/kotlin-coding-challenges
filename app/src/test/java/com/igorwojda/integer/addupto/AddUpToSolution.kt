package com.igorwojda.integer.addupto

// Kotlin idiomatic solution
private object AddUpToSolution1 {
    private fun addUpTo(n: Int): Int {
        return (0..n).fold(0) { accumulated, current -> accumulated + current }
    }
}

// Recursive solution
private object AddUpToSolution2 {
    private fun addUpTo(n: Int): Int {
        if (n == 1) {
            return 1
        }

        return n + addUpTo(n - 1)
    }
}

// Mathematical formula
private object AddUpToSolution3 {
    private fun addUpTo(n: Int): Int {
        return n * (n + 1) / 2
    }
}

// Iterative solution
private object AddUpToSolution4 {
    private fun addUpTo(n: Int): Int {
        var total = 0

        (0..n).forEach { total += it }

        return total
    }
}

// Iterative solution
private object AddUpToSolution5 {
    private fun addUpTo(n: Int): Int {
        var total = 0
        repeat(n + 1) { total += it }
        return total
    }
}


