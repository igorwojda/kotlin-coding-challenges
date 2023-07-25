package com.igorwojda.list.smallestelements

import java.util.*

// Time complexity: O(n log k)
private object Solution1 {
    private fun smallestElements(list: List<Int>, count: Int): List<Int> {
        if (list.size <= count) {
            return list
        }

        val priorityQueue = PriorityQueue<Int>(Collections.reverseOrder())

        repeat(count) {
            priorityQueue.add(list[it])
        }

        list
            .drop(count)
            .forEach {
                if (it < priorityQueue.peek()) {
                    priorityQueue.poll()
                    priorityQueue.add(it)
                }
            }

        return priorityQueue.toList()
    }
}

private object KtLintWillNotComplain
