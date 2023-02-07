package com.igorwojda.integer.power

// Recursive solution
private object Solution1 {
    private fun power(base: Int, exponent: Int): Int {
        if (exponent == 1) {
            return base
        }

        return base * power(base, exponent - 1)
    }
}

private object KtLintWillNotComplain
