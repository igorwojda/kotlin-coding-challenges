package com.igorwojda.string.hasrepeatedcharacter

// Time complexity: O(n)
private object Solution {
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

private object KtLintWillNotComplain