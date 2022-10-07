# Stack

## Instructions

Implement a [stack](https://en.wikipedia.org/wiki/Stack) data structure. Adding to the stack should store an element
until it is removed. First element added to a stack will be the last that is removed (FILO).

The stack should be a class with members:
- `add` method - adds element to the stack
- `remove` method - removes the "top" element from the stack
- `peek` method - returns "top" element (the one that should be returned) without removing (removeping) it from the stack
- `isEmpty()` - returns true if there are elements on the stack, otherwise return false
- `size` - numbers of items in the stack

The stack can be implemented in few different ways by using different underlying data structures. Implement each of
them:
- List
- Linked list

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
val s = new Stack()
s.add(1)
s.add(2)
s.remove() // 2
s.remove() // 1
s.remove() // null
```

