package com.igorwojda.list.maxsublistsum

import kotlin.math.max

// Time Complexity: O(n)
// Space Complexity: O(1)
// Use "sliding window" - store sum in single variable and with each iteration add (current item)
// and remove (first item before current sub-list)
private object Solution1 {
    private fun maxSubListSum(list: List<Int>, numElements: Int): Int? {
        if (list.size < numElements) {
            return null
        }

        var maxSum = list.take(numElements).sum()
        var tempSum = maxSum

        (numElements..list.lastIndex).forEach { index ->
            tempSum = tempSum - list[index - numElements] + list[index]
            maxSum = max(maxSum, tempSum)
        }

        return maxSum
    }
}

private object Solution2 {
    private fun maxSubListSum(list: List<Int>, numElements: Int): Int? {
        if (list.size < numElements) {
            return null
        }

        return list.foldIndexed(0 to 0) { i, (sum, max), next ->
            (sum + next - (list.getOrNull(i - numElements) ?: 0)).let {
                it to if (it > max) it else max
            }
        }.second
    }
}

// Time Complexity: O(n*m)
// Loop through the list and at each index loop again to calculate sum of sublist (from index to index + n)
private object Solution3 {
    private fun maxSubListSum(list: List<Int>, numElements: Int): Int? {
        if (list.size < numElements) {
            return null
        }

        var maxSum: Int? = null

        for (i in 0..list.size - numElements) {
            var tempSum: Int? = null

            for (j in i until (i + numElements)) {
                if (tempSum == null) {
                    tempSum = list[j]
                } else {
                    tempSum += list[j]
                }
            }

            maxSum = max(maxSum, tempSum)
        }

        return maxSum
    }

    private fun max(i1: Int?, i2: Int?): Int? {
        return when {
            i1 != null && i2 != null -> max(i1, i2)
            i1 != null && i2 == null -> i1
            i1 == null && i2 != null -> i2
            else -> null
        }
    }
}

private object Solution4 {
    private fun maxSubListSum(list: List<Int>, numElements: Int): Int? {
        if (list.isEmpty()) return null

        return (0..list.size - numElements)
            .map { i -> list.subList(i, i + numElements).sum() }
            .maxOrNull()
    }
}
