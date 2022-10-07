# Problems groups

This section contains **subset** of challenges that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.). One challenge may fit int outfile groups.

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/readme.md)
- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/readme.md)
- [Any callback](../src/test/kotlin/com/igorwojda/various/anycallback/readme.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/readme.md)
- [Binary search tree (validate)](../src/test/kotlin/com/igorwojda/tree/binarytree/validate/readme.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/readme.md)
- [Fibonacci with recursive cache](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/readme.md)
- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/readme.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/readme.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/readme.md)
- [Capitalize first](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/readme.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/readme.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/readme.md)
  
### Recursion with helper function 

Recurrent helper function is useful when we want to solve problem in recursive way, but we don't want to change client
API by changing method signature of the original method eg. we don't want to add new parameters (additional data required
for recursive call) or change return type (eg. change `List<Int>` to `MutableList<Int>`).

- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/readme.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/readme.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/readme.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/readme.md)

## Double pointer 

Problem solved by using double variable pointing to various indexes of the list. We use double pointer instead of nested
loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/readme.md)
- [Pair average](../src/test/kotlin/com/igorwojda/list/pairaverage/readme.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/readme.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/readme.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/readme.md)
- [Circular check](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/readme.md)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Count unique values](../src/test/kotlin/com/igorwojda/list/countuniquevalues/readme.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/readme.md)
- [Square equals](../src/test/kotlin/com/igorwojda/list/squareequal/readme.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/readme.md)
- [Max occurring char](../src/test/kotlin/com/igorwojda/string/maxchar/readme.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/readme.md)
- [Subtract](../src/test/kotlin/com/igorwojda/list/subtract/readme.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/readme.md)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Max sub list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/readme.md)
- [Min sub list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/readme.md)

## List

### Search algorithms

- [Linear search](../src/test/kotlin/com/igorwojda/list/search/linearsearch/readme.md)
- [Binary search](../src/test/kotlin/com/igorwojda/list/search/binarysearch/readme.md)

### Sort algorithms

- [Bubble sort](../src/test/kotlin/com/igorwojda/list/sort/bubblesort/readme.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/readme.md)
- [Selection sort](../src/test/kotlin/com/igorwojda/list/sort/selectionsort/readme.md)
- [Insertion sort](../src/test/kotlin/com/igorwojda/list/sort/insertionsort/readme.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/readme.md)
- [Radix sort](../src/test/kotlin/com/igorwojda/list/sort/radixsort/readme.md)

### Other list challenges

- [Capitalize First](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/readme.md)
- [Flatten](../src/test/kotlin/com/igorwojda/list/flatten/readme.md)
- [List chunking](../src/test/kotlin/com/igorwojda/list/listchunk/readme.md)
- [Max sub-list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/readme.md)
- [Min sub-list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/readme.md)
- [Find the pair with average](../src/test/kotlin/com/igorwojda/list/pairaverage/readme.md)
- [Product](../src/test/kotlin/com/igorwojda/list/product/readme.md)
- [Square compare](../src/test/kotlin/com/igorwojda/list/squareequal/readme.md)
- [List subtract](../src/test/kotlin/com/igorwojda/list/subtract/readme.md)
- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/readme.md)
- [Coins](src/test/kotlin/com/igorwojda/list/coins/readme.md)

## Singly Linked List

- [Singly linked list](../src/test/kotlin/com/igorwojda/linkedlist/singly/base/readme.md)
- [Circular linked list?](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/readme.md)
- [Take n-th element from last](../src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast/readme.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/readme.md)

## Doubly Linked List

- [Doubly linked list](../src/test/kotlin/com/igorwojda/linkedlist/doubly/base/readme.md)

## Binary tree

- [Binary Search Tree (insert)](../src/test/kotlin/com/igorwojda/tree/binarytree/insert/readme.md)
- [Binary Tree (validate)](../src/test/kotlin/com/igorwojda/tree/binarytree/validate/readme.md)

## Integer

- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/readme.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/readme.md)
- [Count up and down](../src/test/kotlin/com/igorwojda/integer/countupanddown/readme.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/readme.md)
- [Factorial](../src/test/kotlin/com/igorwojda/integer/factorial/readme.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/readme.md)
- [FizzBuzz](../src/test/kotlin/com/igorwojda/integer/fizzbuzz/readme.md)
- [Recursive cache fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/readme.md)
- [Generate all pairs](../src/test/kotlin/com/igorwojda/integer/generateallpairs/readme.md)
- [Get odd numbers](../src/test/kotlin/com/igorwojda/integer/getodd/readme.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/readme.md)
- [Print numbers](../src/test/kotlin/com/igorwojda/integer/printnumber/basic/readme.md)
- [Print numbers with steps](../src/test/kotlin/com/igorwojda/integer/printnumber/steps/readme.md)
- [Pyramid generator](../src/test/kotlin/com/igorwojda/integer/pyramidgenerator/readme.md)
- [Reverse Int](../src/test/kotlin/com/igorwojda/integer/reverse/readme.md)
- [Steps generator](../src/test/kotlin/com/igorwojda/integer/stepsgenerator/readme.md)

## String

- [Caesar Cipher](../src/test/kotlin/com/igorwojda/string/caesarcipher/readme.md)
- [Capitalize sentence](../src/test/kotlin/com/igorwojda/string/capitalizesentence/readme.md)
- [Decapitalize const](../src/test/kotlin/com/igorwojda/string/decapitalizeconst/readme.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/readme.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/readme.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/readme.md)
- [Is palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/basic/readme.md)
- [Is tolerant palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant/readme.md)
- [Is permutation palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/permutation/readme.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/readme.md)
- [Longest word](../src/test/kotlin/com/igorwojda/string/longestword/readme.md)
- [Max occurrent char](../src/test/kotlin/com/igorwojda/string/maxchar/readme.md)
- [Reverse string](../src/test/kotlin/com/igorwojda/string/reverse/readme.md)
- [Surrounded letter](../src/test/kotlin/com/igorwojda/string/surroundedletter/readme.md)
- [Find the vowels](../src/test/kotlin/com/igorwojda/string/vowels/readme.md)
- [Format train route](../src/test/kotlin/com/igorwojda/list/formattrainroute/readme.md)

## Matrix

- [Spiral matrix generator](../src/test/kotlin/com/igorwojda/matrix/spiralmatrixgenerator/readme.md)
- [Find rectangle](../src/test/kotlin/com/igorwojda/matrix/findrectangle/readme.md)

## Range

- [Contains range?](../src/test/kotlin/com/igorwojda/range/containsrange/readme.md)

## Queue

- [Queue](../src/test/kotlin/com/igorwojda/queue/basic/readme.md)
- [Combine two queues](../src/test/kotlin/com/igorwojda/queue/combine/readme.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/readme.md)

## Stack

- [Stack](../src/test/kotlin/com/igorwojda/stack/basic/readme.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/readme.md)

## Heap

- [Max binary heap](../src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap/readme.md)

## Tree

- [Binary search tree](../src/test/kotlin/com/igorwojda/tree/binarysearchtree/readme.md)
- [Tree level width](../src/test/kotlin/com/igorwojda/tree/classic/levelwidth/readme.md)
- [Tree](../src/test/kotlin/com/igorwojda/tree/classic/traversal/readme.md)
