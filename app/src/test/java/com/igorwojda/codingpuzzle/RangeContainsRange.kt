package com.igorwojda.codingpuzzle

import org.amshove.kluent.shouldBe
import org.junit.Test

//Write function to check if range1 contains range2

class RangeContainsRangeTest {
    @Test
    fun `5-7 range contains 5-7` () {
        containsRange(5..7, 5..7) shouldBe true
    }

    @Test
    fun `1-12 range contains 5-7` () {
        containsRange(1..12, 5..7) shouldBe true
    }

    @Test
    fun `12-17 range contains 12-14` () {
        containsRange(12..17, 12..14) shouldBe true
    }

    @Test
    fun `12-17 range contains 15-17` () {
        containsRange(12..17, 15..17) shouldBe true
    }

    @Test
    fun `5-7 range contains 1-12` () {
        containsRange(5..7, 1..12) shouldBe false
    }

    @Test
    fun `5-8 range contains 5-9` () {
        containsRange(5..8, 5..9) shouldBe false
    }

    @Test
    fun `5-8 range contains 3-5` () {
        containsRange(5..8, 3..5) shouldBe false
    }
}

private fun containsRange(range1: IntRange, range2: IntRange): Boolean {
    return false
}


