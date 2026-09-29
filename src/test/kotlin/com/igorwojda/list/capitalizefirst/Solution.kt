package com.igorwojda.list.capitalizefirst

// Kotlin idiomatic solution
// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun capitalizeFirst(list: List<String>): List<String> = list.map { it.replaceFirstChar { string -> string.uppercaseChar() } }
}

// Recursive solution
// Time complexity: O(n^2) - drop(1) and + copy the list on each of n recursion levels
// Space complexity: O(n^2) - drop(1) copy kept alive on each of n recursion levels
private object Solution2 {
    private fun capitalizeFirst(list: List<String>): List<String> = if (list.isEmpty()) {
        emptyList()
    } else {
        listOf(list.first().replaceFirstChar { string -> string.uppercaseChar() }) + capitalizeFirst(list.drop(1))
    }
}

// Recursive solution
// Time complexity: O(n^2) - drop(1) and + copy the list on each of n recursion levels
// Space complexity: O(n^2) - drop(1) copy kept alive on each of n recursion levels
private object Solution3 {
    private fun capitalizeFirst(list: List<String>): List<String> {
        if (list.size == 1) {
            return list.map { it.replaceFirstChar { string -> string.uppercaseChar() } }
        }

        return list
            .take(1)
            .map { it.replaceFirstChar { string -> string.uppercaseChar() } } + capitalizeFirst(list.drop(1))
    }
}
