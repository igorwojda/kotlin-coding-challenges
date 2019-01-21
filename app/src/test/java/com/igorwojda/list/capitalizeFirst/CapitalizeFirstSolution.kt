package com.igorwojda.list.capitalizeFirst

// Recursive solution
private object Solution1 {
    private fun capitalizeFirst(list: List<String>): List<String> {
        if (list.size == 1) {
            return list.map { it.capitalize() }
        }

        return list.take(1).map { it.capitalize() } + capitalizeFirst(list.drop(1))
    }
}

private object KtLintWillNotComplain
