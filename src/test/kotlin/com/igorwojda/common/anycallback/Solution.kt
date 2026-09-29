package com.igorwojda.common.anycallback

// Time complexity: O(n^2) - drop(1) copies the list at each level
// Space complexity: O(n^2) - each stack frame holds its own dropped copy
internal object Solution1 {
    fun <T : Any> anyCallback(
        list: List<T>,
        predicate: (T) -> Boolean,
    ): Boolean {
        if (list.isEmpty()) {
            return false
        }

        if (list.size == 1) {
            return predicate(list.first())
        }

        return predicate(list.first()) || anyCallback(list.drop(1), predicate)
    }
}

// Time complexity: O(n) - subList is an O(1) view
// Space complexity: O(n) - recursion call stack
internal object Solution2 {
    fun <T : Any> anyCallback(
        list: List<T>,
        predicate: (T) -> Boolean,
    ): Boolean {
        if (list.isEmpty()) return false
        return predicate(list.first()) || anyCallback(list.subList(1, list.size), predicate)
    }
}

// Time complexity: O(n) - O(n^2) for non-RandomAccess lists (drop copies)
// Space complexity: O(n) - recursion call stack; O(n^2) for non-RandomAccess lists
internal object Solution3 {
    fun <T : Any> anyCallback(
        list: List<T>,
        predicate: (T) -> Boolean,
    ): Boolean {
        fun randomAccessOptimized(
            list: List<T>,
            predicate: (T) -> Boolean,
        ): Boolean {
            if (list.isEmpty()) return false
            return predicate(list.first()) || randomAccessOptimized(list.subList(1, list.size), predicate)
        }

        fun sequentialOptimized(
            list: List<T>,
            predicate: (T) -> Boolean,
        ): Boolean {
            if (list.isEmpty()) return false
            return predicate(list.first()) || sequentialOptimized(list.drop(1), predicate)
        }

        return if (list is RandomAccess) {
            randomAccessOptimized(list, predicate)
        } else {
            sequentialOptimized(list, predicate)
        }
    }
}

private object KtLintWillNotComplain
