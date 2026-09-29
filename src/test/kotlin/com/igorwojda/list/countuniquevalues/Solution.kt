package com.igorwojda.list.countuniquevalues

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun countUniqueValues(list: List<Int>): Int {
        val map = mutableMapOf<Int, Int>()

        list.forEach {
            var value = map.getOrDefault(it, 0)
            value++
            map[it] = value
        }

        return map.count()
    }
}

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution2 {
    private fun countUniqueValues(list: List<Int>): Int = list.toSet().size
}

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution3 {
    private fun countUniqueValues(list: List<Int>): Int = list.distinct().size
}

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution4 {
    private fun countUniqueValues(list: List<Int>): Int = list.groupBy { it }.size
}
