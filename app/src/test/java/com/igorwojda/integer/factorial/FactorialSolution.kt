package com.igorwojda.integer.factorial

// iterative solution
private object FactorialSolution2 {
    private fun factorial(n: Int): Int {
        var total = 1

        (1..n).forEach {
            total *= it
        }

        return total
    }
}

// recursive solution
private object FactorialSolution1 {
    private fun factorial(n: Int): Int {
        if (n == 0) {
            return 1
        }
        if (n == 1) {
            return 1
        }

        return n * factorial(n - 1)
    }
}
