package com.igorwojda.list.product

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution1 {
    private fun product(list: List<Int>): Int = list.reduce { accumulated, current -> accumulated * current }
}

// Recursive solution
// Time complexity: O(n^2) - drop(1) copies the list on each of n recursion levels
// Space complexity: O(n^2) - drop(1) copy kept alive on each of n recursion levels
private object Solution2 {
    private fun product(list: List<Int>): Int {
        if (list.size == 1) {
            return list.first()
        }

        return list.first() * product(list.drop(1))
    }
}

// Tail-recursive solution
// Time complexity: O(n^2) - drop(1) copies the list on each of n recursion levels
// Space complexity: O(n^2) - no tailrec modifier, so n stack frames each hold a drop(1) copy
private object Solution3 {
    private fun product(list: List<Int>): Int {
        fun prod(
            acc: Int,
            list: List<Int>,
        ): Int {
            if (list.isEmpty()) {
                return acc
            }
            return prod(acc * list.first(), list.drop(1))
        }
        return prod(1, list)
    }
}
