package com.igorwojda.codingpuzzle

import kotlin.math.sign

private fun reverseIntSolution(i: Int): Int {
    var reverse = i.toString().removePrefix("-").reversed()
    return reverse.toInt() * i.sign
}
