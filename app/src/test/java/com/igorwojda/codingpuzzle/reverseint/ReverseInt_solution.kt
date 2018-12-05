package com.igorwojda.codingpuzzle.reverseint

import kotlin.math.sign

private object ReverseIntSolution {
    private fun reverseInt(i: Int): Int {
        var reverse = i.toString().removePrefix("-").reversed()
        return reverse.toInt() * i.sign
    }
}
