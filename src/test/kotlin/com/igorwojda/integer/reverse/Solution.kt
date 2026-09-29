package com.igorwojda.integer.reverse

import kotlin.math.sign

// Time complexity: O(d) - d is number of digits
// Space complexity: O(d)
private object Solution1 {
    private fun reverseInt(i: Int): Int {
        val reverse = i.toString().removePrefix("-").reversed()
        return reverse.toInt() * i.sign
    }
}

private object KtLintWillNotComplain
