package com.igorwojda.string.issubstring

// Kotlin Idiomatic Approach
private object Solution1 {
    private fun isSubstring(str: String, subStr: String): Boolean {
        return str.contains(subStr) && str.isNotEmpty() && subStr.isNotEmpty()
    }
}

// Time complexity: O(n*m)
// Space complexity: O(1)
//
// Optimal solution using double pointer.
private object Solution2 {
    private fun isSubstring(str: String, subStr: String): Boolean {
        if (str.isEmpty() || subStr.isEmpty()) return false
        if (str.length < subStr.length) return false

        var pointer1 = 0
        var pointer2 = 0

        while (pointer1 <= str.lastIndex) {
            if (str[pointer1] == subStr[pointer2]) {
                pointer1++
                pointer2++
                if (pointer2 == subStr.length) {
                    return true
                }
            } else {
                pointer1 = pointer1 - pointer2 + 1
                pointer2 = 0
            }
        }

        return false
    }
}

// Time complexity: O(n*m)
// Space complexity: ??, but more than O(1)
// Number of iterations (n) is bounded by the length of the first string
// and String.drop requires copying the entire remaining string (on it's own it has O(m) complexity)
// First of 5 chars, needs 5 iterations at most and 15 character copied (5+4+3+2+1=15). Second is copied less often.
//
// Recursive solution
private object Solution3 {
    private fun isSubstring(str: String, subStr: String): Boolean {
        fun isExactMatch(str: String, subStr: String): Boolean {
            if (subStr.length > str.length) {
                return false
            }

            return when {
                str.isEmpty() && subStr.isEmpty() -> true
                str.isNotEmpty() && subStr.isEmpty() -> true
                else -> str[0] == subStr[0] && isExactMatch(str.drop(1), subStr.drop(1))
            }
        }

        if (subStr.length > str.length) {
            return false
        }
        if (str.isEmpty() || subStr.isEmpty()) {
            return false
        }

        return isExactMatch(str, subStr) || isSubstring(str.drop(1), subStr)
    }
}

// Time complexity: O(n*m)
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

            when {
                localPointer1 <= first.lastIndex && localPointer2 <= second.lastIndex -> {
                    helper(first, second, localPointer1, localPointer2)
                }
                localPointer2 <= second.lastIndex && localPointer1 > first.lastIndex -> false
                else -> true
            }
        } else {
            val p1 = firstPointer1 - secondPointer2 + 1

            if (p1 > first.lastIndex) {
                return false
            } else {
                helper(first, second, p1, 0)
            }
        }
    }

    return helper(str, subStr)
}
