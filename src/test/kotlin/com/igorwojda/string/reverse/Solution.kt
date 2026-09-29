package com.igorwojda.string.reverse

// Kotlin idiomatic way
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun reverse(str: String): String = str.reversed()
}

// Iterative approach
// Time complexity: O(n^2) - string concatenation in loop
// Space complexity: O(n)
private object Solution2 {
    private fun reverse(str: String): String {
        var reversed = ""
        str.forEach {
            reversed = it + reversed
        }
        return reversed
    }
}

// Recursive approach
// Time complexity: O(n^2) - drop and concatenation copy at each of n recursion levels
// Space complexity: O(n^2) - recursion stack of depth n, each frame holds a dropped copy
private object Solution3 {
    private fun reverse(str: String): String {
        if (str.isEmpty()) {
            return str
        }

        return reverse(str.drop(1)) + str.first()
    }
}

// Kotlin fold
// Time complexity: O(n^2) - string concatenation in fold
// Space complexity: O(n)
private object Solution4 {
    private fun reverse(str: String): String = str.foldRight("") { char, reversed -> reversed + char }
}

// Reverse in place
// Time complexity: O(n)
// Space complexity: O(n) - toMutableList and joinToString copies
private object Solution5 {
    private fun reverse(str: String): String {
        val chars = str.toMutableList()

        var leftIndex = 0
        var rightIndex = chars.lastIndex

        while (leftIndex <= rightIndex) {
            val temp = chars[leftIndex]
            chars[leftIndex] = chars[rightIndex]
            chars[rightIndex] = temp

            leftIndex++
            rightIndex--
        }

        return chars.joinToString(transform = { it.toString() }, separator = "")
    }
}
