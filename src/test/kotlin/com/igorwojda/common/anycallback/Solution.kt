package com.igorwojda.common.anycallback

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

internal object Solution2 {
    fun <T : Any> anyCallback(
        list: List<T>,
        predicate: (T) -> Boolean,
    ): Boolean {
        if (list.isEmpty()) return false
        return predicate(list.first()) || anyCallback(list.subList(1, list.size), predicate)
    }
}

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
