package com.igorwojda.string.ispalindrome.permutation

// frequency map solution
private object Solution1 {
    private fun isPermutationPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
        val charactersFrequencyMap = str.groupingBy { it }.eachCount()

        val filtered = charactersFrequencyMap.filter { it.value % 2 == 1 }

        return filtered.size <= 1
    }
}

private object Solution2 {
    private fun isPermutationPalindrome(str: String): Boolean {
        return str
            .groupBy { it }
            .map { it.value }
            .map { it.size }
            .count { it % 2 == 1 } == 1
    }
}
