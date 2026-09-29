package com.igorwojda.string.validparentheses

// Time complexity: O(n)
// Space complexity: O(n) - stack
private object Solution1 {
    private fun isValidParentheses(str: String): Boolean {
        val pairs = mapOf(')' to '(', ']' to '[', '}' to '{')
        val stack = ArrayDeque<Char>()

        str.forEach {
            if (it in pairs) {
                if (stack.removeLastOrNull() != pairs[it]) return false
            } else {
                stack.addLast(it)
            }
        }

        return stack.isEmpty()
    }
}

private object KtLintWillNotComplain
