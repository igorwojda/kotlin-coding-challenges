package com.igorwojda.list.sumzero

private object SumZeroSolution1 {
    // Optimal solution
    // Time complexity: O(n)
    fun sumZero(list: List<Int>): Pair<Int, Int>? {
        if (list.isEmpty()) {
            return null
        }

        var leftIndex = 0
        var rightIndex = list.lastIndex

        // declare loop
        while (leftIndex != rightIndex) {
            val leftElement = list[leftIndex]
            val rightElement = list[rightIndex]
            val sum = leftElement + rightElement

            when {
                sum == 0 -> return Pair(leftElement, rightElement)
                sum > 0 -> rightIndex--
                sum < 0 -> leftIndex++
            }
        }

        return null
    }
}

private object SumZeroSolution2 {
    // Naive solution
    // Time complexity: O(n^2)
    fun sumZero(list: List<Int>): Pair<Int, Int>? {
        list.forEachIndexed { index, element1 ->
            (index..list.lastIndex).forEach { index2 ->
                if (element1 + list[index2] == 0) {
                    return element1 to list[index2]
                }
            }
        }

        return null
    }
}
