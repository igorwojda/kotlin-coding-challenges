package com.igorwojda.various.anycallback

private object Solution1 {
    private fun anyCallback(list: List<Int>, callback: (Int) -> Boolean): Boolean {
        if (list.size == 1) {
            return callback(list.first())
        }

        return callback(list.first()) || anyCallback(list.drop(1), callback)
    }
}

private object KtLintWillNotComplain
