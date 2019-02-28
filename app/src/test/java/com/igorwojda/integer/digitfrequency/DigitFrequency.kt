package com.igorwojda.integer.digitfrequency

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun equalDigitFrequency(i1: Int, i2: Int): Boolean {
    TODO("not implemented")
}

class DigitFrequencyTest {
    @Test
    fun `"789" and "897" have the same digit frequency`() {
        equalDigitFrequency(789, 897) shouldEqual true
    }

    @Test
    fun `"123445" and "451243" have the same digit frequency`() {
        equalDigitFrequency(123445, 451243) shouldEqual true
    }

    @Test
    fun `"447" and "477" have different digit frequency"`() {
        equalDigitFrequency(447, 477) shouldEqual false
    }

    @Test
    fun `"578" and "0" have different digit frequency"`() {
        equalDigitFrequency(578, 0) shouldEqual false
    }

    @Test
    fun `"0" and "0" have the same digit frequency"`() {
        equalDigitFrequency(0, 0) shouldEqual true
    }
}
