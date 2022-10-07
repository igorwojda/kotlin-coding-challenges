# Queue

## Nice to solve before

[Stack](../../stack/basic/readme.md)

## Instructions

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure. Adding to the queue should store an element until it is removed. First element added to a queue will be the first that
is removed (FIFO). The queue should be a
class with methods:
- `add` method - adds element to a queue (enqueue the element)
- `remove` method - removes the element from a queue (enqueue the element)
- `peek` method - returns last element (the one that should be returned) without removing it from the queue
- `isEmpty` method - return `true` if queue is empty, otherwise return `false`

The queue can be implemented in few different ways by using different underlying data structures. Implement each of
them:
- List
- Linked list
- Two Stacks

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

Example 1

```kotlin
val q = Queue<Int>()
q.add(1)
q.remove() // 1
q.remove() // null
```

Example 2

```kotlin
val q = Queue<Char>()
q.isEmpty() // true
q.add('A')
q.isEmpty() // false
q.add('B')
q.add('C')
q.remove() // A
q.peek() // A
q.peek() // A
q.remove() // B
q.remove() // C
q.remove() // null
```
