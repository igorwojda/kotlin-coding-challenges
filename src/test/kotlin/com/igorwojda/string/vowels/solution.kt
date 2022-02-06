package com.igorwojda.string.vowels

// Kotlin collection processing
private object Solution1 {
    private fun vowels(str: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        return str.count { it.toLowerCase() in vowels }
    }
}

// Iterative
private object Solution2 {
    private fun vowels(str: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        var counter = 0

        str.forEach {
            if (vowels.contains(it.toLowerCase())) {
                counter++
            }
        }

        return counter
    }
}

// Regex
private object Solution3 {
    @kotlin.ExperimentalStdlibApi
    private fun vowels(str: String): Int {
        return Regex("[aeiouy]").findAll(str.lowercase()).count()
    }
}
