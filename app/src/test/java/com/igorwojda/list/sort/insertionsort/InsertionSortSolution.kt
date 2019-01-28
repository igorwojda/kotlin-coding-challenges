package com.igorwojda.list.sort.insertionsort

private object Solution {
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
