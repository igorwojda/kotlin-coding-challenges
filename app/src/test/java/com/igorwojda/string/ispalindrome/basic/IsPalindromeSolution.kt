package com.igorwojda.string.ispalindrome.basic

// string reverse
private object Solution1 {
    private fun isPalindrome(str: String): Boolean {
        return str == str.reversed()
    }
}

// iterative, double pointer solution
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
private object Solution3 {
    private fun isPalindrome(str: String): Boolean {
        str.forEachIndexed { index, char ->
            val rightIndex = str.lastIndex - index

            if (char != str[rightIndex])
                return false

            if (index > rightIndex)
                return true
        }

        return true
    }
}

// recursive solution
private object Solution4 {
    private fun isPalindrome(str: String): Boolean {
        return if (str.isEmpty() || str.length == 1) {
            true
        } else {
            if (str.first() == str.last()) {
                isPalindrome(str.substring(1 until str.lastIndex))
            } else {
                false
            }
        }
    }
}
