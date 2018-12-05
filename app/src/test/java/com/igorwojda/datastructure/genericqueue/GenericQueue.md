# Instructions
Implement a [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) data structure. The queue should be a class with methods:
* `add` method - adds element to a queue (enqueue the element)
* `remove` method - removes the element from a queue (enqueue the element)
* `peek` method - returns last element (the one that should be returned) without removing it from the queue

Adding to the queue should store an element until it is removed. First element added to a queue ill be the first that is removed. This is
generic venison of the queue witch means we must define data type for a queue (`Queue<String>`). You can start with simpler version by
solving [non-generic queue](../queue/Queue.md) queue problem first.

# Hints
* [Kotlin generics](https://kotlinlang.org/docs/reference/generics.html)

# Examples
Example 1
```
val q = Queue<Int>();
q.add(1);
q.remove(); -> returns 1;
q.remove() -> returns null
```

Example 2
```
val q = Queue<Char>();
q.add('A')
q.add('B')
q.add('C')
q.remove() -> returns A
q.remove() -> returns B
q.remove() -> returns C
q.remove() -> returns null
```

# Files
[Package](.)
