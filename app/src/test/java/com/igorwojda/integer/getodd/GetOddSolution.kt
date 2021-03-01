package com.igorwojda.integer.getodd

// Kotlin idiomatic solution
private object Solution1 {
    private fun filterOdd(list: List<Int>): List<Int> {
        return list.filter { it % 2 == 1 }
    }
}

// Recursive solution
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
