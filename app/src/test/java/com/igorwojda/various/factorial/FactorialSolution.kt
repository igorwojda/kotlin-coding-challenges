package com.igorwojda.various.factorial

private object FactorialSolution {
    private fun factorial(n: Long): Long {
        require(n >= 0) { "Underflow error in factorial" }
        require(n <= 20) { "Overflow error in factorial" }

        return if (n == 0L) 1 else n * factorial(n - 1)
    }
}
