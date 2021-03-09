package com.igorwojda.matrix.findrectangle

// Time complexity: O(n*m)
private object Solution1 {
    private fun findRectangle(image: List<List<Int>>): List<Int>? {

        // This helper function may be used with challange variation where multiple rectangles exists in the image
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

        image.forEachIndexed { rowIndex, rowItem ->
            rowItem.forEachIndexed { columnIndex, pixelValue ->
                if (pixelValue == 0) {
                    return getRectangleFromTopLeftCorner(rowIndex, columnIndex)
                }
            }
        }

        return null
    }
}

// Time complexity: O(n*m)
private object Solution2 {
    private fun findRectangle(image: List<List<Int>>): List<Int>? {
        var top: Pair<Int, Int>? = null
        var bottom: Pair<Int, Int>? = null

        image.forEachIndexed { rowIndex, rowItem ->
            rowItem.forEachIndexed { columnIndex, pixelValue ->
                if (pixelValue == 0) {
                    if (top == null) {
                        top = rowIndex to columnIndex
                    } else {
                        bottom = rowIndex to columnIndex
                    }
                }
            }
        }

        // handle edge case where rectangle has 1 pixel
        if (bottom == null) {
            bottom = top
        }

        return if (top == null || bottom == null) {
            null
        } else {
            // Smart cast does not work with inlined lambdas so we have to use non-null assertion operator
            // More: https://youtrack.jetbrains.com/issue/KT-7186
            listOf(top!!.first, top!!.second, bottom!!.first, bottom!!.second)
        }
    }
}
