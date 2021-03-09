package com.igorwojda.list.search.linearsearch

// Time complexity: O(n)
private object Solution1 {
    private fun getIndex(list: List<String>, str: String): Int {
        list.forEachIndexed { index, element ->
            if (element == str) {
                return index
            }
        }
        return -1
    }
}

private object KtLintWillNotComplain
