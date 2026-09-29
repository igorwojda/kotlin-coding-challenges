package com.igorwojda.string.getduplicatedarguments

// Determine the frequency of each argument and then filter arguments with frequency > 1
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    fun getDuplicatedArguments(vararg strings: String): List<String>? = strings
        .groupingBy { it }
        .eachCount()
        .filter { it.value != 1 }
        .map { it.key }
}

// Loop through all arguments and compare given argument with all other arguments.
// Time complexity: O(n^2)
// Space complexity: O(n)
private object Solution2 {
    fun getDuplicatedArguments(vararg strings: String): List<String>? {
        val result = mutableSetOf<String>()

        strings.forEachIndexed { index, element1 ->
            (index + 1..strings.lastIndex).forEach { index2 ->
                if (element1 == strings[index2]) {
                    result.add(element1)
                }
            }
        }

        return result.toList()
    }
}
