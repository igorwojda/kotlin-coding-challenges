import com.igorwojda.datastructure.linkedlist.base.LinkedListSolutionExtended

private object MidpointSolution {
    private fun midpoint(list: LinkedListSolutionExtended.LinkedList<Char>): LinkedListSolutionExtended.Node<Char>? {
        var slow = list.first
        var fast = list.first

        list.forEach {
            if (fast?.next?.next == null) {
                return slow
            }
            slow = slow?.next
            fast = fast?.next?.next
        }

        return null
    }
}
