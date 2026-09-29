package com.igorwojda.integer.stepsgenerator

// Kotlin repeat function
// Time complexity: O(n^2)
// Space complexity: O(n^2)
private object Solution1 {
    private fun generateSteps(n: Int) = List(n) { "#".repeat(it + 1) + " ".repeat(n - it - 1) }
}

// iterative solution
// Time complexity: O(n^3) - String concatenation in loop is O(n^2) per row
// Space complexity: O(n^2)
private object Solution2 {
    private fun generateSteps(n: Int): MutableList<String> {
        val list = mutableListOf<String>()

        (1..n).forEach { row ->
            var item = ""

            (1..n).forEach { column ->
                val char = if (column <= row) '#' else ' '
                item += char
            }

            list.add(item)
        }

        return list
    }
}
