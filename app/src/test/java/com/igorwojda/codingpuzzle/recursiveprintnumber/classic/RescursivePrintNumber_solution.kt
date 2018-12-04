package com.igorwojda.codingpuzzle.recursiveprintnumber.classic

private fun printNumberSolutioin(n: Int): List<Int> {
    val list = mutableListOf<Int>()

    if (n == 0) {
        return listOf()
    } else {
        list.add(n)
    }

    list.addAll(printNumberSolutioin(n - 1))
    return list
}
