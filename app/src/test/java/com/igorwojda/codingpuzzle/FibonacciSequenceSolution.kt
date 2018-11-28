package com.igorwojda.codingpuzzle

//iterative solution
private fun fibonacciSequenceSolution(n: Int): Int {
    val list = mutableListOf(0, 1)

    for (it in list.size..n) {
        list.add(list.takeLast(2).sum())
    }

    return list[n]
}
