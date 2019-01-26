package com.igorwojda.list.binarysearch

// Time complexity:
// Worst-case performance: O(log n)
// Best-case performance: O(1)
// Average performance: O(log n)
private object Solution {
    private fun binarySearch(list: List<Char>, element: Char): Int {

        fun getMiddle(left: Int, right: Int) = Math.floor((right + left).toDouble() / 2).toInt()

        var left = 0
        var right = list.lastIndex
        var middle = getMiddle(left, right)

        while (list[middle] != element && left <= right) {
            if (element < list[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }

            middle = getMiddle(left, right)
        }

        return if (list[middle] == element) {
            middle
        } else {
            -1
        }
    }
}

object KtLintWillNotComplain