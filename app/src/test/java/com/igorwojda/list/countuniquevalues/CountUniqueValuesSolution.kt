package com.igorwojda.list.countuniquevalues

private object Solution1 {
    private fun countUniqueValues(list: List<Int>): Int {
        return list.toSet().size
    }
}

private object Solution2 {
    private fun countUniqueValues(list: List<Int>): Int {
        if (list.isEmpty()) return 0
        if (list.size == 1) return 1

        var count = 1
        var prevElement = list[0]

        (0..list.lastIndex).forEach {
            if (prevElement != list[it]) {
                count++
            }

            prevElement = list[it]
        }

        return count
    }
}
