package com.igorwojda.list.product

// Kotlin idiomatic solution
private object Solution1 {
    private fun product(list: List<Int>): Int {
        return list.reduce { accumulated, current -> accumulated * current }
    }
}

// Recursive solution
private object Solution2 {
    private fun product(list: List<Int>): Int {
        if (list.size == 1) {
            return list.first()
        }

        return list.first() * product(list.drop(1))
    }
}
