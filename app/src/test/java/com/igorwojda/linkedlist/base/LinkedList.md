# Linked list

### Instructions

Implement [LinkedList](https://en.wikipedia.org/wiki/Linked_list) data structure. This is quite big puzzle, so we will
split it into multiple generateSteps (multiple methods and properties that we have to implement).

We also want to handle various edge cases, because we are assuming that  developer using our class many do certain
mistakes. That's why each step has one or more tests associated with it. Tests are commented out default, so before
staring each step we will have to enable all tests related to given step by uncommenting it. To quickly uncomment the
test select all lines containing test method and press `Cmd + /` keys (`Comment with line Comment` action).


## Basic steps

Solution for basics generateSteps is available in the `LinkedListSolutionBasic` object
([LinkedListSolution.kt](LinkedListSolution.kt) file).

### 1. constructor `LinkedList<E>()`

- **Description**: Create a class to represent a linked list. When created, a linked list should have no head node
  associated with it. The `LinkedList` instance will have one property, `head`, which is a reference to the first node
  of the linked list. By default `head` should be `null`.
- **Test**: `when list is created head node is null`

Example:

```
val list = LinkedList<Any>()
list.head // null
```

### 2. `insertFirst(data: E)` method

- **Description**: Creates a Node from argument `data` and assigns the resulting node to the `head` property. Make sure
  to handle the case in which the linked list already has a node assigned to the `head` property.
- **Test**: `append a node to the start of the list`

Example:

```
val list = LinkedList<String>()
list.insertFirst('Hi There') // List has one node
```

Example:

```
val list = LinkedList<String>()
list.insertFirst('Hi There') // List has one node
```

### 3. `size` property

- **Description**: Returns the number of nodes in the linked list.
- **Test**: `return the number of items in the linked list`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.size() // 3
```

### 4. `first: Node` property

- **Description**: Returns the first node of the linked list.
- **Test**: `return the first element`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.getFirst() // 'a'
```

### 5 `last: Node` property

- **Description**: Returns the last node of the linked list
- **Test**: `return the last element`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.getLast() // 'a'
```

### 6. `clear()` method

- **Description**: Empties the linked list of any nodes.
- **Test**: `empty out the list`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.clear()
list.size() // 0
```

### 7. `removeFirst()` method

- **Description**: 	Removes only the first node of the linked list. The list's head should now be the second element.
- **Tests**: `remove the first node when the list has a size of one`,
  `remove the first node when the list has a size of three`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.removeFirst()
list.getFirst() // 'a'
```

### 8. `removeLast()` method

- **Description**: removes the last node of the chain.
- **Tests**: `remove the last node when list is empty`,
  `remove the last node when list is length 1`,
  `remove the last node when list is length 2`,
  `remove the last node when list is length 3`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.removeLast()
list.size() // 1
list.getLast() // of 'b'

```

### 9. `insertLast(data: E)` method

- **Description**: Inserts a node with provided data at the end of the chain.
- **Test**: `add to the end of the list`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertLast('c')
list.getLast() // 'C'
```

### 10. `getAt(index: Int)` method

- **Description**: 	Returns the node at the provided index.
- **Test**: `return the node at given index`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.getAt(1) // 'b'
```

### 11. `removeAt(index: Int)` method

- **Description**: 	Removes node at the provided index.
- **Tests**: `remove from empty list`,
  `remove with index out of bounds`,
  `remove the first node`,
  `remove the node at the given index`,
  `remove the last node`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.removeAt(1)
list.getAt(1) // 'a'
```

### 12. `insertAt(data: E, index: Int)` method

- **Description**: Create an insert a node at provided index. If index is out of bounds, add the node to the end of the
  list.
- **Tests**: `insert a new node with data at the 0 index when the list is empty`,
  `insert a new node with data at the 0 index when the list has elements`,
  `inserts a new node with data at a middle index`,
  `insert a new node with data at a last index`,
  `insert a new node when index is out of bounds`

Example:

```
val list = LinkedList<Char>()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.insertAt('H', 1)
list.getAt(1) // 'H'
```

## Extra steps

Solution for extended generateSteps is available in the `LinkedListSolutionExtended` object
([LinkedListSolution.kt](LinkedListSolution.kt) file).

### 13. Update internal implementation

If you haven't done it already it's a good time to refactor the `LinkedList` class. We can improve internal
implementations without changing the external API. Methods
`insertFirst`/`insertLast`/`removeFirst`/`removeLast`/`first`/`last` can be refactored by using `insertAt`/
`removeAt`/`getAt` methods (with appropriate) parameters.
- **Tests**: No new tests here, just makes sure all the previous tests are passing.

### 14. Kotlin `Iterator` interface

- **Description**: Allows to iterate over list of items using t Kotlin
  [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) and
  [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) interfaces. This
  allows to use many Kotlin extensions for `Iterable` interface such as `forEach`, `filter`, `sumBy`, `map` etc.
- **Tests**: `sum all the nodes`

Example 1:

```
val list = LinkedList<Int>()

list.insertLast(1)
list.insertLast(2)
list.insertLast(3)
list.insertLast(4)

list.forEach { print(node) } // 1234
```

Example 2:

```
val list = LinkedList()

list.insertLast(1)
list.insertLast(2)
list.insertLast(3)
list.insertLast(4)

list.sumBy { it.data } // 10
```

### 15. Add plus operator overloading

Implement [operator overloading](https://kotlinlang.org/docs/reference/operator-overloading.html) to easily add two
lists lists.

- **Tests*- `add two empty lists`, `add two lists`


```
val list1 = LinkedList<Int>()
list1.insertLast(1)
list1.insertLast(2)

val list2 = LinkedList<Int>()
list2.insertLast(3)
list2.insertLast(4)
list2.insertLast(5)


list.size shouldEqual 5
list.getAt(0)?.data shouldEqual 1
list.getAt(1)?.data shouldEqual 2
list.getAt(2)?.data shouldEqual 3
list.getAt(3)?.data shouldEqual 4
list.getAt(4)?.data shouldEqual 5
```

