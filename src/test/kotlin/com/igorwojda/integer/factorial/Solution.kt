package com.igorwojda.integer.factorial

// iterative solution
private object Solution1 {
    private fun factorial(n: Int): Int {
        var total = 1

        (1..n).forEach {
            total *= it
        }

        return total
    }
}

// another iterative solution
private object Solution2 {
    private fun factorial(n: Int): Int =
        when (n) {
            0 -> 1
            else -> (n downTo 1).reduce { acc, it -> acc * it }
        }
}

// recursive solution
private object Solution3 {
    private fun factorial(n: Int): Int =
        when (n) {
            0, 1 -> 1
            else -> n * factorial(n - 1)
        }
}

// Tail-recursive solution
private object Solution4 {
    private fun factorial(n: Int): Int {
        fun fact(n: Int, acc: Int = 1): Int =
            when (n) {
                0, 1 -> acc
                else -> fact(n - 1, acc * n)
            }
        return fact(n)
    }
}
