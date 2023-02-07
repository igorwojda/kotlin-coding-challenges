package com.igorwojda.integer.generateallpairs

private object Solution1 {
    private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()

        (0..n).forEach { i ->
            (0..n).forEach { j ->
                result.add(i to j)
            }
        }

        return result
    }
}

private object Solution2 {
    private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
        return (0..n).map { i ->
            (0..n).map { j ->
                i to j
            }
        }.flatten()
    }
}

private object KtLintWillNotComplain
