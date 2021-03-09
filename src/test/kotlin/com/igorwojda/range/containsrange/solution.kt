package com.igorwojda.range.containsrange

private object Solution1 {
    private fun containsRange(range1: IntRange, range2: IntRange) =
        range2.first >= range1.first && range2.last <= range1.last
}

private object KtLintWillNotComplain
