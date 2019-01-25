package com.igorwojda.list.linearsearch

// Time complexity: O(n)
private object Solution {
    private fun getIndex(list: List<String>, str: String): Int {
        list.forEachIndexed { index, element ->
            if (element == str) {
                return index
            }
        }
        return -1
    }
}

object KtLintWillNotComplain