package com.igorwojda.string.issubstring

// Time complexity: O(n+m)
// Space complexity: O(1)
//
// Optimal solution using double pointer.
private object Solution1 {
    private fun isSubstring(str: String, subStr: String): Boolean {
        if (str.isEmpty() || subStr.isEmpty()) return false
        if (str.length <= subStr.length) return false

        var pointer1 = 0
        var pointer2 = 0

        while (pointer1 <= str.lastIndex) {
            if (str[pointer1] == subStr[pointer2]) {
                pointer2++
            }

            if (pointer2 == subStr.length) {
                return true
            }

            pointer1++
        }

        return false
    }
}

// Time complexity: O(n+m)
// Space complexity: ??, but more than O(1)
// Number of iterations (n) is bounded by the length of the first string
// and String.drop requires copying the entire remaining string (on it's own it has O(m) complexity)
// First of 5 chars, needs 5 iterations at most and 15 character copied (5+4+3+2+1=15). Second is copied less often.
//
// Recursive solution
private object Solution2 {
    private fun isSubstring(str: String, subStr: String): Boolean {
        if (subStr.length > str.length) {
            return false
        }

        if (str.isEmpty() || subStr.isEmpty()) {
            return false
        }

        return if (str.first() == subStr.first()) {
            val localStr = str.drop(1)
            val localSubStr = subStr.drop(1)

            if (localStr.first() == localSubStr.first()) {
                true
            } else {
                isSubstring(localStr, localSubStr.drop(1))
            }
        } else {
            isSubstring(str.drop(1), subStr)
        }
    }
}

// Time complexity: O(n)
// Space complexity: O(1)
// This recursive solution is faster than solution with String.drop because it uses double pointer
//
// Recursive solution

private fun isSubstring(str: String, subStr: String): Boolean {
    if (str.isEmpty() || subStr.isEmpty()) {
        return false
    }

    fun helper(first: String, second: String, firstPointer1: Int = 0, secondPointer2: Int = 0): Boolean {
        if (firstPointer1 > first.lastIndex) {
            return false
        }

        return if (first[firstPointer1] == second[secondPointer2]) {
            val localPointer1 = firstPointer1 + 1
            val localPointer2 = secondPointer2 + 1

            if (localPointer1 > first.lastIndex || localPointer2 > second.lastIndex) {
                return true
            } else {
                helper(first, second, localPointer1, localPointer2)
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

    return helper(str, subStr)
}