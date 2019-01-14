# Two stack queue

## Nice to solve before

[Int Queue.kt](../int/IntQueue.kt)
[IntStack.kt](../../stack/int/IntStack.kt)

## Instructions

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure using two stacks. Do not create an list
inside of the 'Queue' class.The queue should be a class with methods:
* `add` method - adds element to a queue (enqueue the element)
* `remove` method - removes the element from a queue (enqueue the element)
* `peek` method - returns last element (the one that should be returned) without removing it from the queue
* `isEmpty` method - return `true` if queue is empty, otherwise return `false`

[Puzzle files](.)

## Examples

```
val q = new Queue();
q.isEmpty() // true
q.add(1);
q.isEmpty() // false
q.add(2);
q.peek();  // 1
q.remove(); // 1
q.remove(); // 2
```

