package com.igorwojda.list.medianoftwosorted

// Time complexity: O(log (m+n))
private object Solution1 {
    fun medianOfSortedLists(list1: List<Int>, list2: List<Int>): Double {
        val totalSize = list1.size + list2.size

        val lastIndex = (totalSize / 2)
        var prevValue: Int? = null

        var pointer1Index = 0
        var pointer2Index = 0

        (0..lastIndex).forEach {
            val value1 = list1.getOrNull(pointer1Index)
            val value2 = list2.getOrNull(pointer2Index)

            val minValue = when {
                value1 != null && value2 == null -> {
                    pointer1Index++
                    value1
                }
                value2 != null && value1 == null -> {
                    pointer2Index++
                    value2
                }
                value1!! < value2!! -> {
                    pointer1Index++
                    value1
                }
                else -> {
                    pointer2Index++
                    value2
                }
            }

            if (it == lastIndex) {
                val totalSizeIsOdd = totalSize % 2 != 0

                return if (totalSizeIsOdd) {
                    return minValue.toDouble()
                } else {
                    val localPrevValue = prevValue

                    if (localPrevValue == null) {
                        minValue.toDouble()
                    } else {
                        (localPrevValue + minValue) / 2.0
                    }
                }
            }

            prevValue = minValue
            println("-----------")
        }

        return 0.0
    }
}

// Time complexity: O(n)
// Space complexity O(n)
private object Solution2 {
    fun medianOfSortedLists(list1: List<Int>, list2: List<Int>): Double {
        val mergedList = list1
            .plus(list2)
            .sorted()

        val median = if (mergedList.size % 2 != 0) {
            mergedList[mergedList.size / 2].toDouble()
        } else {
            (mergedList[mergedList.size / 2].toDouble() + mergedList[mergedList.size / 2 - 1].toDouble()) / 2
        }

        return median
    }
}
