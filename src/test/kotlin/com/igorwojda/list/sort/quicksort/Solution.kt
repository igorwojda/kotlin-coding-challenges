package com.igorwojda.list.sort.quicksort

// Time complexity (Best): Ω(n log(n))
// Time complexity (Average): Θ(l log(n))
// Time complexity (Worst): O(n^2)
// Space complexity: O(log(n))
private object Solution1 {
    private fun quickSort(list: MutableList<Int>, left: Int = 0, right: Int = list.lastIndex): List<Number> {
        // Rearrange elements and returns correct index of the pivot
        // All elements smaller than element will be on the left side of the array (smaller indexes)
        // All elements larger than element will be on the left side of the array (lager indexes)
        fun pivot(list: MutableList<Int>, start: Int = 0, end: Int = list.lastIndex): Int {
            val pivot = list[start] // We decide that pivot is our first element (it can be any element)
            var swapIndex = start // first index that we can swap (number of element that are less than pivot)

            (start + 1..end).forEach {
                if (pivot > list[it]) {
                    swapIndex++
                    list.swap(it, swapIndex)
                }
            }

            list.swap(start, swapIndex)

            return swapIndex
        }

        if (left < right) {
            val pivotIndex = pivot(list, left, right)

            // Sort left part
            quickSort(list, left, pivotIndex - 1)

            // Sort right part
            quickSort(list, pivotIndex + 1, right)
        }

        return list
    }

    private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}

// Time complexity (Best): Ω(n^2)
// Time complexity (Average): Θ(n^2)
// Time complexity (Worst): O(n^2)
// Space complexity: O(n)
private object Solution2 {
    private fun quickSort(list: MutableList<Int>): List<Number> {
        if (list.isEmpty()) {
            return list
        }

        val pivot = list.first() // We selected first element as pivot (it can be any element)
        var pivotIndex = 0 // first index that we can swap (number of element that are less than pivot)

        (0..list.lastIndex).forEach {
            if (pivot > list[it]) {
                list.swap(it, pivotIndex + 1)
                pivotIndex++
            }
        }

        // Move element to the correct index
        // All elements smaller than element will be on the left side of the array (smaller indexes)
        // All elements larger than element will be on the left side of the array (lager indexes)
        list.swap(0, pivotIndex)

        // Create left sub-list
        val left = list.subList(0, pivotIndex)

        // Create right sub-list
        val right = list.subList(pivotIndex + 1, list.size)

        return quickSort(left) + listOf(pivot) + quickSort(right)
    }

    private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}

private object KtLintWillNotComplain
