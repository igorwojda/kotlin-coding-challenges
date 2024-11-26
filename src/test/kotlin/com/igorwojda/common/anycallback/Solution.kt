package com.igorwojda.common.anycallback

internal object Solution1 {
    fun <T: Any> anyCallback(list: List<T>, predicate: (T) -> Boolean): Boolean {
        if (list.size == 1) {
            return predicate(list.first())
        }

        return predicate(list.first()) || anyCallback(list.drop(1), predicate)
    }
}

internal object Solution2 {
    fun <T: Any> anyCallback(list: List<T>, predicate: (T) -> Boolean): Boolean {
        if (list.isEmpty()) return false
        return predicate(list.first()) || anyCallback(list.subList(1, list.size), predicate)
    }
}

internal object Solution3 {
    fun <T: Any> anyCallback(list: List<T>, predicate: (T) -> Boolean): Boolean {
        fun _randomAccessOptimized(list: List<T>, predicate: (T) -> Boolean): Boolean {
            if (list.isEmpty()) return false
            return predicate(list.first()) || _randomAccessOptimized(list.subList(1, list.size), predicate)
        }

        fun _sequentialOptimized(list: List<T>, predicate: (T) -> Boolean): Boolean {
            if (list.isEmpty()) return false
            return predicate(list.first()) || _sequentialOptimized(list.drop(1), predicate)
        }


        return if (list is RandomAccess) {
           _randomAccessOptimized(list, predicate)
        }
        else {
            _sequentialOptimized(list, predicate)
        }
    }
}

private object KtLintWillNotComplain
