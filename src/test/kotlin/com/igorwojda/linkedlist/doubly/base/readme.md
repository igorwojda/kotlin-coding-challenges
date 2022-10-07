# Doubly linked list

## Nice to solve before

[Singly linked List](../../singly/base/readme.md)

### Instructions

Implement [doubly linked list](https://en.wikipedia.org/wiki/Doubly_linked_list) data structure. This is quite big
challenge, so we will split it into multiple multiple methods and properties that we will implement one my one.

We also want to handle various edge cases, because we are assuming that developer using our class many do certain
mistakes. That's why each step has one or more tests associated with it. Tests are commented out default, so before
staring each step we will have to enable all tests related to given step by uncommenting it. To quickly uncomment the
test select all lines containing test method and press `Cmd + /` keys (`Comment with line Comment` action).

[challenge](challenge.kt) | [solution](solution.kt)

### 1. constructor `DoublyLinkedList<E>()`

Create a class to represent a linked list. When created, a linked list should have no head node associated with it. The
`DoublyLinkedList` instance will have one property, `head`, which is a reference to the first node of the linked list. By
default `head` should be `null`.

Tests: 
- `when list is created head node is null`

Example:

```kotlin
val list = DoublyLinkedList<Any>()
list.head // null
```

### 2. `insertFirst(data: E)` method

Creates a Node from argument `data` and assigns the resulting node to the `head` property. Make sure to handle the case
in which the linked list already has a node assigned to the `head` property.

Tests: 
- `append a node to the start of the list`

Example:

```kotlin
val list = DoublyLinkedList<String>()
list.insertFirst('Hi There') // List has one node
```

Example:

```kotlin
val list = DoublyLinkedList<String>()
list.insertFirst('Hi There') // List has one node
```

### 3. `size` property

Returns the number of nodes in the linked list.

Tests: 
- `return the number of items in the linked list`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.size() // 3
```

### 4. `first: Node` property

Returns the first node of the linked list.

Tests: 
- `return the first element`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.getFirst() // 'a'
```

### 5 `last: Node` property

Returns the last node of the linked list

Tests: 
- `return the last element`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.getLast() // 'a'
```

### 6. `clear()` method

Empties the linked list of any nodes.

Tests: 
- `empty out the list`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.clear()
list.size() // 0
```

### 7. `removeFirst()` method

Removes only the first node of the linked list. The list's head should now be the second element.

Tests: 
- `remove the first node when the list has a size of one`,
- `remove the first node when the list has a size of three`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.removeFirst()
list.getFirst() // 'a'
```

### 8. `removeLast()` method

Removes the last node of the chain.

Tests: 
- `remove the last node when list is empty`,
- `remove the last node when list is length 1`,
- `remove the last node when list is length 2`,
- `remove the last node when list is length 3`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.removeLast()
list.size() // 1
list.getLast() // of 'b'

```

### 9. `insertLast(data: E)` method

Inserts a node with given data at the end of the chain.

Tests: 
- `add to the end of the list`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertLast('c')
list.getLast() // 'C'
```

### 10. `getAt(index: Int)` method

Returns the node at the given index.
 
Tests:
- `return the node at given index`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.getAt(1) // 'b'
```

### 11. `setAt()` method

Set the value at given index.

Tests: 
- `set node data at index 0`
- `set node data at the index 1`
- `set node data at the index 2`
- `set node data at non existing index`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertLast("a")
list.insertLast("b")
list.insertLast("c")
list.setAt("new", 1)
list.getAt(0) // "a"
list.getAt(1) // "new"
list.getAt(2) // "c"
```

### 12. `removeAt(index: Int)` method

Removes node at the given index.
    
Tests: 
- `remove from empty list`
- `remove with index out of bounds`
- `remove the first node`
- `remove the node at given index`
- `remove the last node`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.removeAt(1)
list.getAt(1) // 'a'
```

### 13. `insertAt(data: E, index: Int)` method

Create an insert a node at given index. If index is out of bounds, add the node to the end of the list. 

Tests: 
- `insert a new node with data at the 0 index 0 when the list is empty`
- `insert a new node with data at index 0 when the list has elements`
- `inserts a new node with data at a middle index`
- `insert a new node with data at a last index`
- `insert a new node when index is out of bounds`

Example:

```kotlin
val list = DoublyLinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.insertAt('H', 1)
list.getAt(1) // 'H'
```

### 14. Kotlin `Iterator` interface

Allows to iterate over list of items using t Kotlin
  [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) and
  [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) interfaces. This
  allows to use many Kotlin extensions for `Iterable` interface such as `forEach`, `filter`, `sumBy`, `map` etc.
  
Tests: 
- `sum all the nodes`

Example 1:

```kotlin
val list = DoublyLinkedList<Int>()

list.insertLast(1)
list.insertLast(2)
list.insertLast(3)
list.insertLast(4)

list.forEach { print(node) } // 1234
```

Example 2:

```kotlin
val list = DoublyLinkedList()

list.insertLast(1)
list.insertLast(2)
list.insertLast(3)
list.insertLast(4)

list.sumBy { it.data } // 10
```

### 15. Add plus operator overloading

Implement [operator overloading](https://kotlinlang.org/docs/reference/operator-overloading.html) to easily add two
lists lists.

Tests
- `add two empty lists`, `add two lists`


```kotlin
val list1 = DoublyLinkedList<Int>()
list1.insertLast(1)
list1.insertLast(2)

val list2 = DoublyLinkedList<Int>()
list2.insertLast(3)
list2.insertLast(4)
list2.insertLast(5)


list.size shouldBeEqualTo 5
list.getAt(0)?.data shouldBeEqualTo 1
list.getAt(1)?.data shouldBeEqualTo 2
list.getAt(2)?.data shouldBeEqualTo 3
list.getAt(3)?.data shouldBeEqualTo 4
list.getAt(4)?.data shouldBeEqualTo 5
```

