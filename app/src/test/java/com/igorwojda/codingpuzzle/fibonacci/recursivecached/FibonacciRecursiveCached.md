# Instructions
Below function returns out the n-th entry in the [fibonacci](https://en.wikipedia.org/wiki/Fibonacci_number)  series. However due to
recursion it has exponential complexity (function is called recursively multiple times with identical arguments) and its execution takes
a long time. Store arguments of each call along with the result using `MethodCache` class. If the function is called again with the same
arguments, return the precomputed result rather than running the function again.

# Examples
```
private fun fibonacciSequenceRecursiveCached(n: Int): Int {
    if (n < 2) {
        return n
    }

    return fibonacciSequenceRecursiveCached(n - 1) + fibonacciSequenceRecursiveCached(n - 2)
}
```

# Files
[Package](.)
