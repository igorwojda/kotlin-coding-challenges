package com.igorwojda.integer.stepsgenerator

// Kotlin repeat function
private object Solution1 {
    private fun generateSteps(n: Int) = List(n) { "#".repeat(it + 1) + " ".repeat(n - it - 1) }
}

// iterative solution
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
