# Two stack queue

## Prerequirements
* Before this challenge you should complete [Int queue](/app/src/test/java/com/igorwojda/datastructure/queue/int/IntQueue.md) and
[Int stack](/app/src/test/java/com/igorwojda/datastructure/stack/int/IntStack.md) puzzles or have good understanding how `stack` and `queue`
works.

## Instructions
[Problem files](.)

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure using two stacks. Do not create an list
inside of the 'Queue' class.The queue should be a class with methods:
* `add` method - adds element to a queue (enqueue the element)
* `remove` method - removes the element from a queue (enqueue the element)
* `peek` method - returns last element (the one that should be returned) without removing it from the queue

## Examples
```
val q = new Queue();
q.add(1);
q.add(2);
q.peek();  // returns 1
q.remove(); // returns 1
q.remove(); // returns 2
```

