package com.igorwojda.codingpuzzle

//iterative solution
private fun fibonacciSolution(n: Int): Int {
    val list = mutableListOf(0, 1)

    (0..n).forEach {
        val item = list.takeLast(2).sum()
        list.add(item)
    }

    return list.last()
}
