package com.igorwojda.list.pairaverage

// Time complexity: O(n)
// Optimal solution using double pointer.
private object Solution1 {
    fun hasAverage(list: List<Int>, average: Double): Boolean {
        if (list.size < 2) {
            return false
        }

        var pointer1 = 0
        var pointer2 = list.lastIndex

        while (pointer1 != pointer2) {
            val pairAvg: Double = (list[pointer1].toDouble() + list[pointer2].toDouble()) / 2

            when {
                pairAvg == average -> return true
                pairAvg < average -> pointer1++
                pairAvg > average -> pointer2--
            }
        }

        return false
    }
}

private object KtLintWillNotComplain
