package com.igorwojda.string.Prime

import android.util.Log.println

// PrimesLessThanX.kt

private object Solution1 {
    fun primesLessThanX(x: Int): List<Int> {
        val primes = mutableListOf<Int>()
        for (i in 2 until x) {
            var isPrime = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) primes.add(i)
        }
        return primes
    }
}

private object Solution2 {
    fun primesLessThanX(x: Int): List<Int> {
        val sieve = BooleanArray(x) { true }
        sieve[0] = false
        sieve[1] = false
        for (i in 2 until kotlin.math.sqrt(x.toDouble()).toInt() + 1) {
            if (sieve[i]) {
                for (j in (i * i) until x step i) {
                    sieve[j] = false
                }
            }
        }
        return sieve.indices.filter { sieve[it] }
    }
}

private object Solution3 {
    fun primesLessThanX(x: Int): List<Int> {
        return (2 until x).filter { i -> (2 until i).none { i % it == 0 } }
    }
}

fun main() {
    val x = 100

    println(Solution1.primesLessThanX(x))
    println(Solution2.primesLessThanX(x))
    println(Solution3.primesLessThanX(x))
}
