package com.igorwojda.integer.power

import kotlin.math.pow

// Recursive solution
private object Solution1 {
    private fun power(base: Int, exponent: Int): Int {
        if (exponent == 1) {
            return base
        }

        return base * power(base, exponent - 1)
    }
}

private object Solution2 {
    private fun power(base: Int, exponent: Int): Int {
        return base.toDouble().pow(exponent).toInt()
    }
}

private object KtLintWillNotComplain
