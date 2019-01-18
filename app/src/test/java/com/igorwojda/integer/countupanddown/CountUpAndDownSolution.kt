package com.igorwojda.integer.countupanddown

private object CountUpAndDownSolution {
    private fun countUpAndDown(n: Int): List<Int> {
        val result = mutableListOf<Int>()

        (0..n).forEach { result.add(it) }
        ((n - 1) downTo 0).forEach { result.add(it) }

        return result
    }
}
