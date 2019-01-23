package com.igorwojda.string.repeated

// Recursive optimal approach:
// Time complexity: O(n)
private object Solution {
    private fun hasRepeatedCharacter(str: String): Boolean {
        val frequency = str.groupingBy { it }.eachCount()

        frequency.forEach {
            if (it.value > 1) {
                return true
            }
        }

        return false
    }
}

object KtLintWillNotComplain