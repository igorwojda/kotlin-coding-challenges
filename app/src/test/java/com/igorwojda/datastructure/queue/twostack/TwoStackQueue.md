# Two stack queue

## Nice to solve before

* [Int queue](/app/src/test/java/com/igorwojda/datastructure/queue/int/IntQueue.md)
* [Int stack](/app/src/test/java/com/igorwojda/datastructure/stack/int/IntStack.md)

## Instructions

[Problem files](.)

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure using two stacks. Do not create an list
inside of the 'Queue' class.The queue should be a class with methods:
* `add` method - adds element to a queue (enqueue the element)
* `remove` method - removes the element from a queue (enqueue the element)
* `peek` method - returns last element (the one that should be returned) without removing it from the queue
* `isEmpty` method - return `true` if queue is empty, otherwise return `false`

## Examples

```
val q = new Queue();
q.isEmpty() //return true
q.add(1);
q.isEmpty() //return false
q.add(2);
q.peek();  // return 1
q.remove(); // return 1
q.remove(); // return 2
```

