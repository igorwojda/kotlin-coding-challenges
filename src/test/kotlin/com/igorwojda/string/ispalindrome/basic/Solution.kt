package com.igorwojda.string.ispalindrome.basic

// string reverse
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun isPalindrome(str: String): Boolean = str == str.reversed()
}

// iterative, double pointer solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution2 {
    private fun isPalindrome(str: String): Boolean {
        var leftIndex = 0
        var rightIndex = str.lastIndex

        while (leftIndex <= rightIndex) {
            val leftValue = str[leftIndex]
            val rightValue = str[rightIndex]

            if (leftValue != rightValue) {
                return false
            }

            leftIndex++
            rightIndex--
        }

        return true
    }
}

// iterative, double pointer solution
// Time complexity: O(n)
// Space complexity: O(1)
private object Solution3 {
    private fun isPalindrome(str: String): Boolean {
        str.forEachIndexed { index, char ->
            val rightIndex = str.lastIndex - index

            if (char != str[rightIndex]) {
                return false
            }

            if (index > rightIndex) {
                return true
            }
        }

        return true
    }
}

// recursive solution
// Time complexity: O(n^2) - substring copy at each of n/2 recursion levels
// Space complexity: O(n^2) - recursion stack of depth n/2, each frame holds a substring copy
private object Solution4 {
    private fun isPalindrome(str: String): Boolean = if (str.isEmpty() || str.length == 1) {
        true
    } else {
        if (str.first() == str.last()) {
            isPalindrome(str.substring(1 until str.lastIndex))
        } else {
            false
        }
    }
}
