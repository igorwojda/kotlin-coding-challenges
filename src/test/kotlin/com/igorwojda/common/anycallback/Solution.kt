package com.igorwojda.common.anycallback

internal object Solution1 {
    fun anyCallback(list: List<Int>, callback: (Int) -> Boolean): Boolean {
        if (list.size == 1) {
            return callback(list.first())
        }

        return callback(list.first()) || anyCallback(list.drop(1), callback)
    }
}

internal object Solution2 {
    fun anyCallback(list: List<Int>, callback: (Int) -> Boolean): Boolean {
        if (list.isEmpty()) return false
        return callback(list.first()) || anyCallback(list.subList(1, list.size), callback)
    }
}

internal object Solution3 {
    fun anyCallback(list: List<Int>, callback: (Int) -> Boolean): Boolean {
        fun _randomAccessOptimized(list: List<Int>, callback: (Int) -> Boolean): Boolean {
            if (list.isEmpty()) return false
            return callback(list.first()) || _randomAccessOptimized(list.subList(1, list.size), callback)
        }

        fun _sequentialOptimized(list: List<Int>, callback: (Int) -> Boolean): Boolean {
            if (list.isEmpty()) return false
            return callback(list.first()) || _sequentialOptimized(list.drop(1), callback)
        }


        return if (list is RandomAccess) {
           _randomAccessOptimized(list, callback)
        }
        else {
            _sequentialOptimized(list, callback)
        }
    }
}

private object KtLintWillNotComplain
