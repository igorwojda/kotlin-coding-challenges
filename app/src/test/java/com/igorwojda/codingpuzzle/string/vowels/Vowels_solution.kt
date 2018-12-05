package com.igorwojda.codingpuzzle.string.vowels

//Kotlin collection processing
object VowelsSolution1 {
    private fun vowels(str: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        return str.count { it.toLowerCase() in vowels }
    }
}

//Iterative
object VowelsSolution2 {
    private fun vowels(str: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        var counter = 0

        str.forEach {
            if (vowels.contains(it.toLowerCase())) {
                counter++
            }
        }

        return counter
    }
}

