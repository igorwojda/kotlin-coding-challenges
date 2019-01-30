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

// Returns a new list containing all the elements of an iterable plus the elements of another
private object Solucion3 {
    private fun countUpAndDown(n: Int): List<Int> {
        // (0 until n) returns a range from 0 to (n - 1)
        // (n downTo 0) returns a range from n to 0
        // "+" operator is the same as doing upIntRange.plus(downIntRange),
        // which returns a list containing all elements of the original collection
        // and then all elements of the given elements collection.
        return (0 until n) + (n downTo 0)
    }
}
