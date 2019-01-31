package com.igorwojda.integer.fibonacci.basic

// iterative solution
private object Solution1 {
    private fun fibonacci(n: Int): Int {
        if (n < 2) {
            return n
        }

        var first = 0
        var second = 1
        var current = 0

        (2..n).forEach {
            current = first + second
            first = second
            second = current
        }

        return current
    }
}

// iterative solution with temporary list (not efficient)
private object Solution2 {
    private fun fibonacci(n: Int): Int {
        val list = mutableListOf(0, 1)

        for (it in list.size..n) {
            list.add(list.takeLast(2).sum())
        }

        return list[n]
    }
}

// recursive solution
private object Solution3 {
    private fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}

// recursive solution
private object Solution4 {
    private fun fibonacci(n: Int): Int {
        if (n < 2) {
            return n
        }

        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}
