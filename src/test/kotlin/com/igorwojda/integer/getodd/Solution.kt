package com.igorwojda.integer.getodd

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun filterOdd(list: List<Int>): List<Int> = list.filter { it % 2 == 1 }
}

// Recursive solution
// Time complexity: O(n^2) - drop(1) and list + copy at each level
// Space complexity: O(n^2) - each stack frame holds its own dropped copy
private object Solution2 {
    private fun filterOdd(list: List<Int>): List<Int> {
        if (list.isEmpty()) {
            return list
        }

        return if (list.first() % 2 == 1) {
            mutableListOf(list.first()) + filterOdd(list.drop(1))
        } else {
            filterOdd(list.drop(1))
        }
    }
}

// Recursive solution with helper function
// Time complexity: O(n^2) - drop(1) copies the list at each level
// Space complexity: O(n^2) - each stack frame holds its own dropped copy
private object Solution3 {
    private fun filterOdd(list: List<Int>): List<Int> {
        val result = mutableListOf<Int>()

        fun helper(list: List<Int>) {
            if (list.isEmpty()) {
                return
            }

            if (list.first() % 2 == 1) {
                result.add(list.first())
            }

            helper(list.drop(1))
        }

        helper(list)

        return result
    }
}
