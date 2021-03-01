package com.igorwojda.list.subtract

private object Solution1 {
    private fun getSubtraction(list1: List<String>, list2: List<String>): List<String> {
        val frequencyMap1 = list1.groupingBy { it }.eachCount()
        val frequencyMap2 = list2.groupingBy { it }.eachCount()

        val itemList1 = frequencyMap1.flatMap { entry -> List(entry.value) { entry.key } }.toMutableList()
        val itemList2 = frequencyMap2.flatMap { entry -> List(entry.value) { entry.key } }

        itemList2.forEach { itemList1.remove(it) }

        return itemList1
    }
}

private object KtLintWillNotComplain
