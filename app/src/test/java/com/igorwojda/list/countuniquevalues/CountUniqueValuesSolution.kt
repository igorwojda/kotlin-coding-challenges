package com.igorwojda.list.countuniquevalues

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

private object Solution2 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.toSet().size
    }
}

private object Solution3 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.distinct().size
    }
}

private object Solution4 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.groupBy { it }.size
    }
}
