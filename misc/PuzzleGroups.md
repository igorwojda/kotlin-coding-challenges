# Problems groups

This section contains **subset** of puzzles that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.). One puzzle may fit int outfile groups.

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/CountDown.md)
- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/GetOdd.md)
- [Any callback](../src/test/kotlin/com/igorwojda/various/anycallback/AnyCallback.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/Power.md)
- [Binary search tree (validate)](../src/test/kotlin/com/igorwojda/binarytree/validate/Validate.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/Fibonacci.md)
- [Fibonacci with recursive cache](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/AddUpTo.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/Power.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/IsSubstring.md)
- [Capitalize first](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/MergeSort.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/QuickSort.md)
  
### Recursion with helper function 

Recurrent helper function is useful when we want to solve problem in recursive way, but we don't want to change client
API by changing method signature of the original method eg. we don't want to add new parameters (additional data required
for recursive call) or change return type (eg. change `List<Int>` to `MutableList<Int>`).

- [Get odd](../src/test/kotlin/com/igorwojda/integer/getodd/GetOdd.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/CountDown.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/IsSubstring.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/TreeTraversal.md)

## Double pointer 

Problem solved by using double variable pointing to various indexes of the list. We use double pointer instead of nested
loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/SumZero.md)
- [Pair average](../src/test/kotlin/com/igorwojda/list/pairaverage/PairAverage.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/IsSubstring.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/Midpoint.md)
- [Circular check](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/CircularCheck.md)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Count unique values](../src/test/kotlin/com/igorwojda/list/countuniquevalues/CountUniqueValues.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/IsAnagram.md)
- [Square equals](../src/test/kotlin/com/igorwojda/list/squareequal/SquareEquals.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Max occurring char](../src/test/kotlin/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Subtract](../src/test/kotlin/com/igorwojda/list/subtract/Subtract.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/HasRepeatedChar.md)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Max sub list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/MinSubListLength.md)

## List

### Search algorithms

- [Linear search](../src/test/kotlin/com/igorwojda/list/search/linearsearch/LinearSearch.md)
- [Binary search](../src/test/kotlin/com/igorwojda/list/search/binarysearch/BinarySearch.md)

### Sort algorithms

- [Bubble sort](../src/test/kotlin/com/igorwojda/list/sort/bubblesort/BubbleSort.md)
- [Merge sort](../src/test/kotlin/com/igorwojda/list/sort/mergesort/MergeSort.md)
- [Selection sort](../src/test/kotlin/com/igorwojda/list/sort/selectionsort/SelectionSort.md)
- [Insertion sort](../src/test/kotlin/com/igorwojda/list/sort/insertionsort/InsertionSort.md)
- [Quick sort](../src/test/kotlin/com/igorwojda/list/sort/quicksort/QuickSort.md)
- [Radix sort](../src/test/kotlin/com/igorwojda/list/sort/radixsort/RadixSort.md)

### Other list puzzles

- [Capitalize First](../src/test/kotlin/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.md)
- [Flatten](../src/test/kotlin/com/igorwojda/list/flatten/Flatten.md)
- [List chunking](../src/test/kotlin/com/igorwojda/list/listchunk/ListChunk.md)
- [Max sub-list sum](../src/test/kotlin/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub-list length](../src/test/kotlin/com/igorwojda/list/minsublistlength/MinSubListLength.md)
- [Find the pair with average](../src/test/kotlin/com/igorwojda/list/pairaverage/PairAverage.md)
- [Product](../src/test/kotlin/com/igorwojda/list/product/Product.md)
- [Square compare](../src/test/kotlin/com/igorwojda/list/squareequal/SquareEquals.md)
- [List subtract](../src/test/kotlin/com/igorwojda/list/subtract/Subtract.md)
- [Sum zero](../src/test/kotlin/com/igorwojda/list/sumzero/SumZero.md)

## Singly Linked List

- [Singly linked list](../src/test/kotlin/com/igorwojda/linkedlist/singly/base/SinglyLinkedList.md)
- [Circular linked list?](../src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/CircularCheck.md)
- [Take n-th element from last](../src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast/FromLast.md)
- [Midpoint](../src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/Midpoint.md)

## Doubly Linked List

- [Doubly linked list](../src/test/kotlin/com/igorwojda/linkedlist/doubly/base/DoublyLinkedList.md)

## Binary tree

- [Binary Search Tree (insert)](../src/test/kotlin/com/igorwojda/binarytree/insert/Insert.md)
- [Binary Tree (validate)](../src/test/kotlin/com/igorwojda/binarytree/validate/Validate.md)

## Integer

- [Add up to](../src/test/kotlin/com/igorwojda/integer/addupto/AddUpTo.md)
- [Count down](../src/test/kotlin/com/igorwojda/integer/countdown/CountDown.md)
- [Count up and down](../src/test/kotlin/com/igorwojda/integer/countupanddown/CountUpAndDown.md)
- [Digit frequency](../src/test/kotlin/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Factorial](../src/test/kotlin/com/igorwojda/integer/factorial/Factorial.md)
- [Fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/basic/Fibonacci.md)
- [FizzBuzz](../src/test/kotlin/com/igorwojda/integer/fizzbuzz/FizzBuzz.md)
- [Recursive cache fibonacci](../src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Generate all pairs](../src/test/kotlin/com/igorwojda/integer/generateallpairs/GenerateAllPairs.md)
- [Get odd numbers](../src/test/kotlin/com/igorwojda/integer/getodd/GetOdd.md)
- [Power](../src/test/kotlin/com/igorwojda/integer/power/Power.md)
- [Print numbers](../src/test/kotlin/com/igorwojda/integer/printnumber/basic/PrintNumber.md)
- [Print numbers with steps](../src/test/kotlin/com/igorwojda/integer/printnumber/steps/PrintNumberWithSteps.md)
- [Pyramid generator](../src/test/kotlin/com/igorwojda/integer/pyramidgenerator/PyramidGenerator.md)
- [Reverse Int](../src/test/kotlin/com/igorwojda/integer/reverse/Reverse.md)
- [Spiral matrix generator](../src/test/kotlin/com/igorwojda/integer/spiralmatrixgenerator/SpiralMatrixGenerator.md)
- [Steps generator](../src/test/kotlin/com/igorwojda/integer/stepsgenerator/StepsGenerator.md)

## String

- [Caesar Cipher](../src/test/kotlin/com/igorwojda/string/caesarcipher/CaesarCipher.md)
- [Capitalize sentence](../src/test/kotlin/com/igorwojda/string/capitalizesentence/CapitalizeSentence.md)
- [Decapitalize const](../src/test/kotlin/com/igorwojda/string/decapitalizeconst/DecapitalizeConst.md)
- [Get duplicated arguments](../src/test/kotlin/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Has repeated char](../src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/HasRepeatedChar.md)
- [Is anagram](../src/test/kotlin/com/igorwojda/string/isanagram/IsAnagram.md)
- [Is palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/basic/IsPalindrome.md)
- [Is tolerant palindrome](../src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant/IsTolerantPalindrome.md)
- [Is permutation palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/permutation/IsPermutationPalindrome.md)
- [Is substring](../src/test/kotlin/com/igorwojda/string/issubstring/IsSubstring.md)
- [Longest word](../src/test/kotlin/com/igorwojda/string/longestword/LongestWord.md)
- [Max occurrent char](../src/test/kotlin/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
- [Reverse string](../src/test/kotlin/com/igorwojda/string/reverse/Reverse.md)
- [Surrounded letter](../src/test/kotlin/com/igorwojda/string/surroundedletter/SurroundedLetter.md)
- [Find the vowels](../src/test/kotlin/com/igorwojda/string/vowels/Vowels.md)
- [Format train route](../src/test/kotlin/com/igorwojda/list/formattrainroute/FormatTrainRoute.md)

## Range

- [Contains range?](../src/test/kotlin/com/igorwojda/range/containsrange/ContainsRange.md)

## Queue

- [Queue](../src/test/kotlin/com/igorwojda/queue/basic/Queue.md)
- [Combine two queues](../src/test/kotlin/com/igorwojda/queue/combine/Combine.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/TreeTraversal.md)

## Stack

- [Stack](../src/test/kotlin/com/igorwojda/stack/basic/Stack.md)
- [Tree traversal](../src/test/kotlin/com/igorwojda/tree/classic/traversal/TreeTraversal.md)

## Heap

- [Max binary heap](../src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap/MaxBinaryHeap.md)

## Tree

- [Binary search tree](../src/test/kotlin/com/igorwojda/tree/binarysearchtree/BinarySearchTree.md)
- [Tree level width](../src/test/kotlin/com/igorwojda/tree/classic/levelwidth/LevelWidth.md)
- [Tree](../src/test/kotlin/com/igorwojda/tree/classic/traversal/TreeTraversal.md)
