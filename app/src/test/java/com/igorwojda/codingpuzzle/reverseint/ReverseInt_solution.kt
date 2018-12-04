package com.igorwojda.codingpuzzle.reverseint

import kotlin.math.sign

private fun reverseIntSolution(i: Int): Int {
    var reverse = i.toString().removePrefix("-").reversed()
    return reverse.toInt() * i.sign
}
