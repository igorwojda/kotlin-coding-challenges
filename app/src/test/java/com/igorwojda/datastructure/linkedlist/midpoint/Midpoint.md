# Instructions
[Problem files](.)

Return the 'middle' node of a linked list. If the list has an even number of elements, return
the node at the end of the first half of the list.

# Limitations
Do not use a counter variable, do not retrieve the `size` of the list, and only iterate through the list one time.

# Hints
>! Hint 1 We are using version of linked list that implements Kotlin
[iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) interface.

>! Hint 2 We should use more then one variable to store values that are retrieved during iteration

>! Hint 3 Name of these variables should be `slow` and `fast`

>! Hint 4 Assign next node to `slow` variable in every iteration

>! Hint 5 Assign next node of next node to `fast` variable in every iteration

# Examples
Example 1
```
val l = new LinkedList()
l.insertLast('a')
l.insertLast('b')
l.insertLast('c')
midpoint(l).data // returns 'b'
```

Example 2
```
val l = new LinkedList()
l.insertLast('a')
l.insertLast('b')
l.insertLast('c')
l.insertLast('d')
midpoint(l).data // returns 'b'
```
