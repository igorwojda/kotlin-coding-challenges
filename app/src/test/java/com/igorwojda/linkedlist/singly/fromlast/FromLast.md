# Take n-th element from last

## Nice to solve before

- [Singly linked list](../base/SinglyLinkedList.md)
- [Midpoint](../midpoint/Midpoint.md)
- [Circular check](../circularcheck/CircularCheck.md)

## Instructions

Given a linked list, return the element n positions from the last node in the list. Assume that `endIndex` will always
be less than the length of the list.

[Puzzle](FromLast.kt) | [Solution](FromLastSolution.kt)

## Limitations

Do not use a counter variable, do not retrieve the `size` of the list, and only iterate through the **whole*- list one
time.

## Examples

```
val l = LinkedList<Char>()
l.insertLast('a')
l.insertLast('b')
l.insertLast('c')
l.insertLast('d')
l.insertLast('e')

fromLast(l, 0)?.data shouldEqual 'e'
fromLast(l, 3)?.data shouldEqual 'b'
```

## Hints

<details>
<summary>Hint 1</summary>
desc
</details>
