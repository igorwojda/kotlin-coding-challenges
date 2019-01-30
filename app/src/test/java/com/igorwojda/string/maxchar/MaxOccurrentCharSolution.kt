package com.igorwojda.string.maxchar

// Kotlin idiomatic solution
private object Solution1 {
    private fun maxOccurrentChar(str: String): Char? {
        return str.toCharArray()
            .groupBy { it }
            .maxBy { it.value.size }
            ?.key
    }
}

// Kotlin idiomatic solution
private object Solution2 {
    private fun maxOccurrentChar(str: String): Char? {
        return str.toList()
            .groupingBy { it }
            .eachCount()
            .maxBy { it.value }
            ?.key
    }
}

private object Solution3 {
    private fun maxOccurrentChar(str: String): Char? {
        val map = mutableMapOf<Char, Int>()

        str.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        return map.maxBy { it.value }?.key
    }
}

// Recursive optimal approach:
// Time complexity: O(n)
private object Solution4 {
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

// Recursive naive approach
// Time complexity: O(n^2)
private object Solution5 {
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

