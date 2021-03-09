package com.igorwojda.string.hasrepeatedcharacter

// Time complexity: O(n)
private object Solution1 {
    private fun hasRepeatedChar(str: String): Boolean {
        val frequency = str.groupingBy { it }.eachCount()
        return frequency.any { it.value > 1 }
    }
}

// Time complexity: O(n)
private object Solution2 {
    private fun hasRepeatedChar(str: String): Boolean {
        val frequency = str.groupingBy { it }.eachCount()

        frequency.forEach {
            if (it.value > 1) {
                return true
            }
        }

        return false
    }
}
