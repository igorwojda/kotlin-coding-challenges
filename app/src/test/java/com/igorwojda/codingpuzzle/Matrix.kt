package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldEqual
import org.junit.Test

// --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral matrix.
// --- Examples
//   matrix(2)
//     [[1, 2],
//     [4, 3]]
//   matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]

private fun matrix(n: Int): List<MutableList<Int?>> {
    return listOf()
}

class MatrixTest {
    @Test
    fun `matrix produces a 2x2 array`() {
        val matrix = matrix(2)
        matrix.size shouldEqual 2
        matrix[0] shouldEqual listOf(1, 2)
        matrix[1] shouldEqual listOf(4, 3)
    }

    @Test
    fun `matrix produces a 3x3 array`() {
        val matrix = matrix(3)
        matrix.size shouldEqual 3
        matrix[0] shouldEqual listOf(1, 2, 3)
        matrix[1] shouldEqual listOf(8, 9, 4)
        matrix[2] shouldEqual listOf(7, 6, 5)
    }

    @Test
    fun `matrix produces a 4x4 array`() {
        val matrix = matrix(4)
        matrix.size shouldEqual 4
        matrix[0] shouldEqual listOf(1, 2, 3, 4)
        matrix[1] shouldEqual listOf(12, 13, 14, 5)
        matrix[2] shouldEqual listOf(11, 16, 15, 6)
        matrix[3] shouldEqual listOf(10, 9, 8, 7)
    }
}
