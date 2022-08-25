package com.igorwojda.matrix.spiralmatrixgenerator

private object Solution1 {
    private fun generateSpiralMatrix(n: Int): List<MutableList<Int?>> {
        val list = MutableList(n) {
            MutableList<Int?>(n) { null }
        }

        var direction = MatrixDirection.RIGHT
        var rowIndex = 0
        var columnIndex = 0
        val maxNumber = n * n
        val lastIndex = n - 1

        (1..maxNumber).forEach {
            list[rowIndex][columnIndex] = it

            when (direction) {
                MatrixDirection.RIGHT -> {
                    val rightValue = if (columnIndex == lastIndex) null else list[rowIndex][columnIndex + 1]

                    if (rightValue == null && columnIndex < lastIndex) {
                        columnIndex++
                    } else {
                        direction = MatrixDirection.DOWN
                        rowIndex++
                    }
                }
                MatrixDirection.DOWN -> {
                    val downValue = if (rowIndex == lastIndex) null else list[rowIndex + 1][columnIndex]

                    if (downValue == null && rowIndex < lastIndex) {
                        rowIndex++
                    } else {
                        columnIndex--
                        direction = MatrixDirection.LEFT
                    }
                }
                MatrixDirection.LEFT -> {
                    val leftValue = if (columnIndex == 0) null else list[rowIndex][columnIndex - 1]

                    if (leftValue == null && columnIndex > 0) {
                        columnIndex--
                    } else {
                        rowIndex--
                        direction = MatrixDirection.UP
                    }
                }
                MatrixDirection.UP -> {
                    val upValue = if (rowIndex == 0) null else list[rowIndex - 1][columnIndex]

                    if (upValue == null && rowIndex > 0) { // rowIndex == 0
                        rowIndex--
                    } else {
                        columnIndex++
                        direction = MatrixDirection.RIGHT
                    }
                }
            }
        }

        return list
    }

    private enum class MatrixDirection { UP, DOWN, LEFT, RIGHT }
}

private object KtLintWillNotComplain
