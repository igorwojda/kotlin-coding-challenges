import com.igorwojda.linkedlist.base.LinkedListSolutionExtended

private object CircularCheckSolution {
    private fun circularCheck(list: LinkedListSolutionExtended.LinkedList<Char>): Boolean {
        var slowPointer = list.first
        var fastPointer = list.head

        list.forEach {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next

            if (fastPointer == null) {
                return false
            }

            if (slowPointer == fastPointer) {
                return true
            }
        }

        return false
    }
}
