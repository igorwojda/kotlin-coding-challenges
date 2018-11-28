package com.igorwojda.codingpuzzle

//iterative solution
private fun fibonacciSequenceSolution1(n: Int): Int {
    if(n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    }

    var prevPrev = 0
    var prev = 1
    var current = 0

    (2..n).forEach {
        current = prevPrev + prev
        prevPrev = prev
        prev = current
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
        else -> fibonacciSequenceSolution3(n - 1) + fibonacciSequenceSolution3(n - 2)
    }
}

//recursive solution
private fun fibonacciSequence4(n: Int): Int {
    if (n == 1 || n == 2) {
        return 1
    }

    return fibonacciSequence4(n - 1) + fibonacciSequence4(n - 2)
}
