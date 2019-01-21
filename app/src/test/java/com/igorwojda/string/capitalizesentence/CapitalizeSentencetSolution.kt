package com.igorwojda.string.capitalizesentence

// Kotlin idiomatic solution
private object Solution1 {
    private fun capitalizeSentence(str: String): String {
        return str.split(" ").joinToString(" ") { it.capitalize() }
    }
}

// Iterative solution
private object Solution2 {
    private fun capitalizeSentence(str: String): String {
        val words = mutableListOf<String>()

        str.split(" ").forEach {
            words.add(it[0].toUpperCase() + it.substring(1))
        }

        return words.joinToString(" ")
    }
}