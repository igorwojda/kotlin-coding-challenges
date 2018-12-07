# Generic queue

## Prerequirements
Before this challenge you should complete [Int queue](/app/src/test/java/com/igorwojda/datastructure/queue/int/IntQueue.md) queue
problem first.

## Instructions
[Problem files](.)

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure. The queue should be a class with methods:
* `add` method - adds element to a queue (enqueue the element)
* `remove` method - removes the element from a queue (enqueue the element)
* `peek` method - returns last element (the one that should be returned) without removing it from the queue

Adding to the queue should store an element until it is removed. First element added to a queue will be the first that is removed (FIFO).
This is [generic](https://kotlinlang.org/docs/reference/generics.html) venison of the queue witch means we must define data type for the
queue (`IntQueue<String>`).

## Examples
Example 1
```
val q = Queue<Int>()
q.add(1)
q.remove() //return returns 1
q.remove() //return returns null
```

Example 2
```
val q = Queue<Char>()
q.add('A')
q.add('B')
q.add('C')
q.remove() //return returns A
q.remove() //return returns B
q.remove() //return returns C
q.remove() //return returns null
```

