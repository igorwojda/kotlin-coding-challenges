package com.igorwojda.string.issubstring

// Time complexity: O(n+m)
// Space complexity: O(1)
//
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
// Space complexity: ??, but more than O(1)
// Number of iterations (n) is bounded by the length of the first string
// and String.drop requires copying the entire remaining string (on it's own it has O(m) complexity)
// String of 5 chars, needs 5 iterations at most and 15 character copied (5+4+3+2+1=15)
//
// Recursive solution
private object RecursiveSolution1 {
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

// Time complexity: O(n)
// Space complexity: O(1)
// This recursive solution is faster than solution with String.drop because it uses double pointer
//
// Recursive solution

private object RecursiveSolution2 {
    private fun isSubstring(first: String, second: String): Boolean {
        if (second.isEmpty()) {
            return true
        }

        fun helper(first: String, second: String, firstPointer1: Int = 0, secondPointer2: Int = 0): Boolean {
            if (firstPointer1 > first.lastIndex) {
                return false
            }

            return if (first[firstPointer1] == second[secondPointer2]) {
                val p1 = firstPointer1 + 1
                val p2 = secondPointer2 + 1

                if (p1 > first.lastIndex || p2 > second.lastIndex) {
                    return true
                } else {
                    helper(first, second, p1, p2)
                }
            } else {
                val p1 = firstPointer1 + 1

                if (p1 > first.lastIndex) {
                    return false
                } else {
                    helper(first, second, p1, secondPointer2)
                }
            }
        }

        return helper(first, second)
    }
}