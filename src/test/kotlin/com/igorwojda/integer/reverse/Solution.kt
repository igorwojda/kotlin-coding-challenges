package com.igorwojda.integer.reverse

import kotlin.math.sign

private object Solution1 {
    private fun reverseInt(i: Int): Int {
        var reverse = i.toString().removePrefix("-").reversed()
        return reverse.toInt() * i.sign
    }
}

private object KtLintWillNotComplain
