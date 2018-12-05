# Instructions
Implement the `weave` function.  Weave receives two queues as arguments and combines the contents of each into a new, third queue.
The third queue should contain the content of the two queues. The function should handle queues of different lengths without
inserting `null` into the new one. Take into consideration the fact that both queues may be of different length. Queue can only expose
`add`, `remove`, and `peek` methods to external clients.

# Examples
```
val queueOne = new Queue();
queueOne.add(1);
queueOne.add(2);

val queueTwo = new Queue();
queueTwo.add('Hi');
queueTwo.add('There');

val queueThree = weave(queueOne, queueTwo);
queueThree.remove() // 1
queueThree.remove() // 'Hi'
queueThree.remove() // 2
queueThree.remove() // 'There'
```
