package com.igorwojda.codingpuzzle

private fun palindromeSolution1(str: String): Boolean {
    return str == str.reversed()
}

private fun palindromeSolution2(str: String): Boolean {
    str.forEachIndexed { index, char ->
        val rightIndex = str.length - index - 1

        if(char != str[rightIndex])
            return false

        if(index > rightIndex)
            return true
    }

    return true
}

//not working, because kotlin does not have allIndexed - equivalent of Array.prototype.every()
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/every
//private fun palindrome(str: String): Boolean {
//    return str.allIndexed { index, char ->
//        char == str[str.length - index - 1]
//    }
//}
