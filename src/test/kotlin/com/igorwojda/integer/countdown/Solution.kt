package com.igorwojda.integer.countdown

// Kotlin idiomatic solution
private object Solution1 {
    private fun countDown(n: Int): List<Int> {
        // Create a range and convert it to a list
        return (n downTo 0).toList()
    }
}

// Recursive solution
private object Solution2 {
    private fun countDown(n: Int): List<Int> {
        if (n == 0) {
            return listOf(0)
        }

        return mutableListOf(n).also { it.addAll(countDown(n - 1)) }
    }
}

// Recursive solution with helper function
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
private object Solution4 {
    private fun countDown(n: Int): List<Int> {
        return List(n + 1) { n - it }
    }
}
