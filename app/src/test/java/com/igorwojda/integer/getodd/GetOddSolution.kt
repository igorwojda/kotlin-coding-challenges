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
