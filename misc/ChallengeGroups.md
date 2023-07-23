# Problems groups

This section contains **subset** of challenges that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.). One challenge may fit int outfile groups.

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown)
- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd)
- [Any callback](../src/test/kotlin/com/igorwojda/common/anycallback)
- [Power](../src/test/kotlin/com/igorwojda/integer/power)
- [Binary search tree (validate)](../src/test/kotlin/com/igorwojda/tree/binarytree/validate)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic)
- [Fibonacci with recursive cache](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached)
- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring)
- [Capitalize first](../src/test/kotlin/com/igorwojda/list/capitalizefirst)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort)
  
### Recursion with helper function 

Recurrent helper function is useful when we want to solve problem in recursive way, but we don't want to change client
API by changing method signature of the original method eg. we don't want to add new parameters (additional data required
for recursive call) or change return type (eg. change `List<Int>` to `MutableList<Int>`).

- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/multiway/traversal)

## Double pointer 

Problem solved by using double variable pointing to various indexes of the list. We use double pointer instead of nested
loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero)
- [Pair average](../src/test/kotlin/com/igorwojda/list/pairaverage)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint)
- [Circular check](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck)
- [Medan Of Sorted Lists](../src/test/kotlin/com/igorwojda/list/medianoftwosorted)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Count unique values](../src/test/kotlin/com/igorwojda/list/countuniquevalues)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram)
- [Square equals](../src/test/kotlin/com/igorwojda/list/squareequal)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency)
- [Max occurring char](../src/test/kotlin/com/igorwojda/string/maxoccurringchar)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments)
- [Subtract](../src/test/kotlin/com/igorwojda/list/subtract)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Max sub list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum)
- [Min sub list length](../src/test/kotlin/com/igorwojda/list/minsublistlength)

## List

### Search algorithms

- [Linear search](../src/test/kotlin/com/igorwojda/list/search/linearsearch)
- [Binary search](../src/test/kotlin/com/igorwojda/list/search/binarysearch)
- [Medan Of Sorted Lists](../src/test/kotlin/com/igorwojda/list/medianoftwosorted)

### Sort algorithms

- [Bubble sort](../src/test/kotlin/com/igorwojda/list/sort/bubblesort)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort)
- [Selection sort](../src/test/kotlin/com/igorwojda/list/sort/selectionsort)
- [Insertion sort](../src/test/kotlin/com/igorwojda/list/sort/insertionsort)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort)
- [Radix sort](../src/test/kotlin/com/igorwojda/list/sort/radixsort)

### Other list challenges

- [Capitalize First](../src/test/kotlin/com/igorwojda/list/capitalizefirst)
- [Flatten](../src/test/kotlin/com/igorwojda/list/flatten)
- [Chunk](../src/test/kotlin/com/igorwojda/list/chunk)
- [Max sub-list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum)
- [Min sub-list length](../src/test/kotlin/com/igorwojda/list/minsublistlength)
- [Find the pair with average](../src/test/kotlin/com/igorwojda/list/pairaverage)
- [Product](../src/test/kotlin/com/igorwojda/list/product)
- [Square compare](../src/test/kotlin/com/igorwojda/list/squareequal)
- [List subtract](../src/test/kotlin/com/igorwojda/list/subtract)
- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero)
- [Coins](../src/test/kotlin/com/igorwojda/list/coins)

## Singly Linked List

- [Singly linked list](../src/test/kotlin/com/igorwojda/linkedlist/singly/base)
- [Circular linked list?](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck)
- [Take n-th element from last](../src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint)
- [Add Numbers](../src/test/kotlin/com/igorwojda/linkedlist/singly/addnumbers)

## Doubly Linked List

- [Doubly linked list](../src/test/kotlin/com/igorwojda/linkedlist/doubly/base)

## Binary tree

- [Binary Search Tree (insert)](../src/test/kotlin/com/igorwojda/tree/binarytree/insert)
- [Binary Tree (validate)](../src/test/kotlin/com/igorwojda/tree/binarytree/validate)

## Integer

- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown)
- [Count up and down](../src/test/kotlin/com/igorwojda/integer/countupanddown)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency)
- [Factorial](../src/test/kotlin/com/igorwojda/integer/factorial)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic)
- [FizzBuzz](../src/test/kotlin/com/igorwojda/integer/fizzbuzz)
- [Recursive cache fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached)
- [Generate all pairs](../src/test/kotlin/com/igorwojda/integer/generateallpairs)
- [Get odd numbers](../src/test/kotlin/com/igorwojda/integer/getodd)
- [Power](../src/test/kotlin/com/igorwojda/integer/power)
- [Print numbers](../src/test/kotlin/com/igorwojda/integer/printnumber/basic)
- [Print numbers with steps](../src/test/kotlin/com/igorwojda/integer/printnumber/steps)
- [Pyramid generator](../src/test/kotlin/com/igorwojda/integer/pyramidgenerator)
- [Reverse Int](../src/test/kotlin/com/igorwojda/integer/reverse)
- [Steps generator](../src/test/kotlin/com/igorwojda/integer/stepsgenerator)

## String

- [Caesar Cipher](../src/test/kotlin/com/igorwojda/string/caesarcipher)
- [Capitalize sentence](../src/test/kotlin/com/igorwojda/string/capitalizesentence)
- [Decapitalize const](../src/test/kotlin/com/igorwojda/string/decapitalizeconst)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram)
- [Is palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/basic)
- [Is tolerant palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant)
- [Is permutation palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/permutation)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring)
- [Longest word](../src/test/kotlin/com/igorwojda/string/longestword)
- [Max occurring char](../src/test/kotlin/com/igorwojda/string/maxoccurringchar)
- [Reverse string](../src/test/kotlin/com/igorwojda/string/reverse)
- [Surrounded letter](../src/test/kotlin/com/igorwojda/string/surroundedletter)
- [Find the vowels](../src/test/kotlin/com/igorwojda/string/vowels)
- [Format train route](../src/test/kotlin/com/igorwojda/list/formattrainroute)

## Matrix

- [Spiral matrix generator](../src/test/kotlin/com/igorwojda/matrix/spiralmatrixgenerator)
- [Find rectangle](../src/test/kotlin/com/igorwojda/matrix/findrectangle)

## Range

- [Contains range?](../src/test/kotlin/com/igorwojda/range/containsrange)

## Queue

- [Queue](../src/test/kotlin/com/igorwojda/queue/basic)
- [Combine two queues](../src/test/kotlin/com/igorwojda/queue/combine)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/multiway/traversal)

## Stack

- [Stack](../src/test/kotlin/com/igorwojda/stack/basic)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/multiway/traversal)

## Heap

- [Max binary heap](../src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap)

## Tree

- [Binary search tree](../src/test/kotlin/com/igorwojda/tree/binarysearchtree)
- [Tree level width](../src/test/kotlin/com/igorwojda/tree/multiway/levelwidth)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/multiway/traversal)
