package com.igorwojda.list.capitalizeFirst

// Kotlin idiomatic solution
private object Solution1 {
    private fun capitalizeFirst(list: List<String>): List<String> {
        return list.map { it.replaceFirstChar { string -> string.uppercaseChar() } }
    }
}

// Recursive solution
private object Solution2 {
    private fun capitalizeFirst(list: List<String>): List<String> {
        return if (list.isEmpty()) emptyList()
        else listOf(list.first().replaceFirstChar { string -> string.uppercaseChar() }) + capitalizeFirst(list.drop(1))
    }
}

// Recursive solution
private object Solution3 {
    private fun capitalizeFirst(list: List<String>): List<String> {
        if (list.size == 1) {
            return list.map { it.replaceFirstChar { string -> string.uppercaseChar() } }
        }

        return list.take(1)
            .map { it.replaceFirstChar { string -> string.uppercaseChar() } } + capitalizeFirst(list.drop(1))
    }
}
