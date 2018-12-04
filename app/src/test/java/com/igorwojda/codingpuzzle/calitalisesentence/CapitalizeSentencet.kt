package com.igorwojda.codingpuzzle.calitalisesentence

private fun capitalizeSolution1(str: String): String {
    val words = mutableListOf<String>()

    str.split(" ").forEach {
        words.add(it[0].toUpperCase() + it.substring(1))
    }

    return words.joinToString(" ")
}

private fun capitalizeSolution2(str: String): String {
    return str.split(" ").joinToString(" ") { it.capitalize() }
}
