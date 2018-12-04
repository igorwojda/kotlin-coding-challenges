package com.igorwojda.codingpuzzle.fibonacci.recursivecache

private fun fibonacciSequenceRecursiveCache(
    n: Int,
    fibonacciCache: MutableList<FibonacciCache> = mutableListOf()
): Int {
    var result = fibonacciCache.firstOrNull { it.n == n }?.result

    if (result == null) {
        if (n < 2) {
            fibonacciCache.add(FibonacciCache(n, n))
            return n
        }

        var result2 = fibonacciSequenceRecursiveCache(
            n - 1,
            fibonacciCache
        ) + fibonacciSequenceRecursiveCache(
            n - 2,
            fibonacciCache
        )
        fibonacciCache.add(FibonacciCache(n, result2))
        return result2
    } else {
        return result
    }
}
