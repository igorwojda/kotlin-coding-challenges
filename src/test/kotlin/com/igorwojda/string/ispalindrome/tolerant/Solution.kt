package com.igorwojda.string.ispalindrome.tolerant

// iterative solution
private object Solution1 {
    private fun isTolerantPalindrome(str: String): Boolean {
        var characterRemoved = false
        var leftIndex = 0
        var rightIndex = str.lastIndex
        while (leftIndex <= rightIndex) {
            if (str[leftIndex] != str[rightIndex]) {
                if (characterRemoved) {
                    return false
                }
                characterRemoved = true
                when {
                    str[leftIndex + 1] == str[rightIndex] -> leftIndex++
                    str[leftIndex] == str[rightIndex - 1] -> rightIndex--
                    else -> return false
                }
            }
            leftIndex++
            rightIndex--
        }
        return true
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

        // Remove a single non matching character and re-compare
        val removeIndex = str.commonPrefixWith(revStr).length
        if (removeIndex + 1 > str.length) return false // reached end of string
        val reducedStr = str.removeRange(removeIndex, removeIndex + 1)
        return if (isTolerantPalindrome(reducedStr, true)) {
            true
        } else {
            val reducedRevStr = revStr.removeRange(removeIndex, removeIndex + 1)
            isTolerantPalindrome(reducedRevStr, true)
        }
    }
}
