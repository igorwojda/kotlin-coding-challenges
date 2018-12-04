package com.igorwojda.codingpuzzle.recursiveprintnumber.steps

private fun printNumberSolution1(n: Int, step: Int = 1): List<Int> {
    val list = mutableListOf<Int>()

    if (n <= 0) {
        return listOf()
    } else {
        list.add(n)
    }

    list.addAll(printNumberSolution1(n - step, step))
    return list
}
