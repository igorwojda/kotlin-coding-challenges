package com.igorwojda.integer.addupto

// Kotlin idiomatic solution
private object Solution1 {
    private fun addUpTo(n: Int): Int {
        return (1..n).sum()
    }
}

// Kotlin idiomatic solution
private object Solution2 {
    private fun addUpTo(n: Int): Int {
        return (0..n).fold(0) { accumulated, current -> accumulated + current }
    }
}

// Recursive solution
private object Solution3 {
    private fun addUpTo(n: Int): Int {
        if (n == 1) {
            return 1
        }

        return n + addUpTo(n - 1)
    }
}

// Time Complexity: O(1)
// Mathematical formula
private object Solution4 {
    private fun addUpTo(n: Int): Int {
        return n * (n + 1) / 2
    }
}

// Time Complexity: O(n)
// Iterative solution
private object Solution5 {
    private fun addUpTo(n: Int): Int {
        var total = 0

        (0..n).forEach { total += it }

        return total
    }
}

// Iterative solution
private object Solution6 {
    private fun addUpTo(n: Int): Int {
        var total = 0
        repeat(n + 1) { total += it }
        return total
    }
}
