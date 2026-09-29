package com.igorwojda.integer.addupto

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution1 {
    private fun addUpTo(n: Int): Int = (1..n).sum()
}

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution2 {
    private fun addUpTo(n: Int): Int = (0..n).fold(0) { accumulated, current -> accumulated + current }
}

// Recursive solution
// Time complexity: O(n)
// Space complexity: O(n) - recursion call stack
private object Solution3 {
    private fun addUpTo(n: Int): Int {
        if (n == 1) {
            return 1
        }

        return n + addUpTo(n - 1)
    }
}

// Mathematical formula
// Time complexity: O(1)
// Space complexity: O(1)
private object Solution4 {
    private fun addUpTo(n: Int): Int = n * (n + 1) / 2
}

// Iterative solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution5 {
    private fun addUpTo(n: Int): Int {
        var total = 0

        (0..n).forEach { total += it }

        return total
    }
}

// Iterative solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution6 {
    private fun addUpTo(n: Int): Int {
        var total = 0
        repeat(n + 1) { total += it }
        return total
    }
}
