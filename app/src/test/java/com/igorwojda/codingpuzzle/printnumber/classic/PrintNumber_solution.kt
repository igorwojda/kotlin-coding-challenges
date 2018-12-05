package com.igorwojda.codingpuzzle.printnumber.classic

object PrintNumberSolution {
    private fun printNumber(n: Int): List<Int> {
        val list = mutableListOf<Int>()

        if (n == 0) {
            return listOf()
        } else {
            list.add(n)
        }

        list.addAll(printNumber(n - 1))
        return list
    }
}
