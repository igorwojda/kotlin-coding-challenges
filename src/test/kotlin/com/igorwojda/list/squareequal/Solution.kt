package com.igorwojda.list.squareequal

// Create two frequency map for each list and compare them
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun squareEquals(
        list: List<Int>,
        squared: List<Int>,
    ): Boolean {
        if (list.size != squared.size) {
            return false
        }

        val frequencyCounter1 = list.map { it * it }.groupBy { it }

        val frequencyCounter2 = squared.groupBy { it }

        return frequencyCounter1 == frequencyCounter2
    }
}

// Loop through first list and look for value square in the second list. If square if found
// remove it from second list to make sure that item frequency match.
// Time complexity: O(n^2) - indexOf and removeAt are O(n)
// Space complexity: O(n) - toMutableList copy
private object Solution2 {
    private fun squareEquals(
        list: List<Int>,
        squared: List<Int>,
    ): Boolean {
        val mutableList2 = squared.toMutableList()

        if (list.size != squared.size) {
            return false
        }

        list.forEach {
            // under the hood 'indexOf' iterates through entire list (it's like nested loop)
            val index = mutableList2.indexOf(it * it)

            if (index == -1) {
                return false
            }

            mutableList2.removeAt(index)
        }

        return true
    }
}
