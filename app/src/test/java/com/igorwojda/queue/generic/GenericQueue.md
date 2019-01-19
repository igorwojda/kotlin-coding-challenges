# Generic queue

## Nice to solve before

- [Int queue](../int/IntQueue.md)

## Instructions

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure. The queue should be a class with methods:
- `add` method - adds element to a queue (enqueue the element)
- `remove` method - removes the element from a queue (enqueue the element)
- `peek` method - returns last element (the one that should be returned) without removing it from the queue
- `isEmpty` method - return `true` if queue is empty, otherwise return `false`

Adding to the queue should store an element until it is removed. First element added to a queue will be the first that is removed (FIFO).
This is [generic](https://kotlinlang.org/docs/reference/generics.html) venison of the queue which means we must define data type for the
queue (`IntQueue<String>`).

[Puzzle](GenericQueue.kt) | [Solution](GenericQueueSolution.kt)

## Examples

Example 1

```
val q = Queue<Int>()
q.add(1)
q.remove() // 1
q.remove() // null
```

Example 2

```
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

