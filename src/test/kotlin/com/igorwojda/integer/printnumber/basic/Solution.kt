package com.igorwojda.integer.printnumber.basic

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun printNumber(n: Int): List<Int> = (n downTo 1).toList()
}

// Time complexity: O(n^2) - each level copies the result of the recursive call
// Space complexity: O(n) - result list and recursion call stack
private object Solution2 {
    private fun printNumber(n: Int): List<Int> = when (n) {
        0 -> emptyList()
        else -> listOf(n) + printNumber(n - 1)
    }
}

// Time complexity: O(n^2) - each level copies the result of the recursive call
// Space complexity: O(n) - result list and recursion call stack
private object Solution3 {
    private fun printNumber(n: Int): List<Int> {
        val list = mutableListOf<Int>()

        if (n == 0) {
            return emptyList()
        } else {
            list.add(n)
        }

        list.addAll(printNumber(n - 1))
        return list
    }
}

private object KtLintWillNotComplain
