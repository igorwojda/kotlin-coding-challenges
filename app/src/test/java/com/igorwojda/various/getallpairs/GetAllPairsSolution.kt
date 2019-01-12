package com.igorwojda.various.getallpairs

private object GetAllPairsSolution {
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
