package com.igorwojda.codingpuzzle

//iterative solution
private fun tolerantPalindromeSolution1(str: String): Boolean {
    var characterRemoved = false

    str.forEachIndexed { index, c ->
        var lastIndex = str.lastIndex - index

        if(characterRemoved) {
            lastIndex--
        }

        if(index >= lastIndex) {
            return true
        }

        if(c != str[lastIndex]) {
            if(characterRemoved) {
                return false
            } else {
                characterRemoved = true
            }
        }
    }

    return false
}

//recursive solution
private fun tolerantPalindromeSolution2(str: String, characterRemoved: Boolean = false): Boolean {
    return if(str.isEmpty() || str.length == 1) {
        true
    } else {
        if(str.first() == str.last()) {
            tolerantPalindromeSolution2(str.substring(1 until str.lastIndex), characterRemoved)
        }
        else {
            if(characterRemoved) {
                false
            } else {
                if (str.length == 2) {
                    return true
                }

                println(str)
                val removeLeftResult = tolerantPalindromeSolution2(str.substring(2 until str.lastIndex), true)
                val removeRightResult = tolerantPalindromeSolution2(str.substring(1 until str.lastIndex - 1), true)

                return removeLeftResult || removeRightResult
            }
        }
    }
}
