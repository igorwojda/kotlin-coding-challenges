package com.igorwojda.integer.power

// Recursive solution
// Time complexity: O(n) - n is exponent
// Space complexity: O(n) - recursion call stack
private object Solution1 {
    private fun power(
        base: Int,
        exponent: Int,
    ): Int {
        if (exponent == 1) {
            return base
        }

        return base * power(base, exponent - 1)
    }
}

private object KtLintWillNotComplain
