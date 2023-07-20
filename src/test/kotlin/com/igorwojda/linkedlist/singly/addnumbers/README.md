# Add Numbers

## Instructions

Compute the sum of two non-empty linked lists, each representing a non-negative integer. he individual digits of these 
integers are stored in the linked lists in reverse order, with each node holding a single digit. The result of the 
addition should be returned as a linked list.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
private data class ListNode(
    var data: Int,
    var next: ListNode? = null,
)

val i1 = ListNode(1)
i1.next = ListNode(3)

val i2 = ListNode(11)

addTwoNumbers(i1, i2) // returns ListNode(2, ListNode(4))
```
