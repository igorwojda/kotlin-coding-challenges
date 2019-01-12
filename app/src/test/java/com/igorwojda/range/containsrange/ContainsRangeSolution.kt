package com.igorwojda.range.containsrange

private object ContainsRangeSolution {
    private fun containsRange(range1: IntRange, range2: IntRange) =
        range2.first >= range1.first && range2.last <= range1.last
}
