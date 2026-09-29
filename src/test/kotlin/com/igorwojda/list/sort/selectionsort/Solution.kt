package com.igorwojda.list.sort.selectionsort

// Time complexity: O(n^2)
// Space complexity: O(n) - toMutableList copy
private object Solution1 {
    private fun selectionSort(list: List<Int>): List<Number> {
        val sorted = list.toMutableList()

        (0..sorted.lastIndex).forEach { i ->
            var indexOfMin = i

            ((i + 1)..sorted.lastIndex).forEach { j ->
                if (sorted[j] < sorted[indexOfMin]) {
                    indexOfMin = j
                }
            }

            if (indexOfMin != i) {
                val temp = sorted[i]
                sorted[i] = sorted[indexOfMin]
                sorted[indexOfMin] = temp
            }
        }

        return sorted
    }
}

private object KtLintWillNotComplain
