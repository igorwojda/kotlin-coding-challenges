package com.igorwojda.integer.countdown

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun countDown(n: Int): List<Int> {
        // Create a range and convert it to a list
        return (n downTo 0).toList()
    }
}

// Recursive solution
// Time complexity: O(n^2) - each level copies the result of the recursive call
// Space complexity: O(n) - result list and recursion call stack
private object Solution2 {
    private fun countDown(n: Int): List<Int> {
        if (n == 0) {
            return listOf(0)
        }

        return mutableListOf(n).also { it.addAll(countDown(n - 1)) }
    }
}

// Recursive solution with helper function
// Time complexity: O(n^2) - each level copies the result of the recursive call
// Space complexity: O(n) - result list and recursion call stack
private object Solution3 {
    private fun countDown(n: Int): List<Int> {
        // We want to keep return type unchanged while implementing recursive solution, so we will
        // use helper method defied inside countDown function.
        fun helper(n: Int): MutableList<Int> {
            if (n == 0) {
                return mutableListOf(0)
            }

            return mutableListOf(n).also { it.addAll(countDown(n - 1)) }
        }

        return helper(n).toList()
    }
}

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution4 {
    private fun countDown(n: Int): List<Int> = List(n + 1) { n - it }
}
