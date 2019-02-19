package com.igorwojda.list.countuniquevalues

private object Solution1 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.toSet().size
    }
}

private object Solution2 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.distinct().size
    }
}

private object Solution3 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.groupBy { it }.size
    }
}
