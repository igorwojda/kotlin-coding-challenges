package com.igorwojda.matrix.findrectangle

// Time complexity: O(n*m)
private object Solution1 {
    private fun findRectangle(image: List<List<Int>>): List<Int?> {
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

        return listOf(top?.first, top?.second, bottom?.first, bottom?.second)
    }
}

private object KtLintWillNotComplain