package com.igorwojda.codingpuzzle

//string reverse
private fun palindromeSolution1(str: String): Boolean {
    return str == str.reversed()
}

//iterative, double pointer solution
private fun palindromeSolution2(str: String): Boolean {
    str.forEachIndexed { index, char ->
        val rightIndex = str.lastIndex - index

        if(char != str[rightIndex])
            return false

        if(index > rightIndex)
            return true
    }

    return true
}

//recursive solution
private fun palindromeSolution3(str: String): Boolean {
    return if(str.isEmpty() || str.length == 1) {
        true
    } else {
        if(str.first() == str.last()) {
            palindromeSolution3(str.substring(1 until str.lastIndex))
        } else {
            false
        }
    }
}
