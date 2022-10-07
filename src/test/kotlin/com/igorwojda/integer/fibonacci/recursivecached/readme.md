# Recursive cache fibonacci

## Instructions

Below function returns out the n-th entry in the [fibonacci](https://en.wikipedia.org/wiki/Fibonacci_number) series.
```kotlin
private fun fibonacciSequenceRecursiveCached(n: Int): Int {
    if (n < 2) {
        return n
    }

    return fibonacciSequenceRecursiveCached(n - 1) + fibonacciSequenceRecursiveCached(n - 2)
}
```

However due to recursion this function has exponential complexity (function is called recursively multiple times with
identical arguments), so its execution takes a long time. Store arguments of each call along with the result using
`MethodCache` class.

```kotlin
private data class MethodCache(val n: Int, val result: Int)
```

If the function is called again with the same arguments, return the precomputed result rather than running the function
again.

[challenge](challenge.kt) | [solution](solution.kt)


