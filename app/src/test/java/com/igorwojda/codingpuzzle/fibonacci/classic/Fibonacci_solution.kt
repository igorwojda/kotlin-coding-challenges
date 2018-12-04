package com.igorwojda.codingpuzzle.fibonacci.classic

//iterative solution
private fun fibonacciSequenceSolution1(n: Int): Int {
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

//iterative solution with temporary list (not efficient)
private fun fibonacciSequenceSolution2(n: Int): Int {
    val list = mutableListOf(0, 1)

    for (it in list.size..n) {
        list.add(list.takeLast(2).sum())
    }

    return list[n]
}

//recursive solution
private fun fibonacciSequenceSolution3(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibonacciSequenceSolution3(n - 1) + fibonacciSequenceSolution3(
            n - 2
        )
    }
}

//recursive solution
private fun fibonacciSequenceSolution4(n: Int): Int {
    if (n < 2) {
        return n
    }

    return fibonacciSequenceSolution4(n - 1) + fibonacciSequenceSolution4(
        n - 2
    )
}
