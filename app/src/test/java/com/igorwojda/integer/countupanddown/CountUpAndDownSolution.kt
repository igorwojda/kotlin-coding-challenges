package com.igorwojda.integer.countupanddown

// Create two lists and add them
private object Solution1 {
    private fun countUpAndDown(n: Int): List<Int> {
        // Create first list containing integers from 0 to n
        val upList = (0..n).toMutableList()

        // Create second list containing integers from n -1 to 0
        val downList = ((n - 1) downTo 0).toList()

        // Join lists
        return upList + downList
    }
}

// Calculate element value from element position
private object Solution2 {
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
