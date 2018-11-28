package com.igorwojda.codingpuzzle


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
