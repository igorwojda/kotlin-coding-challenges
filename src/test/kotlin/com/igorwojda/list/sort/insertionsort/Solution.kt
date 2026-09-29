package com.igorwojda.list.sort.insertionsort

// Time complexity: O(n^2) - removeAt/add shift elements even for sorted input
// Space complexity: O(1)
private object Solution1 {
    private fun insertionSort(list: MutableList<Int>): List<Int> {
        (1..list.lastIndex).forEach { i ->
            var j = i - 1

            while (j >= 0 && list[j] > list[i]) {
                j--
            }

            list.removeAt(i).also {
                list.add(j + 1, it)
            }
        }

        return list
    }
}

private object KtLintWillNotComplain
