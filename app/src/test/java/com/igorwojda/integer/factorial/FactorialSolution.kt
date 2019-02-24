package com.igorwojda.integer.factorial

// iterative solution
private object Solution1 {
    private fun factorial(n: Int): Int {
        var total = 1

        (1..n).forEach {
            total *= it
        }

        return total
    }
}

// recursive solution
private object Solution2 {
    private fun factorial(n: Int): Int =
        when (n) {
            0, 1 -> 1
            else -> n * factorial(n - 1)
        }
}

