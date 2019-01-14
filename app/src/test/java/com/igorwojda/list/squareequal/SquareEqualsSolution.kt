package com.igorwojda.list.squareequal

private object SquareEqualasSolution1 {
    // Time complexity: O(n)
    // Create two frequency map for each list and compare them
    private fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
        if (list1.size != list2.size) {
            return false
        }

        val frequencyCounter1 = list1.groupingBy { it }.eachCount()
        val frequencyCounter2 = list2.groupingBy { it }.eachCount()

        return frequencyCounter1 == frequencyCounter2
    }
}

private object NaiveSolution {
    // Time complexity: O(n^2)
    // Loop through first list and look for value square in the second list. If square if found remove it from
    // second list to make sure that item frequency match.
    private fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
        val mutableList2 = list2.toMutableList()

        if (list1.size != list2.size) {
            return false
        }

        list1.forEach {
            //under the hood 'indexOf' iterates through entire list (it's like nested loop)
            val index = mutableList2.indexOf(it * it)

            if (index == -1) {
                return false
            }

            mutableList2.removeAt(index)
        }

        return true
    }
}
