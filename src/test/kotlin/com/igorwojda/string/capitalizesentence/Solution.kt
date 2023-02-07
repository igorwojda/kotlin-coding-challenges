package com.igorwojda.string.capitalizesentence

// Kotlin idiomatic solution
private object Solution1 {
    private fun capitalizeSentence(str: String): String {
        return str
            .split(" ")
            .joinToString(" ") { string ->
                string.replaceFirstChar { it.uppercase() }
            }
    }
}

// Iterative solution
private object Solution2 {
    private fun capitalizeSentence(str: String): String {
        val words = mutableListOf<String>()

        str.split(" ").forEach {
            words.add(it[0].uppercase() + it.substring(1))
        }

        return words.joinToString(" ")
    }
}
