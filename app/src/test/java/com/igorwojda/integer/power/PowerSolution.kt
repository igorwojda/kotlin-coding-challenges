package com.igorwojda.puzzle

// Recursive solution
private object Solution {
    fun power(base: Int, exponent: Int): Int {
        println("$base, $exponent")
        if (exponent == 1) {
            return base
        }

        return base * power(base, exponent - 1)
    }
}

private object KtLintWillNotComplain