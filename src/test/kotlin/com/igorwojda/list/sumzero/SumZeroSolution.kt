package com.igorwojda.list.sumzero

private object Solution1 {
    // Optimal solution using double pointer.
    // Time complexity: O(n)
    fun sumZero(list: List<Int>): Pair<Int, Int>? {
        if (list.isEmpty()) {
            return null
        }

        var pointer1 = 0
        var pointer2 = list.lastIndex

        // declare loop
        while (pointer1 != pointer2) {
            val element1 = list[pointer1]
            val element2 = list[pointer2]
            val sum = element1 + element2

            when {
                sum == 0 -> return Pair(element1, element2)
                sum > 0 -> pointer2--
                sum < 0 -> pointer1++
            }
        }

        return null
    }
}

// Naive solution using nested loop
// Time complexity: O(n^2)
private object Solution2 {
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
