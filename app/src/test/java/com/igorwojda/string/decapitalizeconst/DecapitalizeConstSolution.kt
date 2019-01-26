package com.igorwojda.string.decapitalizeconst

// Kotlin idiomatic solution
private object Solution {
    private fun decapitalizeConst(str: String): String? {
        val words = str.split("_").filter { it.isNotEmpty() }

        if (words.size <= 1) return null

        return words.mapIndexed { index, word ->
            if (index == 0) {
                word.toLowerCase()
            } else {
                word.first().toUpperCase() + word.drop(1).toLowerCase()
            }
        }.joinToString(separator = "")
    }
}

private object KtLintWillNotComplain
