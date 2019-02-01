# Problems groups

This section contains **subset** of puzzles that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.).

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../app/src/test/java/com/igorwojda/integer/countdown/CountDown.md)
- [Get odd](../app/src/test/java/com/igorwojda/integer/getodd/GetOdd.md)
- [Any callback](../app/src/test/java/com/igorwojda/various/anycallback/AnyCallback.md)
- [Power](../app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Binary search tree (validate)](../app/src/test/java/com/igorwojda/binarytree/validate/Validate.md)
- [Fibonacci](../app/src/test/java/com/igorwojda/integer/fibonacci/basic/Fibonacci.md) 
- [Fibonacci with recursive cache](../app/src/test/java/com/igorwojda/integer/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Add up to](../app/src/test/java/com/igorwojda/integer/addupto/AddUpTo.md)
- [Power](../app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Is substring](../app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [Capitalize first](../app/src/test/java/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.md)
  
### Recursion with helper function 

Recurrent helper function is useful when we want to solve problem in recursive way, but we don't want to change client
API by changing method signature of the original method eg. we don't want to add new parameters (additional data required
for recursive call) or change return type (eg. change `List<Int>` to `MutableList<Int>`).

- [Get odd](../app/src/test/java/com/igorwojda/integer/getodd/GetOdd.md)
- [Count down](../app/src/test/java/com/igorwojda/integer/countdown/CountDown.md) 
- [Is substring](../app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)

## Double pointer 

Problem solved by using double variable pointing to various indexes of the list. We use double pointer instead of nested
loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Sum zero](../app/src/test/java/com/igorwojda/list/sumzero/SumZero.md)
- [Pair average](../app/src/test/java/com/igorwojda/list/pairaverage/PairAverage.md)
- [Is substring](../app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [Get duplicated arguments](../app/src/test/java/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Midpoint](../app/src/test/java/com/igorwojda/linkedlist/midpoint/Midpoint.md)
- [Circular check](../app/src/test/java/com/igorwojda/linkedlist/circularcheck/CircularCheck.md)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Is anagram](../app/src/test/java/com/igorwojda/string/isanagram/IsAnagram.md)
- [Square equals](../app/src/test/java/com/igorwojda/list/squareequal/SquareEquals.md)
- [Digit frequency](../app/src/test/java/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Max occurring char](../app/src/test/java/com/igorwojda/string/maxchar/MaxOccurrentChar.md) 
- [Get duplicated arguments](../app/src/test/java/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Subtract](../app/src/test/java/com/igorwojda/list/subtract/Subtract.md)
- [Has repeated char](../app/src/test/java/com/igorwojda/string/hasrepeatedcharacter/HasRepeatedChar.md)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [Max sub list sum](../app/src/test/java/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub list length](../app/src/test/java/com/igorwojda/list/minsublistlength/MinSubListLength.md)

## List

### Search algorithms

- [Linear search](../app/src/test/java/com/igorwojda/list/search/linearsearch/LinearSearch.md)
- [Binary search](../app/src/test/java/com/igorwojda/list/search/binarysearch/BinarySearch.md)

### Sort algorithms

- [Bubble sort](../app/src/test/java/com/igorwojda/list/sort/bubblesort/BubbleSort.md)
- [Merge sort](../app/src/test/java/com/igorwojda/list/sort/mergesort/MergeSort.md)
- [Selection sort](../app/src/test/java/com/igorwojda/list/sort/selectionsort/SelectionSort.md)
- [Insertion sort](../app/src/test/java/com/igorwojda/list/sort/insertionsort/InsertionSort.md)
- [Quick sort](../app/src/test/java/com/igorwojda/list/sort/quicksort/QuickSort.md)

### Other list puzzles
- [Capitalize First](../app/src/test/java/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.md)
- [List count unique values](../app/src/test/java/com/igorwojda/list/countuniquevalues/CountUniqueValues.md)
- [Flatten](../app/src/test/java/com/igorwojda/list/flatten/Flatten.md)
- [List chunking](../app/src/test/java/com/igorwojda/list/listchunk/ListChunk.md)
- [Max sub-list sum](../app/src/test/java/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub-list length](../app/src/test/java/com/igorwojda/list/minsublistlength/MinSubListLength.md)
- [Find the pair with average](../app/src/test/java/com/igorwojda/list/pairaverage/PairAverage.md)
- [Product](../app/src/test/java/com/igorwojda/list/product/Product.md)
- [Square compare](../app/src/test/java/com/igorwojda/list/squareequal/SquareEquals.md)
- [List subtract](../app/src/test/java/com/igorwojda/list/subtract/Subtract.md)
- [Sum zero](../app/src/test/java/com/igorwojda/list/sumzero/SumZero.md) 

## Linked List
- [Linked list](../app/src/test/java/com/igorwojda/linkedlist/base/LinkedList.md)
- [Circular linked list?](../app/src/test/java/com/igorwojda/linkedlist/circularcheck/CircularCheck.md)
- [Take n-th element from last](../app/src/test/java/com/igorwojda/linkedlist/fromlast/FromLast.md)
- [Linked list midpoint](../app/src/test/java/com/igorwojda/linkedlist/midpoint/Midpoint.md)

## Binary tree
- [Binary Search Tree (insert)](../app/src/test/java/com/igorwojda/binarytree/insert/Insert.md)
- [Binary Tree (validate)](../app/src/test/java/com/igorwojda/binarytree/validate/Validate.md)

## Integer
- [Add up to](../app/src/test/java/com/igorwojda/integer/addupto/AddUpTo.md)
- [Count down](../app/src/test/java/com/igorwojda/integer/countdown/CountDown.md)
- [Count up and down](../app/src/test/java/com/igorwojda/integer/countupanddown/CountUpAndDown.md)
- [Digit frequency](../app/src/test/java/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Factorial](../app/src/test/java/com/igorwojda/integer/factorial/Factorial.md)
- [Fibonacci](../app/src/test/java/com/igorwojda/integer/fibonacci/basic/Fibonacci.md)
- [FizzBuzz](../app/src/test/java/com/igorwojda/integer/fizzbuzz/FizzBuzz.md)
- [Recursive cache fibonacci](../app/src/test/java/com/igorwojda/integer/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Generate all pairs](../app/src/test/java/com/igorwojda/integer/generateallpairs/GenerateAllPairs.md)
- [Get odd numbers](../app/src/test/java/com/igorwojda/integer/getodd/GetOdd.md)
- [Power](../app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Print numbers](../app/src/test/java/com/igorwojda/integer/printnumber/basic/PrintNumber.md)
- [Print numbers with steps](../app/src/test/java/com/igorwojda/integer/printnumber/steps/PrintNumberWithSteps.md)
- [Pyramid generator](../app/src/test/java/com/igorwojda/integer/pyramidgenerator/PyramidGenerator.md)
- [Reverse Int](../app/src/test/java/com/igorwojda/integer/reverse/Reverse.md)
- [Spiral matrix generator](../app/src/test/java/com/igorwojda/integer/spiralmatrixgenerator/SpiralMatrixGenerator.md)
- [Steps generator](../app/src/test/java/com/igorwojda/integer/stepsgenerator/StepsGenerator.md)

## String
- [Caesar Cipher](../app/src/test/java/com/igorwojda/string/caesarcipher/CaesarCipher.md)
- [Capitalize sentence](../app/src/test/java/com/igorwojda/string/capitalizesentence/CapitalizeSentence.md)
- [Decapitalize const](../app/src/test/java/com/igorwojda/string/decapitalizeconst/DecapitalizeConst.md)
- [Get duplicated arguments](../app/src/test/java/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Has repeated char](../app/src/test/java/com/igorwojda/string/hasrepeatedcharacter/HasRepeatedChar.md)
- [Is anagram](../app/src/test/java/com/igorwojda/string/isanagram/IsAnagram.md)
- [Is palindrome](../app/src/test/java/com/igorwojda/string/ispalindrome/basic/IsPalindrome.md)
- [IsTolerantPalindromeSolution.kt](../app/src/test/java/com/igorwojda/string/ispalindrome/tolerant/IsTolerantPalindromeSolution.kt)
- [Is substring](../app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [Longest word](../app/src/test/java/com/igorwojda/string/longestword/LongestWord.md)
- [Max occureent char](../app/src/test/java/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
- [Reverse string](../app/src/test/java/com/igorwojda/string/reverse/Reverse.md)
- [Surrounded letter](../app/src/test/java/com/igorwojda/string/surroundedletter/SurroundedLetter.md)
- [Find the vowels](../app/src/test/java/com/igorwojda/string/vowels/Vowels.md)

## Range
- [Contains range?](../app/src/test/java/com/igorwojda/range/containsrange/ContainsRange.md)

## Queue
- [Generic queue](../app/src/test/java/com/igorwojda/queue/generic/GenericQueue.md)
- [Int queue](../app/src/test/java/com/igorwojda/queue/int/IntQueue.md)
- [Two stack queue](../app/src/test/java/com/igorwojda/queue/twostack/TwoStackQueue.md)
- [Combine two queues](../app/src/test/java/com/igorwojda/queue/combine/Combine.md)

## Tree
- [Tree level width](../app/src/test/java/com/igorwojda/tree/levelwidth/LevelWidth.md)
- [Tree](../app/src/test/java/com/igorwojda/tree/traversal/TreeTraversal.md)
