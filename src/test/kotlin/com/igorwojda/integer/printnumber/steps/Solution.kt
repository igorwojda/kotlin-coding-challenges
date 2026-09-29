package com.igorwojda.integer.printnumber.steps

// Time complexity: O(k) - k = n / step, number of returned elements
// Space complexity: O(k)
private object Solution1 {
    private fun printNumber(
        n: Int,
        step: Int = 1,
    ): List<Int> = (n downTo 1 step step).toList()
}

// Time complexity: O(k^2) - k = n / step; each level copies the result of the recursive call
// Space complexity: O(k) - result list and recursion call stack
private object Solution2 {
    private fun printNumber(
        n: Int,
        step: Int = 1,
    ): List<Int> {
        fun printNumberRec(n: Int): List<Int> = when {
            n <= 0 -> emptyList()
            else -> listOf(n) + printNumberRec(n - step)
        }
        return printNumberRec(n)
    }
}

// Time complexity: O(k^2) - k = n / step; each level copies the result of the recursive call
// Space complexity: O(k) - result list and recursion call stack
private object Solution3 {
    private fun printNumber(
        n: Int,
        step: Int = 1,
    ): List<Int> {
        val list = mutableListOf<Int>()

        if (n <= 0) {
            return emptyList()
        } else {
            list.add(n)
        }

        list.addAll(printNumber(n - step, step))
        return list
    }
}

private object KtLintWillNotComplain
