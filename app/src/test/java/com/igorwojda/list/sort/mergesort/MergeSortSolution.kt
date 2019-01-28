package com.igorwojda.list.sort.mergesort

// Time complexity (Best): Ω(n log(n))
// Time complexity (Average): Θ(n log(n))
// Time complexity (Worst): O(n log(n))
// Space complexity: O(1)
private object Solution {
    private fun mergeSort(list: List<Int>): List<Int> {
        if (list.size == 1) {
            return list
        }

        val centerIndex = list.lastIndex / 2

        val left = list.subList(0, centerIndex + 1)
        val right = list.subList(centerIndex + 1, list.lastIndex + 1)

        return merge(mergeSort(left), mergeSort(right))
    }

    // Take two sorted lists and merge them together into one sorted list
    private fun merge(left: List<Int>, right: List<Int>): MutableList<Int> {
        val result = mutableListOf<Int>()
        val mutableLeft = left.toMutableList()
        val mutableRight = right.toMutableList()

        while (mutableLeft.isNotEmpty() && mutableRight.isNotEmpty()) {
            if (mutableLeft.first() < mutableRight.first()) {
                result.add(mutableLeft.removeAt(0))
            } else {
                result.add(mutableRight.removeAt(0))
            }
        }

        result.addAll(mutableLeft)
        result.addAll(mutableRight)

        return result
    }
}

private object KtLintWillNotComplain
