package com.igorwojda.codingpuzzle.fibonacci.recursivecache

private fun fibonacciSequenceRecursiveCacheSolution1(
    n: Int,
    methodCache: MutableList<MethodCache> = mutableListOf()
): Int {
    var result = methodCache.firstOrNull { it.n == n }?.result

    if (result == null) {
        if (n < 2) {
            methodCache.add(MethodCache(n, n))
            return n
        }

        result = fibonacciSequenceRecursiveCacheSolution1(n - 1, methodCache) +
            fibonacciSequenceRecursiveCacheSolution1(n - 2, methodCache)
        methodCache.add(MethodCache(n, result))
    }

    return result
}
