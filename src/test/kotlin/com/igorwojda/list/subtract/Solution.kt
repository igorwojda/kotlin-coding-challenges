package com.igorwojda.list.subtract

// Time complexity: O(n + m) - n is list1 size, m is list2 size
// Space complexity: O(n + m) - count map and result list
private object Solution1 {
    fun getSubtraction(list1: List<String>, list2: List<String>): List<String> {
        val counts = list2.groupingBy { it }.eachCount().toMutableMap()
        return list1.filter { item ->
            val remaining = counts[item] ?: 0
            if (remaining > 0) {
                counts[item] = remaining - 1
                false
            } else {
                true
            }
        }
    }
}

private object KtLintWillNotComplain
