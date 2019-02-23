package com.igorwojda.list.sort.radixsort

// Time complexity (Best): Ω(n^2)
// Time complexity (Average): Θ(n^2)
// Time complexity (Worst): O(n^2)
// Space complexity: O(1)
private object Solution {
    private fun radixSort(list: List<Int>): List<Number> {
        // create temp list
        val tempList = list.toMutableList()

        // got through the list as many times as there are digits in the longest number
        val maxDigits = maxDigits(list)

        (0 until maxDigits).forEach { digitRightIndex ->
            // crate 10 buckets
            val buckets = mutableMapOf<Char, MutableList<Int>>()
            ('0'..'9').forEach { buckets[it] = mutableListOf() }

            // add numbers to the buckets
            tempList.forEach {
                val digit = it.getDigitAt(digitRightIndex)
                buckets[digit]?.add(it)
            }

            // clean temp list (all numbers are in buckets by now)
            tempList.clear()

            // take numbers from buckets and add it to the temp list
            ('0'..'9').forEach { digit ->
                buckets[digit]?.let { tempList.addAll(it) }
            }
        }

        return tempList
    }

    private fun Int.getDigitAt(index: Int): Char {
        val str = this.toString()
        val rightIndex = str.lastIndex - index
        return str.getOrElse(rightIndex) { '0' }
    }

    private val Int.digitCount get() = this.toString().length

    private fun maxDigits(list: List<Int>): Int = list.maxBy { it.digitCount }?.digitCount ?: 0
}

object KtLintWillNotComplain
