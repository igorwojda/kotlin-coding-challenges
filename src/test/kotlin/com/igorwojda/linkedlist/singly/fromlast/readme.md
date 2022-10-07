# Take n-th element from last

## Nice to solve before

- [Singly linked list](../base/readme.md)
- [Midpoint](../midpoint/readme.md)
- [Circular check](../circularcheck/readme.md)

## Instructions

Given a linked list, return the element n positions from the last node in the list. Assume that `endIndex` will always
be less than the length of the list.

[challenge](challenge.kt) | [solution](solution.kt)

## Limitations

Do not use a counter variable, do not retrieve the `size` of the list, and only iterate through the **whole*- list one
time.

## Examples

```kotlin
val l = LinkedList<Char>()
l.insertLast('a')
l.insertLast('b')
l.insertLast('c')
l.insertLast('d')
l.insertLast('e')

fromLast(l, 0)?.data shouldBeEqualTo 'e'
fromLast(l, 3)?.data shouldBeEqualTo 'b'
```

## Hints

<details>
<summary>Hint 1</summary>
desc
</details>
