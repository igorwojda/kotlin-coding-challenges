package com.igorwojda.list.squareequal

private object SquareEqualasSolution1 {
    // Optimal solution
    // Complexity: O(n)
    private fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
        if (list1.size != list2.size) {
            return false
        }

        val frequencyCounter1 = mutableMapOf<Int, Int>()
        list1.forEach {
            val key = it * it
            frequencyCounter1.merge(key, 1, Int::plus)
        }

        val frequencyCounter2 = mutableMapOf<Int, Int>()
        list2.forEach {
            frequencyCounter2.merge(it, 1, Int::plus)
        }

        return frequencyCounter1 == frequencyCounter2
    }
}

private object SquareEqualasSolution2 {
    // Naive solution
    // Complexity: O(n^2)
    private fun squareEquals(list1: List<Int>, list2: List<Int>): Boolean {
        val mutableList2 = list2.toMutableList()

        if (list1.size != list2.size) {
            return false
        }

        list1.forEach {
            //under the hood 'indexOf' iterates through entire array (it's like nested loop)
            val index = mutableList2.indexOf(it * it)

            if (index == -1) {
                return false
            }

            mutableList2.removeAt(index)
        }

        return true
    }
}
