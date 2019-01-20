import com.igorwojda.linkedlist.base.LinkedListSolutionExtended

private object MidpointSolution {
    private fun midpoint(list: LinkedListSolutionExtended.LinkedList<Char>): LinkedListSolutionExtended.Node<Char>? {
        var slowPointer = list.first
        var fastpointer = list.first

        list.forEach {
            if (fastpointer?.next?.next == null) {
                return slowPointer
            }
            slowPointer = slowPointer?.next
            fastpointer = fastpointer?.next?.next
        }

        return null
    }
}
