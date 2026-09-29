package com.igorwojda.integer.digitfrequency

// Generate digit frequency map for each integer and compare them
// Time complexity: O(d) - d is number of digits
// Space complexity: O(d)
private object Solution1 {
    private fun equalDigitFrequency(
        i1: Int,
        i2: Int,
    ): Boolean {
        val i1Str = i1.toString()
        val i2Str = i2.toString()

        if (i1Str.length != i2Str.length) {
            return false
        }

        val frequencyCounter1 = i1Str.groupingBy { it }.eachCount()
        val frequencyCounter2 = i2Str.groupingBy { it }.eachCount()
        return frequencyCounter1 == frequencyCounter2
    }
}

// Loop through each character of first integer and look for this character in another integer. If character if found
// remove it from second integer to make sure that character frequency match.
// Time complexity: O(d^2) - d is number of digits; indexOf and removeAt are O(d)
// Space complexity: O(d)
private object Solution2 {
    private fun equalDigitFrequency(
        i1: Int,
        i2: Int,
    ): Boolean {
        val i1Str = i1.toString().toList()
        val i2Str = i2.toString().toMutableList()

        if (i1Str.size != i2Str.size) {
            return false
        }

        i1Str.forEach {
            // under the hood 'indexOf' iterates through entire list (it's like nested loop)
            val index = i2Str.indexOf(it)

            if (index == -1) {
                return false
            }

            i2Str.removeAt(index)
        }

        return true
    }
}
