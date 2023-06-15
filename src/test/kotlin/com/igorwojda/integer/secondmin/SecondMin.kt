package com.igorwojda.string.SecondMin
import android.util.Log.println

// SecondMinimumNumber.kt

private object Solution1 {
    fun secondMinimumNumber(numbers: List<Int>): Int? {
        val distinctNumbers = numbers.distinct().sorted()
        return if (distinctNumbers.size >= 2) distinctNumbers[1] else null
    }
}

private object Solution2 {
    fun secondMinimumNumber(numbers: List<Int>): Int? {
        val minNumber = numbers.minOrNull()
        val secondMinNumber = numbers.filter { it != minNumber }.minOrNull()
        return secondMinNumber
    }
}

private object Solution3 {
    fun secondMinimumNumber(numbers: List<Int>): Int? {
        return numbers.sorted().let { if (it.size > 1) it[1] else null }
    }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    Solution1.secondMinimumNumber(numbers)?.let { println(it) }
    Solution2.secondMinimumNumber(numbers)?.let { println(it) }
    Solution3.secondMinimumNumber(numbers)?.let { println(it) }
}
