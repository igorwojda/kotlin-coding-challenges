package com.igorwojda.string.capitalizesentence

private object capitalizeSolution1 {
    private fun capitalize(str: String): String {
        val words = mutableListOf<String>()

        str.split(" ").forEach {
            words.add(it[0].toUpperCase() + it.substring(1))
        }

        return words.joinToString(" ")
    }
}

private object capitalizeSolution2 {
    private fun capitalize(str: String): String {
        return str.split(" ").joinToString(" ") { it.capitalize() }
    }
}
