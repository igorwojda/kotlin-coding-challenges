package com.igorwojda.string.reverse

// Kotlin idiomatic way
private object Solution1 {
    private fun reverse(str: String): String {
        return str.reversed()
    }
}

// Iterative approach
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
private object Solution3 {
    private fun reverse(str: String): String {
        if (str.isEmpty()) {
            return str
        }

        return reverse(str.drop(1)) + str.first()
    }
}

// Kotlin fold
private object Solution4 {
    private fun reverse(str: String): String {
        return str.foldRight("") { char, reversed -> reversed + char }
    }
}

// Time complexity: O(n)
// Space complexity: O(1)
// Reverse in place
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
