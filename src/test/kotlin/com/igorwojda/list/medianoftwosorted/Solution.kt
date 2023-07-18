package com.igorwojda.list.medianoftwosorted

// Time complexity: O(log (m+n))
private object Solution1 {
    fun medianOfSortedLists(nums1: IntArray, nums2: IntArray): Double {
        val mergedArray = nums1.plus(nums2)
        mergedArray.sort()

        val median = if (mergedArray.size % 2 != 0) {
            mergedArray[mergedArray.size / 2].toDouble()
        } else {
            (mergedArray[mergedArray.size / 2].toDouble() + mergedArray[mergedArray.size / 2 - 1].toDouble()) / 2
        }
        return median
    }
}

// Time complexity: O(n)
// Space complexity O(n)
private object Solution2 {
    fun medianOfSortedLists(nums1: IntArray, nums2: IntArray): Double {
        val mergedArray = nums1.plus(nums2)
        mergedArray.sort()

        val median = if (mergedArray.size % 2 != 0) {
            mergedArray[mergedArray.size / 2].toDouble()
        } else {
            (mergedArray[mergedArray.size / 2].toDouble() + mergedArray[mergedArray.size / 2 - 1].toDouble()) / 2
        }
        return median
    }
}

private object KtLintWillNotComplain
