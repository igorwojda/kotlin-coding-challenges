package com.igorwojda.integer.countupanddown

// Calculate element value from element position
private object Solution1 {
    private fun countUpAndDown(n: Int): List<Int> {
        val size = (n * 2) + 1

        return List(size) {
            when {
                it <= n -> it
                else -> (n * 2) - it
            }
        }
    }
}

// Returns a new list by combining two iterables
private object Solution2 {
    private fun countUpAndDown(n: Int): List<Int> {
        // (0 until n) returns a range from 0 to (n - 1)
        // (n downTo 0) returns a range from n to 0
        // "+" operator combines both collections
        return (0 until n) + (n downTo 0)
    }
}
