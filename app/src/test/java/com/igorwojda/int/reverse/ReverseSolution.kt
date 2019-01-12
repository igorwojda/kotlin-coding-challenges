package com.igorwojda.int.reverse

import kotlin.math.sign

private object ReverseSolution {
    private fun reverseInt(i: Int): Int {
        var reverse = i.toString().removePrefix("-").reversed()
        return reverse.toInt() * i.sign
    }
}
