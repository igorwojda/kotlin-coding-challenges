package com.igorwojda.various.printnumber.steps

private object Solution {
    private fun printNumber(n: Int, step: Int = 1): List<Int> {
        val list = mutableListOf<Int>()

        if (n <= 0) {
            return listOf()
        } else {
            list.add(n)
        }

        list.addAll(printNumber(n - step, step))
        return list
    }
}
