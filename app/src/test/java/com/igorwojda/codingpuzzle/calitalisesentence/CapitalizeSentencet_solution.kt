package com.igorwojda.codingpuzzle.calitalisesentence

object capitalizeSolution1 {
    private fun capitalize(str: String): String {
        val words = mutableListOf<String>()

        str.split(" ").forEach {
            words.add(it[0].toUpperCase() + it.substring(1))
        }

        return words.joinToString(" ")
    }
}

object capitalizeSolution2 {
    private fun capitalize(str: String): String {
        return str.split(" ").joinToString(" ") { it.capitalize() }
    }
}
