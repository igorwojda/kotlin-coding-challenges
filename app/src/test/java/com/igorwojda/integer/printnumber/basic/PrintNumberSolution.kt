package com.igorwojda.integer.printnumber.basic

private object Solution1 {
    private fun printNumber(n: Int): List<Int> {
        return (n downTo 1).toList()
    }
}

private object Solution2 {
    private fun printNumber(n: Int): List<Int> =
        when (n) {
            0 -> emptyList()
            else -> listOf(n) + printNumber(n - 1)
        }
}

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
