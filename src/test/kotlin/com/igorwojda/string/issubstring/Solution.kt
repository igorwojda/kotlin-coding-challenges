package com.igorwojda.string.issubstring

// Optimal solution using double pointer.
// Time complexity: O(n * m) - n is str length, m is subStr length
// Space complexity: O(1)
private object Solution1 {
    private fun isSubstring(
        str: String,
        subStr: String,
    ): Boolean {
        if (subStr.isEmpty()) return true
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

// Recursive solution
// Time complexity: O(n^2 * m) - n is str length, m is subStr length; each drop copies the remaining string
// Space complexity: O(n^2) - recursion stack of depth n, each frame holds a dropped copy of str
private object Solution2 {
    private fun isSubstring(
        str: String,
        subStr: String,
    ): Boolean {
        fun isExactMatch(
            str: String,
            subStr: String,
        ): Boolean {
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
            return true
        }

        return isExactMatch(str, subStr) || isSubstring(str.drop(1), subStr)
    }
}

// Time complexity: O(n * m) - n is str length, m is subStr length
// Space complexity: O(n * m) - windowed materializes all windows
private object Solution3 {
    private fun isSubstring(
        str: String,
        subStr: String,
    ): Boolean {
        if (subStr.isEmpty()) return true

        return str
            .windowed(subStr.length)
            .any { it == subStr }
    }
}

// Recursive solution
// This recursive solution is faster than solution with String.drop because it uses double pointer
// Time complexity: O(n * m) - n is str length, m is subStr length
// Space complexity: O(n * m) - recursion stack, one frame per character comparison (no tailrec)
private fun isSubstring(
    str: String,
    subStr: String,
): Boolean {
    if (subStr.isEmpty()) {
        return true
    }

    fun helper(
        first: String,
        second: String,
        firstPointer1: Int = 0,
        secondPointer2: Int = 0,
    ): Boolean {
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

                localPointer2 <= second.lastIndex && localPointer1 > first.lastIndex -> {
                    false
                }

                else -> {
                    true
                }
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
