package com.igorwojda.codingpuzzle.string.maxchar

private object MaxOccurrentCharSolution1 {
    private fun maxOccurrentChar(str: String): Char? {
        val map = mutableMapOf<Char, Int>()

        str.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        return map.maxBy { it.value }?.key
    }
}

// Recursive optimal approach: complexity O(n)
private object MaxOccurrentCharSolution2 {
    private fun recurringChar(str: String): Char? {
        val set = mutableSetOf<Char>()

        str.forEach { char ->
            if (set.any { it == char }) {
                return char
            }

            set.add(char)
        }

        return null
    }
}

// Recursive naive approach: complexity O(n^2)
private object MaxOccurrentCharSolution3 {
    private fun recurringChar(str: String): Char? {
        str.forEachIndexed { index, c ->
            str.substring(index + 1).forEach {
                if (c == it) {
                    return it
                }
            }
        }

        return null
    }
}
