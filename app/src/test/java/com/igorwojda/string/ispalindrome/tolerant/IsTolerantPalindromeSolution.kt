package com.igorwojda.string.ispalindrome.tolerant

// iterative solution
private object Solution1 {
    private fun isTolerantPalindrome(str: String): Boolean {
        var characterRemoved = false

        str.forEachIndexed { index, c ->
            var lastIndex = str.lastIndex - index

            if (characterRemoved) {
                lastIndex--
            }

            if (index >= lastIndex) {
                return true
            }

            if (c != str[lastIndex]) {
                if (characterRemoved) {
                    return false
                } else {
                    characterRemoved = true
                }
            }
        }

        return false
    }
}
// recursive solution
private object Solution2 {
    private fun isTolerantPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
        return if (str.isEmpty() || str.length == 1) {
            true
        } else {
            if (str.first() == str.last()) {
                isTolerantPalindrome(
                    str.substring(1 until str.lastIndex),
                    characterRemoved
                )
            } else {
                if (characterRemoved) {
                    false
                } else {
                    if (str.length == 2) {
                        return true
                    }

                    println(str)
                    val removeLeftResult = isTolerantPalindrome(
                        str.substring(2 until str.lastIndex),
                        true
                    )
                    val removeRightResult = isTolerantPalindrome(
                        str.substring(1 until str.lastIndex - 1),
                        true
                    )

                    return removeLeftResult || removeRightResult
                }
            }
        }
    }
}

// recursive solution 2
private object Solution3 {
    private fun isTolerantPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
        val revStr = str.reversed()
        if (revStr == str) return true
        if (characterRemoved) return false

        val removeIndex = str.commonPrefixWith(revStr).length
        if (removeIndex + 1 > str.length) return false // reached end of string
        val reducedStr = str.removeRange(removeIndex, removeIndex + 1)
        return isTolerantPalindrome(reducedStr, true)
    }
}