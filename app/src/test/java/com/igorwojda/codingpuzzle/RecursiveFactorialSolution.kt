package com.igorwojda.codingpuzzle

private fun factorialSolution1(n: Long): Long {
    require(n >= 0) { "Underflow error in factorial" }
    require(n <= 20) { "Overflow error in factorial" }

    return if (n == 0L) 1 else n * factorialSolution1(n - 1)
}
