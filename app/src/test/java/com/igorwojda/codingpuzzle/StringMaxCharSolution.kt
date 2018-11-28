package com.igorwojda.codingpuzzle

private fun maxCharSolution1(str: String): Char? {
    val map = mutableMapOf<Char, Int>()

    str.forEach {
        map[it] = (map[it] ?: 0)  + 1
    }

    return map.maxBy { it.value }?.key
}
