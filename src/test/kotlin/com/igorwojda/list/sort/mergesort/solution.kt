package com.igorwojda.list.sort.mergesort

// Time complexity (Best): Ω(n log(n))
// Time complexity (Average): Θ(n log(n))
// Time complexity (Worst): O(n log(n))
// Space complexity: O(n)
private object Solution1 {
    private fun mergeSort(list: List<Int>): List<Int> {
        if (list.size <= 1) return list

        // Take two sorted lists and merge them together into one sorted list
        fun merge(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int> {
            val result = mutableListOf<Int>()

            while (left.isNotEmpty() && right.isNotEmpty()) {
                if (left.first() < right.first()) {
                    result.add(left.removeAt(0))
                } else {
                    result.add(right.removeAt(0))
                }
            }

            result.addAll(left)
            result.addAll(right)

            return result
        }

        val mid = list.size / 2
        val left = mergeSort(list.subList(0, mid)).toMutableList()
        val right = mergeSort(list.subList(mid, list.size)).toMutableList()
        return merge(left, right)
    }
}

private object KtLintWillNotComplain
