package com.igorwojda.string.decapitalizeconst

// Kotlin idiomatic solution
private object Solution1 {
    private fun decapitalizeConst(str: String): String {
        val subsStringsList = str
            .split("_")
            .map { it.lowercase() }
            .map { it.replaceFirstChar { string -> string.uppercaseChar() } }

        return subsStringsList
            .joinToString("")
            .replaceFirstChar {
                it.lowercaseChar()
            }
    }
}

// Another Approach
private object Solution2 {
    private fun decapitalizeConst(str: String): String? {
        val words = str.split("_").filter { it.isNotEmpty() }

        if (words.size == 1) return words.first().lowercase()

        return words.mapIndexed { index, word ->
            if (index == 0) {
                word.lowercase()
            } else {
                word.first().uppercase() + word.drop(1).lowercase()
            }
        }.joinToString(separator = "")
    }
}

private object KtLintWillNotComplain
