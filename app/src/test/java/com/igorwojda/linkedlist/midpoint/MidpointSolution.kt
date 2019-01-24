private object Solution {
    private fun midpoint(list: LinkedListSolutionExtended.LinkedList<Char>): LinkedListSolutionExtended.Node<Char>? {
        var slowPointer = list.first
        var fastPointer = list.first

        list.forEach {
            if (fastPointer?.next?.next == null) {
                return slowPointer
            }
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next
        }

        return null
    }
}
