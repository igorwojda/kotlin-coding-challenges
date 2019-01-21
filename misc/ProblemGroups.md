# Problems groups

This section contains **subset** of puzzles that are grouped by type of solution (recursive, double pointer etc.) or
type of problem (searching, sorting etc.).

## Recursion 

List of problems that can be solved using [recursion](https://en.wikipedia.org/wiki/Recursion_(computer_science)).

- [Count down](../app/src/test/java/com/igorwojda/integer/countdown/CountDown.md)
- [Get odd](../app/src/test/java/com/igorwojda/integer/getodd/GetOdd.md)
- [Any Callback](../app/src/test/java/com/igorwojda/various/anycallback/AnyCallback.kt)
- [Power](../app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Binary Search Tree (validate)](../app/src/test/java/com/igorwojda/binarytree/validate/Validate.md)
- [Fibonacci](../app/src/test/java/com/igorwojda/various/fibonacci/basic/Fibonacci.kt) 
- [Fibonacci with recursive cache](../app/src/test/java/com/igorwojda/various/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Add up to](../app/src/test/java/com/igorwojda/integer/addupto/AddUpTo.md)
- [Power](../app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Is substring](../app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [Capitalize first](../app/src/test/java/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.kt)
  
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

- [SumZero](../app/src/test/java/com/igorwojda/list/sumzero/SumZero.md)
- [PairAverage](../app/src/test/java/com/igorwojda/list/pairaverage/PairAverage.md)
- [IsSubstring](../app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [GetDuplicatedArguments](../app/src/test/java/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Midpoint](../app/src/test/java/com/igorwojda/linkedlist/midpoint/Midpoint.md)
- [CircularCheck](../app/src/test/java/com/igorwojda/linkedlist/circularcheck/CircularCheck.md)

## Frequency counter

Problems solved by counting occurrence of element. We use frequency counter instead of nested loops which decreases
complexity from `O(n^2)` to `O(n)`.

- [Is Anagram](../app/src/test/java/com/igorwojda/string/isanagram/IsAnagram.md)
- [Square equals](../app/src/test/java/com/igorwojda/list/squareequal/SquareEquals.md)
- [Digit frequency](../app/src/test/java/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Max occurring char](../app/src/test/java/com/igorwojda/string/maxchar/MaxOccurrentChar.md) 
- [Get duplicated arguments](../app/src/test/java/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)

## Sliding window 

We use sliding window instead of nested loops which decreases complexity from `O(n^2)` to `O(n)`.

- [MaxSubListSum](../app/src/test/java/com/igorwojda/list/maxsublistsum/MaxSubListSum.md) 
- [MinSubListLength](../app/src/test/java/com/igorwojda/list/minsublistlength/MinSubListLength.md)

## Search algorithms

- [Linear search](../app/src/test/java/com/igorwojda/list/linearsearch/LinearSearch.md)

## Sort algorithms

- [Bubble sort](../app/src/test/java/com/igorwojda/list/bubblesort/BubbleSort.md)
- [Merge sort](../app/src/test/java/com/igorwojda/list/mergesort/MergeSort.md)
- [Selection sort](../app/src/test/java/com/igorwojda/list/selectionsort/SelectionSort.md)


