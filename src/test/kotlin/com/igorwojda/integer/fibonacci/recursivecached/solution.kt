package com.igorwojda.integer.fibonacci.recursivecached

private object Solution1 {
    private data class MethodCache(val n: Int, val result: Int)

    private fun fibonacciSequenceRecursiveCached(
        n: Int,
        methodCache: MutableList<MethodCache> = mutableListOf()
    ): Int {
        var result = methodCache.firstOrNull { it.n == n }?.result

        if (result == null) {
            if (n < 2) {
                methodCache.add(MethodCache(n, n))
                return n
            }

            result = fibonacciSequenceRecursiveCached(n - 1, methodCache) +
                fibonacciSequenceRecursiveCached(n - 2, methodCache)
            methodCache.add(MethodCache(n, result))
        }

        return result
    }
}

private object KtLintWillNotComplain
