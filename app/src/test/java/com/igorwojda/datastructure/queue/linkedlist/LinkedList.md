
# Instructions
Implement [LinkedList](https://en.wikipedia.org/wiki/Linked_list) data structure (together with corresponding `Node` class). This is quite
big problem, so we will split it into multiple steps (multiple methods and properties tah we have to implement).

We also want to handle various edge cases, because we are assuming that developer using our class many do certain mistakes. That's why each
step has one or more tests. Tests are commented out default, so before staring each step we will have to enable one ore more  related
test(s) by uncommenting it. To quickly uncomment the test elect all lines containing test method and press `Cmd + /` keys (`Comment with
line Comment` action).

# Steps
## 1. constructor `LinkedList<E>()`
* **Description**: Create a class to represent a linked list. When created, a linked list should have no head node associated with it. The
`LinkedList` instance will have one property, 'head', which is a reference to the first node of the linked list. By default 'head' should
be 'null'.
* **Test**: `when list is created head node is null`

Example:
```
val list = LinkedList<Any>()
list.head // null
```

## 2. `insertFirst(data: E)`
* **Description**: Creates a Node from argument 'data' and assigns the resulting node to the 'head' property. Make sure to handle the
case in which the linked list already has a node assigned to the 'head' property.
* **Test**: `appends a node to the start of the list`

Example:
```
val list = LinkedList<String>()
list.insertFirst('Hi There') // List has one node
```

## 3. `size`
* **Description**: Returns the number of nodes in the linked list.
* **Test**: `returns the number of items in the linked list`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.size() // returns 3
```

## 4. `first: Node`
* **Description**: Returns the first node of the linked list.
* **Test**: `returns the first element`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.getFirst() // returns Node instance with data 'a'
```

## 5 `last: Node`
* **Description**: Returns the last node of the linked list
* **Test**: `returns the last element`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.getLast() // returns node with data 'a'
```

## 6. `clear()`
* **Description**: Empties the linked list of any nodes.
* **Test**: `empties out the list`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.clear()
list.size() // returns 0
```

## 7. `removeFirst()`
* **Description**: 	Removes only the first node of the linked list. The list's head should now be the second element.
* **Tests**: `removes the first node when the list has a size of one`, `removes the first node when the list has a size of three`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.removeFirst()
list.getFirst() // returns node with data 'a'
```

## 8. `removeLast()`
* **Description**: removes the last node of the chain.
* **Tests**: `removeLast removes the last node when list is empty`, `removeLast removes the last node when list is length 1`,
`removeLast removes the last node when list is length 2`, `removeLast removes the last node when list is length 3`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.removeLast()
list.size() // returns 1
list.getLast() // returns node with data of 'b'

```

## 9. `insertLast(data: E)`
* **Description**: Inserts a node with provided data at the end of the chain.
* **Test**: `add to the end of the list`

Example:
```
val list = LinkedList()
list.insertFirst('a')
list.insertFirst('b')
list.insertLast('c')
list.getLast() // returns node with data 'C'
```

## 10. `getAt(index: Int)`
* **Description**: 	Returns the node at the provided index.
* **Test**: `returns the node at given index`

Example:
```
val list = List()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.getAt(1) // returns node with data 'b'
```

## 11. `removeAt(index: Int)`
* **Description**: 	Removes node at the provided index.
* **Test**: `removeAt does not crash on an empty list`, `removeAt does not crash on an index out of bounds`,
`removeAt deletes the first node`, `removeAt deletes the node at the given index`

Example:
```
val list = List()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.removeAt(1)
list.getAt(1) // returns node with data 'a'
```

## 12. `insertAt(data: E, index: Int)`
* **Description**: 	Create an insert a node at provided index. If index is out of bounds, add the node to the end of the list.
* **Test**: `inserts a new node with data at the 0 index when the list is empty`,
`inserts a new node with data at the 0 index when the list has elements`, `inserts a new node with data at a middle index`,
`inserts a new node with data at a last index`, `insert a new node when index is out of bounds`

Example:
```
val list = List()
list.insertFirst('a')
list.insertFirst('b')
list.insertFirst('c')
list.insertAt('Hi', 1)
list.getAt(1) // returns node with data 'Hi'
```

## 12. Implement Kotlin `Iterator` interface
* **Description**: Calls the provided function with every node of the chain
* **Test**:

Example:
```
val list = List()

list.insertLast(1)
list.insertLast(2)
list.insertLast(3)
list.insertLast(4)

list.forEach(node => {
node.data += 10
})
list.getAt(0) // Returns node with data '11'
```

# Files
[Package](.)
