# Int stack

## Instructions

[Puzzle files](.)

Implement a [stack](https://en.wikipedia.org/wiki/Stack) data structure. The stack should be a class with methods:
* `push` method - adds element to the stack
* `pop` method - removes the "top" element from the stack
* `peek` method - returns "top" element (the one that should be returned) without removing (popping) it from the stack

Adding to the stack should store an element until it is removed. First element added to a stack will be the last that is removed (FILO). For
simplicity we can assume that IntQueue will only accept `Int` as it's element type.

## Examples

Example 1

```
val q = Queue()
q.add(1)
q.remove() // 1
q.remove() // null
```

Example 2

```
val q = Queue()
q.add(1)
q.add(2)
q.add(3)
q.remove() // 1
q.remove() // 2
q.remove() // 3
q.remove() // null
```

