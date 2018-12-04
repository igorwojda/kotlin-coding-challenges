package com.igorwojda.codingpuzzle.string.maxchar

//Optimal approach: complexity O(n)
private fun recurringCharSolution1(str: String): Char? {
    val set = mutableSetOf<Char>()

    str.forEach { char ->
        if (set.any { it == char }) {
            return char
        }

        set.add(char)
    }

    return null
}

//Naive approach: complexity O(n^2)
private fun recurringCharSolution2(str: String): Char? {
    str.forEachIndexed { index, c ->
        str.substring(index + 1).forEach {
            if (c == it) {
                return it
            }
        }
    }

    return null
}
