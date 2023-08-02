package com.igorwojda.list.reverse

// Time complexity: O(n)
private object Solution1 {
    private fun reverse(list: List<String>): List<String> {
        val newList = list.toMutableList()

        repeat(newList.size / 2) {
            val temp = newList[it]
            val other = newList[newList.size - it - 1]
            newList[it] = other
            newList[newList.size - it - 1] = temp
        }

        return newList
    }
}

private object KtLintWillNotComplain
