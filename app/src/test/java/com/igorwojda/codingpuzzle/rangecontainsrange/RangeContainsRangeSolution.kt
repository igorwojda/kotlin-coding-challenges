package com.igorwojda.codingpuzzle.rangecontainsrange

private object RangeContainsRangeSolution {
    private fun rangeContainsRange(range1: IntRange, range2: IntRange) =
        range2.first >= range1.first && range2.last <= range1.last
}
