package com.igorwojda.matrix.findallrectangles

// Time complexity: O(n*m)
private object Solution1 {
    private fun findAllRectangles(image: List<List<Int>>): MutableList<List<Int>> {

        fun getRectangleFromTopLeftCorner(rowIndex: Int, columnIndex: Int): List<Int> {
            // find right x coordinate
            var rightColumnIndex = columnIndex

            while (image.getOrNull(rowIndex)?.getOrNull(rightColumnIndex + 1) == 0) {
                rightColumnIndex++
            }

            // find bottom y coordinate
            var bottomRowIndex = rowIndex

            while (image.getOrNull(bottomRowIndex + 1)?.getOrNull(columnIndex) == 0) {
                bottomRowIndex++
            }

            return listOf(rowIndex, columnIndex, bottomRowIndex, rightColumnIndex)
        }

        val result: MutableList<List<Int>> = mutableListOf()

        image.forEachIndexed { rowIndex, rowItem ->
            rowItem.forEachIndexed { columnIndex, columnValue ->

                // is pixel
                if (columnValue == 0) {
                    val pixelOnTheLeftHasBackground = rowItem.getOrNull(columnIndex - 1) != 0
                    val pixelAtTheTopHasBackground = image.getOrNull(rowIndex - 1)?.getOrNull(columnIndex) != 0
                    val isTopRectanglePixel = pixelOnTheLeftHasBackground && pixelAtTheTopHasBackground

                    // is this top left pixel a rectangle
                    // pixel on right has value 1 and pixel on the top has value 1 exists
                    if (isTopRectanglePixel) {
                        val rectangle = getRectangleFromTopLeftCorner(rowIndex, columnIndex)
                        result.add(rectangle)
                    }
                }
            }
        }

        return result
    }
}

private object KtLintWillNotComplain
