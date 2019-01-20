package com.igorwojda.integer.generateallpairs

private object GenerateAllPairsSolution {
    private fun getAllPairs(n: Int): MutableList<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()

        (0..n).forEach { i ->
            (0..n).forEach { j ->
                result.add(i to j)
            }
        }

        return result
    }
}
