package com.igorwojda.int.addupto

private object AddUpToSolution1 {
    private fun addUpTo(n: Int): Int {
        var total = 0

        (0..n).forEach { total += it }

        return total
    }
}

private object AddUpToSolution2 {
    private fun addUpTo(n: Int): Int {
        var total = 0
        repeat(n + 1) { total += it }
        return total
    }
}

private object AddUpToSolution3 {
    private fun addUpTo(n: Int): Int {
        return (0..n).fold(0) { accumulated, current -> accumulated + current }
    }
}

private object AddUpToSolution4 {
    private fun addUpTo(n: Int): Int {
        return n * (n + 1) / 2
    }
}

