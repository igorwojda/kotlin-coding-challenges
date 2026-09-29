package com.igorwojda.list.listchunk

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun chunk(
        list: List<Int>,
        size: Int,
    ): List<List<Int>> {
        val chunks = mutableListOf<MutableList<Int>>()

        list.forEach {
            if (chunks.size == 0 || chunks.last().size == size) {
                chunks.add(mutableListOf(it))
            } else {
                chunks.last().add(it)
            }
        }

        return chunks
    }
}

// Time complexity: O(n / m) - n is list size, m is chunk size; subList is O(1) view
// Space complexity: O(n / m) - one subList view per chunk
private object Solution2 {
    private fun chunk(
        list: List<Int>,
        size: Int,
    ): List<List<Int>> {
        val chunks = mutableListOf<List<Int>>()

        for (i in 0..list.lastIndex step size) {
            val rightIndex = if (i + size < list.size) i + size else list.size
            chunks.add(list.subList(i, rightIndex))
        }

        return chunks
    }
}

// Time complexity: O(n / m) - n is list size, m is chunk size; subList is O(1) view
// Space complexity: O(n / m) - one subList view per chunk
private object Solution3 {
    private fun chunk(
        list: List<Int>,
        size: Int,
    ): List<List<Int>> {
        var index = 0
        val chunks = mutableListOf<List<Int>>()

        while (index <= list.lastIndex) {
            val rightIndex = if (index + size < list.size) index + size else list.size
            chunks.add(list.subList(index, rightIndex))

            index += size
        }

        return chunks
    }
}
