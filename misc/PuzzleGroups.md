# Problems groups

This section contains **subset** of puzzles that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.). One puzzle may fit int outfile groups.

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/desc.md)
- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/desc.md)
- [Any callback](../src/test/kotlin/com/igorwojda/various/anycallback/desc.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/desc.md)
- [Binary search tree (validate)](../src/test/kotlin/com/igorwojda/binarytree/validate/desc.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/desc.md)
- [Fibonacci with recursive cache](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/desc.md)
- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/desc.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/desc.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/desc.md)
- [Capitalize first](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/desc.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/desc.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/desc.md)
  
### Recursion with helper function 

Recurrent helper function is useful when we want to solve problem in recursive way, but we don't want to change client
API by changing method signature of the original method eg. we don't want to add new parameters (additional data required
for recursive call) or change return type (eg. change `List<Int>` to `MutableList<Int>`).

- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/desc.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/desc.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/desc.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/desc.md)

## Double pointer 

Problem solved by using double variable pointing to various indexes of the list. We use double pointer instead of nested
loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/desc.md)
- [Pair average](../src/test/kotlin/com/igorwojda/list/pairaverage/desc.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/desc.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/desc.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/desc.md)
- [Circular check](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/desc.md)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Count unique values](../src/test/kotlin/com/igorwojda/list/countuniquevalues/desc.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/desc.md)
- [Square equals](../src/test/kotlin/com/igorwojda/list/squareequal/desc.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/desc.md)
- [Max occurring char](../src/test/kotlin/com/igorwojda/string/maxchar/desc.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/desc.md)
- [Subtract](../src/test/kotlin/com/igorwojda/list/subtract/desc.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/desc.md)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Max sub list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/desc.md)
- [Min sub list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/desc.md)

## List

### Search algorithms

- [Linear search](../src/test/kotlin/com/igorwojda/list/search/linearsearch/desc.md)
- [Binary search](../src/test/kotlin/com/igorwojda/list/search/binarysearch/desc.md)

### Sort algorithms

- [Bubble sort](../src/test/kotlin/com/igorwojda/list/sort/bubblesort/desc.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/desc.md)
- [Selection sort](../src/test/kotlin/com/igorwojda/list/sort/selectionsort/desc.md)
- [Insertion sort](../src/test/kotlin/com/igorwojda/list/sort/insertionsort/desc.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/desc.md)
- [Radix sort](../src/test/kotlin/com/igorwojda/list/sort/radixsort/desc.md)

### Other list puzzles

- [Capitalize First](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/desc.md)
- [Flatten](../src/test/kotlin/com/igorwojda/list/flatten/desc.md)
- [List chunking](../src/test/kotlin/com/igorwojda/list/listchunk/desc.md)
- [Max sub-list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/desc.md)
- [Min sub-list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/desc.md)
- [Find the pair with average](../src/test/kotlin/com/igorwojda/list/pairaverage/desc.md)
- [Product](../src/test/kotlin/com/igorwojda/list/product/desc.md)
- [Square compare](../src/test/kotlin/com/igorwojda/list/squareequal/desc.md)
- [List subtract](../src/test/kotlin/com/igorwojda/list/subtract/desc.md)
- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/desc.md)

## Singly Linked List

- [Singly linked list](../src/test/kotlin/com/igorwojda/linkedlist/singly/base/desc.md)
- [Circular linked list?](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/desc.md)
- [Take n-th element from last](../src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast/desc.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/desc.md)

## Doubly Linked List

- [Doubly linked list](../src/test/kotlin/com/igorwojda/linkedlist/doubly/base/desc.md)

## Binary tree

- [Binary Search Tree (insert)](../src/test/kotlin/com/igorwojda/binarytree/insert/desc.md)
- [Binary Tree (validate)](../src/test/kotlin/com/igorwojda/binarytree/validate/desc.md)

## Integer

- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/desc.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/desc.md)
- [Count up and down](../src/test/kotlin/com/igorwojda/integer/countupanddown/desc.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/desc.md)
- [Factorial](../src/test/kotlin/com/igorwojda/integer/factorial/desc.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/desc.md)
- [FizzBuzz](../src/test/kotlin/com/igorwojda/integer/fizzbuzz/desc.md)
- [Recursive cache fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/desc.md)
- [Generate all pairs](../src/test/kotlin/com/igorwojda/integer/generateallpairs/desc.md)
- [Get odd numbers](../src/test/kotlin/com/igorwojda/integer/getodd/desc.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/desc.md)
- [Print numbers](../src/test/kotlin/com/igorwojda/integer/printnumber/basic/desc.md)
- [Print numbers with steps](../src/test/kotlin/com/igorwojda/integer/printnumber/steps/desc.md)
- [Pyramid generator](../src/test/kotlin/com/igorwojda/integer/pyramidgenerator/desc.md)
- [Reverse Int](../src/test/kotlin/com/igorwojda/integer/reverse/desc.md)
- [Spiral matrix generator](../src/test/kotlin/com/igorwojda/integer/spiralmatrixgenerator/desc.md)
- [Steps generator](../src/test/kotlin/com/igorwojda/integer/stepsgenerator/desc.md)

## String

- [Caesar Cipher](../src/test/kotlin/com/igorwojda/string/caesarcipher/desc.md)
- [Capitalize sentence](../src/test/kotlin/com/igorwojda/string/capitalizesentence/desc.md)
- [Decapitalize const](../src/test/kotlin/com/igorwojda/string/decapitalizeconst/desc.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/desc.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/desc.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/desc.md)
- [Is palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/basic/desc.md)
- [Is tolerant palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant/desc.md)
- [Is permutation palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/permutation/desc.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/desc.md)
- [Longest word](../src/test/kotlin/com/igorwojda/string/longestword/desc.md)
- [Max occurrent char](../src/test/kotlin/com/igorwojda/string/maxchar/desc.md)
- [Reverse string](../src/test/kotlin/com/igorwojda/string/reverse/desc.md)
- [Surrounded letter](../src/test/kotlin/com/igorwojda/string/surroundedletter/desc.md)
- [Find the vowels](../src/test/kotlin/com/igorwojda/string/vowels/desc.md)
- [Format train route](../src/test/kotlin/com/igorwojda/list/formattrainroute/desc.md)

## Range

- [Contains range?](../src/test/kotlin/com/igorwojda/range/containsrange/desc.md)

## Queue

- [Queue](../src/test/kotlin/com/igorwojda/queue/basic/desc.md)
- [Combine two queues](../src/test/kotlin/com/igorwojda/queue/combine/desc.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/desc.md)

## Stack

- [Stack](../src/test/kotlin/com/igorwojda/stack/basic/desc.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/desc.md)

## Heap

- [Max binary heap](../src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap/desc.md)

## Tree

- [Binary search tree](../src/test/kotlin/com/igorwojda/tree/binarysearchtree/desc.md)
- [Tree level width](../src/test/kotlin/com/igorwojda/tree/classic/levelwidth/desc.md)
- [Tree](../src/test/kotlin/com/igorwojda/tree/classic/traversal/desc.md)
