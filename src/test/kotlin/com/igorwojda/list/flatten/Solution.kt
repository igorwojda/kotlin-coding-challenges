package com.igorwojda.list.flatten

// Time complexity: O(n * d) - n is total element count, d is max nesting depth; each level copies its result
// Space complexity: O(n + d) - result lists plus recursion stack
private object Solution1 {
    fun flatten(list: List<*>): List<*> {
        val result = mutableListOf<Any?>()

        list.forEach {
            if (it is List<*>) {
                result.addAll(flatten(it))
            } else {
                result.add(it)
            }
        }

        return result.filterNotNull()
    }
}

private object KtLintWillNotComplain
