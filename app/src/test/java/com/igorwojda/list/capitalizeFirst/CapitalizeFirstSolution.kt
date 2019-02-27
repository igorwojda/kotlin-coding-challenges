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

private object Solution2 {
    private fun capitalizeFirst(list: List<String>): List<String> =
        if (list.isEmpty()) emptyList()
        else listOf(list.first().capitalize()) + capitalizeFirst(list.drop(1))
}

private object Solution3 {
    private fun capitalizeFirst(list: List<String>): List<String> =
        list.map { it.capitalize() }
}

private object KtLintWillNotComplain
