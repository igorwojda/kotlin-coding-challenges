package com.igorwojda.string.ispalindrome.basic

// string reverse
private object PalindromeSolution1 {
    private fun palindrome(str: String): Boolean {
        return str == str.reversed()
    }
}

// iterative, double pointer solution
private object PalindromeSolution2 {
    private fun palindrome(str: String): Boolean {
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
private object PalindromeSolution3 {
    private fun palindrome(str: String): Boolean {
        return if (str.isEmpty() || str.length == 1) {
            true
        } else {
            if (str.first() == str.last()) {
                palindrome(str.substring(1 until str.lastIndex))
            } else {
                false
            }
        }
    }
}
