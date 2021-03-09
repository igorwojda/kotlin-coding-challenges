package com.igorwojda.list.sort.bubblesort

// Time complexity (Best): Ω(n) - all data besides one element are sorted
// Time complexity (Average): Θ(n^2)
// Time complexity (Worst): O(n^2)
// Space complexity: O(1)
private object Solution1 {
    private fun bubbleSort(list: List<Int>): List<Number> {
        val sorted = list.toMutableList()

        (0..sorted.lastIndex).forEach { i ->
            var swapped = false
            (0 until (sorted.size - i - 1)).forEach { j ->
                val element = sorted[j]
                val nextElement = sorted[j + 1]

                if (element > nextElement) {
                    sorted[j] = nextElement
                    sorted[j + 1] = element
                    swapped = true
                }
            }

            if (!swapped) {
                return sorted
            }
        }

        return sorted
    }
}

private object KtLintWillNotComplain
