package com.igorwojda.codingpuzzle

private fun containsRange(range1: IntRange, range2: IntRange): Boolean {
    return range2.first >= range1.first && range2.last <= range1.last
}
