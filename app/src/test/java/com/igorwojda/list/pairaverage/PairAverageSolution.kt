package com.igorwojda.list.pairaverage

// Time complexity: O(n)
// Double pointer solution
private object OptimalSolution {
    fun hasAverage(list: List<Int>, average: Double): Boolean {
        if (list.size < 2) {
            return false
        }

        var leftIndex = 0
        var rightIndex = list.lastIndex

        while (leftIndex != rightIndex) {
            val pairAvg: Double = (list[leftIndex].toDouble() + list[rightIndex].toDouble()) / 2

            when {
                pairAvg == average -> return true
                pairAvg < average -> leftIndex++
                pairAvg > average -> rightIndex--
            }
        }

        return false
    }
}

private object KtLintWillNotComplain
