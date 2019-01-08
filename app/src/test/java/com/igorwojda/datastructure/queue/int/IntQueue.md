# Int queue

## Instructions

[Problem files](.)

Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure. The queue should be a class with methods:
* `add` method - adds element to a queue (enqueue the element)
* `remove` method - removes the element from a queue (enqueue the element)
* `peek` method - returns last element (the one that should be returned) without removing it from the queue
* `isEmpty` method - return `true` if queue is empty, otherwise return `false`

Adding to the queue should store an element until it is removed. First element added to a queue will be the first that is removed (FIFO).
For simplicity we can assume that IntQueue will only accept `Int` as it's element type.


## Examples

Example 1

```
val q = Queue()
q.add(1)
q.remove() //return  1
q.remove() //return null
```

Example 2

```
val q = Queue()
q.isEmpty() //return true
q.add(1)
q.isEmpty() //return false
q.add(2)
q.add(3)
q.remove() //return 1
q.peek() //return 2
q.peek() //return 2
q.remove() //return 2
q.remove() //return 3
q.remove() //return null
```

