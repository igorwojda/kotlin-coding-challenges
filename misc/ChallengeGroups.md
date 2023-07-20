# Problems groups

This section contains **subset** of challenges that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.). One challenge may fit int outfile groups.

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/README.md)
- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/README.md)
- [Any callback](../src/test/kotlin/com/igorwojda/various/anycallback/README.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/README.md)
- [Binary search tree (validate)](../src/test/kotlin/com/igorwojda/tree/binarytree/validate/README.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/README.md)
- [Fibonacci with recursive cache](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/README.md)
- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/README.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/README.md)
- [Capitalize first](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/README.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/README.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/README.md)
  
### Recursion with helper function 

Recurrent helper function is useful when we want to solve problem in recursive way, but we don't want to change client
API by changing method signature of the original method eg. we don't want to add new parameters (additional data required
for recursive call) or change return type (eg. change `List<Int>` to `MutableList<Int>`).

- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/README.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/README.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/README.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/README.md)

## Double pointer 

Problem solved by using double variable pointing to various indexes of the list. We use double pointer instead of nested
loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/README.md)
- [Pair average](../src/test/kotlin/com/igorwojda/list/pairaverage/README.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/README.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/README.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/README.md)
- [Circular check](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/README.md)
- [Medan Of Sorted Lists](../src/test/kotlin/com/igorwojda/list/medianoftwosorted/README.md)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Count unique values](../src/test/kotlin/com/igorwojda/list/countuniquevalues/README.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/README.md)
- [Square equals](../src/test/kotlin/com/igorwojda/list/squareequal/README.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/README.md)
- [Max occurring char](../src/test/kotlin/com/igorwojda/string/maxchar/README.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/README.md)
- [Subtract](../src/test/kotlin/com/igorwojda/list/subtract/README.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/README.md)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Max sub list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/README.md)
- [Min sub list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/README.md)

## List

### Search algorithms

- [Linear search](../src/test/kotlin/com/igorwojda/list/search/linearsearch/README.md)
- [Binary search](../src/test/kotlin/com/igorwojda/list/search/binarysearch/README.md)

### Sort algorithms

- [Bubble sort](../src/test/kotlin/com/igorwojda/list/sort/bubblesort/README.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/README.md)
- [Selection sort](../src/test/kotlin/com/igorwojda/list/sort/selectionsort/README.md)
- [Insertion sort](../src/test/kotlin/com/igorwojda/list/sort/insertionsort/README.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/README.md)
- [Radix sort](../src/test/kotlin/com/igorwojda/list/sort/radixsort/README.md)

### Other list challenges

- [Capitalize First](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/README.md)
- [Flatten](../src/test/kotlin/com/igorwojda/list/flatten/README.md)
- [Chunk](../src/test/kotlin/com/igorwojda/list/chunk/README.md)
- [Max sub-list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/README.md)
- [Min sub-list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/README.md)
- [Find the pair with average](../src/test/kotlin/com/igorwojda/list/pairaverage/README.md)
- [Product](../src/test/kotlin/com/igorwojda/list/product/README.md)
- [Square compare](../src/test/kotlin/com/igorwojda/list/squareequal/README.md)
- [List subtract](../src/test/kotlin/com/igorwojda/list/subtract/README.md)
- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/README.md)
- [Coins](src/test/kotlin/com/igorwojda/list/coins/README.md)

## Singly Linked List

- [Singly linked list](../src/test/kotlin/com/igorwojda/linkedlist/singly/base/README.md)
- [Circular linked list?](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/README.md)
- [Take n-th element from last](../src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast/README.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/README.md)
- [Add Numbers](../src/test/kotlin/com/igorwojda/linkedlist/singly/addnumbers)

## Doubly Linked List

- [Doubly linked list](../src/test/kotlin/com/igorwojda/linkedlist/doubly/base/README.md)

## Binary tree

- [Binary Search Tree (insert)](../src/test/kotlin/com/igorwojda/tree/binarytree/insert/README.md)
- [Binary Tree (validate)](../src/test/kotlin/com/igorwojda/tree/binarytree/validate/README.md)

## Integer

- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/README.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/README.md)
- [Count up and down](../src/test/kotlin/com/igorwojda/integer/countupanddown/README.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/README.md)
- [Factorial](../src/test/kotlin/com/igorwojda/integer/factorial/README.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/README.md)
- [FizzBuzz](../src/test/kotlin/com/igorwojda/integer/fizzbuzz/README.md)
- [Recursive cache fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/README.md)
- [Generate all pairs](../src/test/kotlin/com/igorwojda/integer/generateallpairs/README.md)
- [Get odd numbers](../src/test/kotlin/com/igorwojda/integer/getodd/README.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/README.md)
- [Print numbers](../src/test/kotlin/com/igorwojda/integer/printnumber/basic/README.md)
- [Print numbers with steps](../src/test/kotlin/com/igorwojda/integer/printnumber/steps/README.md)
- [Pyramid generator](../src/test/kotlin/com/igorwojda/integer/pyramidgenerator/README.md)
- [Reverse Int](../src/test/kotlin/com/igorwojda/integer/reverse/README.md)
- [Steps generator](../src/test/kotlin/com/igorwojda/integer/stepsgenerator/README.md)

## String

- [Caesar Cipher](../src/test/kotlin/com/igorwojda/string/caesarcipher/README.md)
- [Capitalize sentence](../src/test/kotlin/com/igorwojda/string/capitalizesentence/README.md)
- [Decapitalize const](../src/test/kotlin/com/igorwojda/string/decapitalizeconst/README.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/README.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/README.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/README.md)
- [Is palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/basic/README.md)
- [Is tolerant palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant/README.md)
- [Is permutation palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/permutation/README.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/README.md)
- [Longest word](../src/test/kotlin/com/igorwojda/string/longestword/README.md)
- [Max occurrent char](../src/test/kotlin/com/igorwojda/string/maxchar/README.md)
- [Reverse string](../src/test/kotlin/com/igorwojda/string/reverse/README.md)
- [Surrounded letter](../src/test/kotlin/com/igorwojda/string/surroundedletter/README.md)
- [Find the vowels](../src/test/kotlin/com/igorwojda/string/vowels/README.md)
- [Format train route](../src/test/kotlin/com/igorwojda/list/formattrainroute/README.md)

## Matrix

- [Spiral matrix generator](../src/test/kotlin/com/igorwojda/matrix/spiralmatrixgenerator/README.md)
- [Find rectangle](../src/test/kotlin/com/igorwojda/matrix/findrectangle/README.md)

## Range

- [Contains range?](../src/test/kotlin/com/igorwojda/range/containsrange/README.md)

## Queue

- [Queue](../src/test/kotlin/com/igorwojda/queue/basic/README.md)
- [Combine two queues](../src/test/kotlin/com/igorwojda/queue/combine/README.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/README.md)

## Stack

- [Stack](../src/test/kotlin/com/igorwojda/stack/basic/README.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/README.md)

## Heap

- [Max binary heap](../src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap/README.md)

## Tree

- [Binary search tree](../src/test/kotlin/com/igorwojda/tree/binarysearchtree/README.md)
- [Tree level width](../src/test/kotlin/com/igorwojda/tree/classic/levelwidth/README.md)
- [Tree](../src/test/kotlin/com/igorwojda/tree/classic/traversal/README.md)
