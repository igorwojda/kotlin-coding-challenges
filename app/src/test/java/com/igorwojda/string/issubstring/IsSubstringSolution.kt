package com.igorwojda.string.issubstring

// Time complexity: O(n+m)
// Space complexity: O(1)
// Double pointer solution
private object OptimalSolution1 {
    private fun isSubstring(first: String, second: String): Boolean {
        if (first.isEmpty() && second.isEmpty()) return true
        if (first.length <= second.length) return false

        var i = 0
        var j = 0

        while (i <= first.lastIndex) {
            if (first[i] == second[j]) {
                j++
            }

            if (j == second.length) {
                return true
            }

            i++
        }

        return false
    }
}

// Time complexity: O(n+m)
// Space complexity: O(n*n)
// number of iterations is bounded by the length of the first string
// and String#drop requires copying the entire remaining string
// Recursive solution
private object Solution {
    private fun isSubstring(first: String, second: String): Boolean {
        if (second.length > first.length) {
            return false
        }

        if (second.isEmpty()) {
            return true
        }

        return if (first.first() == second.first()) {
            isSubstring(first.drop(1), second.drop(1))
        } else {
            isSubstring(first.drop(1), second)
        }
    }
}
