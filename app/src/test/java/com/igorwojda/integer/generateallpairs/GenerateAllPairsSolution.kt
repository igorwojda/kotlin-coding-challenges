package com.igorwojda.integer.generateallpairs

private object Solution {
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

private object KtLintWillNotComplain
