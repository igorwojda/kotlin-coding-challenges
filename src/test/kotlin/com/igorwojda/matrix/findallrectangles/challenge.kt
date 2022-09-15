package com.igorwojda.matrix.findallrectangles

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun findAllRectangles(image: List<List<Int>>): MutableList<List<Int>> {
    TODO("not implemented")
}

private class Test {
    @Test
    fun `find rectangles in image 1`() {
        val image = listOf(
            listOf(0, 1, 0, 0, 0, 1),
            listOf(1, 1, 0, 0, 0, 1),
            listOf(1, 1, 1, 1, 1, 1),
            listOf(0, 0, 1, 1, 1, 1)
        )

        val result = listOf(
            listOf(0, 0, 0, 0),
            listOf(0, 2, 1, 4),
            listOf(3, 0, 3, 1),
        )

        findAllRectangles(image) shouldBeEqualTo result
    }

    @Test
    fun `find rectangles in image 2`() {
        val image = listOf(
            listOf(0, 1, 1, 1, 1, 1, 1),
            listOf(1, 1, 1, 1, 1, 1, 1),
            listOf(0, 1, 1, 0, 0, 0, 1),
            listOf(1, 0, 1, 0, 0, 0, 1),
            listOf(1, 0, 1, 1, 1, 1, 1),
            listOf(1, 0, 1, 0, 0, 1, 1),
            listOf(1, 1, 1, 0, 0, 1, 1),
            listOf(1, 1, 1, 1, 1, 1, 0),
        )

        val result = listOf(
            listOf(0, 0, 0, 0),
            listOf(2, 0, 2, 0),
            listOf(2, 3, 3, 5),
            listOf(3, 1, 5, 1),
            listOf(5, 3, 6, 4),
            listOf(7, 6, 7, 6),
        )

        findAllRectangles(image) shouldBeEqualTo result
    }

    @Test
    fun `find rectangles in image 3`() {
        val image = listOf(
            listOf(1, 1, 1, 1, 1, 1, 1),
            listOf(1, 1, 1, 1, 1, 1, 1),
            listOf(1, 1, 1, 0, 0, 0, 1),
            listOf(1, 0, 1, 0, 0, 0, 1),
            listOf(1, 0, 1, 1, 1, 1, 1),
            listOf(1, 0, 1, 0, 0, 1, 1),
            listOf(1, 1, 1, 0, 0, 1, 1),
            listOf(1, 1, 1, 1, 1, 1, 1),
        )

        val result = listOf(
            listOf(2, 3, 3, 5),
            listOf(3, 1, 5, 1),
            listOf(5, 3, 6, 4),
        )

        findAllRectangles(image) shouldBeEqualTo result
    }

    @Test
    fun `find rectangles in image 4 that has no background`() {
        val image = listOf(
            listOf(0)
        )

        val result = listOf(
            listOf(0, 0, 0, 0)
        )

        findAllRectangles(image) shouldBeEqualTo result
    }
}
