package com.igorwojda.list.maxsublistsum

private object MaxSubListSumSolution1 {
    // Optimal solution
    // Complexity: O(n)
    private fun maxSubListSum(list: List<Int>, n: Int): Int? {
        if (list.size < n) {
            return null
        }

        var maxSum = list.subList(0, n).sum()
        var tempSum = maxSum

        (n..list.lastIndex).forEach { index ->
            tempSum = tempSum - list[index - n] + list[index]
            maxSum = Math.max(maxSum, tempSum)
        }

        return maxSum
    }
}

private object MaxSubListSumSolution2 {
    // Naive solution
    // Complexity: O(n^2)
    private fun maxSubListSum(list: List<Int>, n: Int): Int? {
        if (list.size < n) {
            return null
        }

        var maxSum: Int? = null

        (0..list.size - n).forEach { i ->
            var tempSum: Int? = null
            (i until (i + n)).forEach { j ->
                if (tempSum == null) {
                    tempSum = list[j]
                } else {
                    tempSum?.plus(list[j])
                }
            }

            tempSum?.let { localTemp ->
                if (maxSum == null) {
                    maxSum = localTemp
                } else {
                    maxSum?.plus(localTemp)
                }
            }
        }

        return maxSum
    }
}
