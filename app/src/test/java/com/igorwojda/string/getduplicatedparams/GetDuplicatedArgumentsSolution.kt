package com.igorwojda.string.getduplicatedparams

// Time complexity: O(n)
// determine the frequency of each argument and then filter arguments with frequency > 1
private object OptimalSolution1 {
    fun getDuplicatedParams(vararg strings: String): List<String>? = strings
        .groupingBy { it }
        .eachCount()
        .filter { it.value != 1 }
        .map { it.key }
}

// Time complexity: O(n)
// use double pointers
private object OptimalSolution2 {
    fun getDuplicatedParams(vararg strings: String): List<String>? {
        var currentIndex = 0
        var nextIndex = 1
        val result = mutableSetOf<String>()
        val sortedList = strings.sorted()

        for (it in 0 until sortedList.lastIndex) {
            if (sortedList[currentIndex] == sortedList[nextIndex]) {
                result.add(sortedList[currentIndex])
            }

            currentIndex++
            nextIndex++
        }

        return result.toList()
    }
}

// Time complexity: O(n^2)
// Loop through all arguments and compare given argument with all other arguments.
private object NaiveSolution {
    fun getDuplicatedParams(vararg strings: String): List<String>? {
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
