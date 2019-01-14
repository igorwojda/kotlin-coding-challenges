# Take n-th element from last

## Nice to solve before

* [Linked list](../base/LinkedList.md)
* [Linked list midpoint](../midpoint/Midpoint.md)
* [Circular linked list?](../circularcheck/CircularCheck.md)

## Instructions

Given a linked list, return the element n positions from the last node in the list. Assume that `endIndex` will always be less than the
length of the list.

[Puzzle files](.)

## Limitations

Do not use a counter variable, do not retrieve the `size` of the list, and only iterate through the **whole** list one time.

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
