package com.igorwojda.tree.heap.maxbinaryheap

private object Solution1 {
    private class MaxBinaryHeap<E : Comparable<E>> {
        val items = mutableListOf<E>()

        fun add(element: E) {
            items.add(element)
            bubbleUpLastLeaf()
        }

        fun removeMax(): E? {

            if (items.isEmpty()) return null

            if (items.size == 1) {
                return items.removeAt(0)
            }

            items.swap(0, items.lastIndex)

            val max = items.removeAt(items.lastIndex)

            if (items.size > 1) {
                bubbleDownRootElement()
            }

            return max
        }

        private fun bubbleDownRootElement() {
            var elementIndex = 0
            var leftChildIndex = getLeftChildIndex(elementIndex)
            var rightChildIndex = getRightChildIndex(elementIndex)

            // Only two elements
            if (items.getOrNull(rightChildIndex) == null) {
                if (items[elementIndex] < items[leftChildIndex]) {
                    items.swap(elementIndex, leftChildIndex)
                }
                return
            }

            while ((items[elementIndex] < items[leftChildIndex]) ||
                items[elementIndex] < items[rightChildIndex]
            ) {

                elementIndex = if (rightChildIndex > items.lastIndex ||
                    items[leftChildIndex] > items[rightChildIndex]
                ) {
                    items.swap(leftChildIndex, elementIndex)
                    leftChildIndex
                } else {
                    items.swap(rightChildIndex, elementIndex)
                    rightChildIndex
                }

                leftChildIndex = getLeftChildIndex(elementIndex)
                rightChildIndex = getRightChildIndex(elementIndex)
            }
        }

        private fun bubbleUpLastLeaf() {
            var elementIndex = items.lastIndex
            var parentIndex = getParentIndex(elementIndex)

            while (items[elementIndex] > items[parentIndex]) {
                items.swap(elementIndex, parentIndex)

                elementIndex = parentIndex
                parentIndex = getParentIndex(elementIndex)
            }
        }

        private fun getParentIndex(index: Int) = (index - 1) / 2

        private fun getLeftChildIndex(index: Int) = (index * 2) + 1

        private fun getRightChildIndex(index: Int) = (index * 2) + 2

        fun isEmpty() = items.isEmpty()

        private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
            val tmp = this[index1]
            this[index1] = this[index2]
            this[index2] = tmp
        }
    }
}

private object KtLintWillNotComplain
