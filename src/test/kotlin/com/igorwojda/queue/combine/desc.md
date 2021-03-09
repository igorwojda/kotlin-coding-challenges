# Combine two queues

## Instructions

Given two queues implement a function which combines the contents of each queue into third queue. The third queue should
contain the content of the two queues. The function should handle queues of different lengths without inserting `null`
into the new one. Take into consideration the fact that both queues may be of different length. IntQueue can only expose
`add`, `remove`, and `peek` methods to external clients.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
val queueOne = new Queue()
queueOne.add(1)
queueOne.add(2)

val queueTwo = new Queue()
queueTwo.add('Hi')
queueTwo.add('There')

val queueThree = weave(queueOne, queueTwo)
queueThree.remove() // 1
queueThree.remove() // 'Hi'
queueThree.remove() // 2
queueThree.remove() // 'There'
```

