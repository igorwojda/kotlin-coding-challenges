import com.igorwojda.datastructure.linkedlist.base.LinkedListSolutionExtended

private object MidpointSolution {
    private fun midpoint(linkedList: LinkedListSolutionExtended.LinkedList<Char>): LinkedListSolutionExtended.Node<Char>? {
        var slow = linkedList.first
        var fast = linkedList.first

        linkedList.forEach {
            if (fast?.next?.next == null) {
                return slow
            }
            slow = slow?.next
            fast = fast?.next?.next
        }

        return null
    }
}
