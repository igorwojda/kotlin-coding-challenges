# Circular singly linked list

## Nice to solve before

[Singly linked List](../base/readme.md)

## Instructions

Given a linked list, return true if the list is circular, false if it is not.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

Example 1

```kotlin
val l = new SinglyLinkedList ()
val a = new Node ('a')
val b = new Node ('b')
val c = new Node ('c')
l.head = a
a.next = b
b.next = c
c.next = b
circular(l) // true
```

Example 2

```kotlin
val l = new List ()
val a = new Node ('a')
circular(l) // false
```

## Hints

<details>
<summary>Hint 1</summary>
We should use more then one variable to store values that are retrieved during iteration (two pointer solution)
</details>

<details>
<summary>Hint 2</summary>
Name of these variables should be `slow` and `fast`
</details>

<details>
<summary>Hint 3</summary>
Assign next node to `slow` variable in every iteration
</details>

<details>
<summary>Hint 4</summary>
Assign next node of next node to `fast` variable in every iteration
</details>

