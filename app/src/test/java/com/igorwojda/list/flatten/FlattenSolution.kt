package com.igorwojda.list.flatten

private object Solution {
    fun flatten(list: List<*>): List<*> {
        val result = mutableListOf<Any?>()

        fun helper(any: Any?) {
            if (any is List<*>) {
                if (any.isEmpty()) {
                    result.add(null)
                } else {
                    helper(any.first())
                    helper(any.drop(1))
                }
            } else {
                result.add(any)
            }
        }

        helper(list)

        return result.filter { it != null }
    }
}

private object KtLintWillNotComplain
