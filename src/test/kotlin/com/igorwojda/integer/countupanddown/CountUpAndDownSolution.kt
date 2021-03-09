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

// Returns a new list combining one collection of numbers from 0 to n-1 and another with numbers from n to 0
private object Solution2 {
    private fun countUpAndDown(n: Int): List<Int> {
        return (0 until n) + (n downTo 0)
    }
}
