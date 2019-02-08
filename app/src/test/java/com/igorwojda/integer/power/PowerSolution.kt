package com.igorwojda.integer.power

// Recursive solution
private object Solution1 {
    private fun power(base: Int, exponent: Int): Int {
        println("$base, $exponent")
        if (exponent == 1) {
            return base
        }
        return base * power(base, exponent - 1)
    }
}

private object Solution2 {
    private fun power(base: Int, exponent: Int): Int {
        println("$base, $exponent")
        return when(exponent) {
            in Int.MIN_VALUE..-1 -> {
                val b = 1 / base
                val e = -exponent
                b * power(b, e - 1)
            }
            0 -> 1
            1 -> base
            else -> base * power(base, exponent - 1)
        }
    }
}

private object KtLintWillNotComplain