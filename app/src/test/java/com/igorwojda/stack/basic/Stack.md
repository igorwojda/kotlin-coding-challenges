# Generic stack

## Instructions

Implement a [stack](https://en.wikipedia.org/wiki/Stack) data structure. Adding to the stack should store an element until it is removed. First element added to a stack will be the last that is
removed (FILO). This is [generic](https://kotlinlang.org/docs/reference/generics.html) venison of the stack which means
we must define data type for the stack (`IntStack<String>`).

The stack should be a class with members:
- `push` method - adds element to the stack
- `pop` method - removes the "top" element from the stack
- `peek` method - returns "top" element (the one that should be returned) without removing (popping) it from the stack
- `isEmpty()` - returns true if there are elements on the stack, otherwise return false
- `size` - numbers of items in the stack

[Puzzle](Stack.kt) | [Solution](StackSolution.kt)

## Examples

```
val s = new Stack()
s.push(1)
s.push(2)
s.pop() // 2
s.pop() // 1
s.pop() // null
```

