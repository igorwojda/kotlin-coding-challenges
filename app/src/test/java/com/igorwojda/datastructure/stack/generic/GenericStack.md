# Instructions
Implement a [stack](https://en.wikipedia.org/wiki/Stack) data structure. The stack should be a class with methods:
* `push` method - adds element to the stack
* `pop` method - removes the "top" element from the stack
* `peek` method - returns "top" element (the one that should be returned) without removing (popping) it from the stack

Adding to the stack should store an element until it is removed. First element added to a stack will be the last that is removed (FILO).
This is generic venison of the stack witch means we must define data type for the stack (`IntStack<String>`). You can start with simpler version
by solving [Int stack](../int/IntStack.md) stack problem first.

# Hints
* [Kotlin generics](https://kotlinlang.org/docs/reference/generics.html)

# Examples
```
val s = new Stack()
s.push(1)
s.push(2)
s.pop() -> 2
s.pop() -> 1
s.pop() -> null
```

# Files
[Package](.)
