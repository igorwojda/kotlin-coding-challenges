# Kotlin coding puzzles

This repository contains a set of [programming puzzles](#lets-solve-some-puzzles) that are solved using the
[Kotlin](https://kotlinlang.org/) language (hints, solutions tests and [useful links](#useful-links) are here as well).
The purpose of this repository is to help you to practice coding and develop strong problem-solving skills. This will help
you to become a better programmer and improve your chance of getting a new job by passing
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

## Puzzle structure

Each puzzle is located in separate package and it contains 3 main files ([screen](./misc/image/SampleTask.png)):
- `desc.md` - the task description.
- `Puzzle.kt` - an empty method/class where puzzle should be solved. This file also contains helper methods and a set of
  [JUnit](https://junit.org/junit4/) tests which verify that task was solved correctly.
- `Solution.kt` - a file containing one or more solutions.

Keep in mind that each puzzle will usually have more than one solution. Even simple puzzles like
[String reversal](src/test/kotlin/com/igorwojda/string/reverse/Reverse.md) can be solved in
[10 different ways](https://eddmann.com/posts/ten-ways-to-reverse-a-string-in-javascript/). Usually, we compare various
solutions using
([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)) to
determine space/time complexity and we look at code readability.

## How do I start?

1. Install [IntelliJ IDEA](https://www.jetbrains.com/idea/)
2. Import project by using IntelliJ IDEA menu: `File | New | Project From Version Control | Git`
3. Choose a puzzle and code the [solution](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Solving-coding-chalenges)
4. [Run the tests](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Running-tests) to verify your solution

# Let's solve some puzzles

Puzzles below are segregated by different difficulties. The repository also contains puzzles grouped by
[problem type](misc/PuzzleGroups.md) and [problem add order](misc/PuzzleOrder.md).

Some puzzles may contain a reference to other puzzles that should be solved before to have a better understanding of the
problem. To succeed you need to practice often, repeat the same puzzles multiple times and be persistent over time. Take
your time before you take a look at the presented solution. **Good luck!**

**New in Town**

- [Capitalize sentence](src/test/kotlin/com/igorwojda/string/capitalizesentence/CapitalizeSentence.md)
- [Get odd numbers](src/test/kotlin/com/igorwojda/integer/getodd/GetOdd.md)
- [Range contains range?](src/test/kotlin/com/igorwojda/range/containsrange/ContainsRange.md)
- [Add up to](src/test/kotlin/com/igorwojda/integer/addupto/AddUpTo.md)
- [Linear search](src/test/kotlin/com/igorwojda/list/search/linearsearch/LinearSearch.md)
- [Count down](src/test/kotlin/com/igorwojda/integer/countdown/CountDown.md)
- [Count up and down](src/test/kotlin/com/igorwojda/integer/countupanddown/CountUpAndDown.md)
- [Format train route](src/test/kotlin/com/igorwojda/list/formattrainroute/FormatTrainRoute.md)
- [Generate all pairs](src/test/kotlin/com/igorwojda/integer/generateallpairs/GenerateAllPairs.md)
- [Count unique values](src/test/kotlin/com/igorwojda/list/countuniquevalues/CountUniqueValues.md)
- [Print number](src/test/kotlin/com/igorwojda/integer/printnumber/basic/PrintNumber.md)
- [Print number with steps](src/test/kotlin/com/igorwojda/integer/printnumber/steps/PrintNumberWithSteps.md)
- [Power](src/test/kotlin/com/igorwojda/integer/power/Power.md)
- [Factorial](src/test/kotlin/com/igorwojda/integer/factorial/Factorial.md)
- [Product](src/test/kotlin/com/igorwojda/list/product/Product.md)
- [Capitalize first](src/test/kotlin/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.md)
- [Decapitalize const](src/test/kotlin/com/igorwojda/string/decapitalizeconst/DecapitalizeConst.md)
- [Longest word](src/test/kotlin/com/igorwojda/string/longestword/LongestWord.md)

**Apprentice**

- [Is palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/basic/IsPalindrome.md)
- [Is tolerant palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant/IsTolerantPalindrome.md)
- [Is permutation palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/permutation/IsPermutationPalindrome.md)
- [Is anagram](src/test/kotlin/com/igorwojda/string/isanagram/IsAnagram.md)
- [Max occurring char](src/test/kotlin/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
- [String reverse](src/test/kotlin/com/igorwojda/string/reverse/Reverse.md)
- [Find the vowels](src/test/kotlin/com/igorwojda/string/vowels/Vowels.md)
- [Int reverse](src/test/kotlin/com/igorwojda/integer/reverse/Reverse.md)
- [Pyramid generator](src/test/kotlin/com/igorwojda/integer/pyramidgenerator/PyramidGenerator.md)
- [Steps generator](src/test/kotlin/com/igorwojda/integer/stepsgenerator/StepsGenerator.md)
- [Fizz Buzz](src/test/kotlin/com/igorwojda/integer/fizzbuzz/FizzBuzz.md)
- [Caesar Cipher](src/test/kotlin/com/igorwojda/string/caesarcipher/CaesarCipher.md)
- [Has repeated char](src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/HasRepeatedChar.md)

**Warrior** 

- [Spiral matrix generator](src/test/kotlin/com/igorwojda/integer/spiralmatrixgenerator/SpiralMatrixGenerator.md)
- [Queue](src/test/kotlin/com/igorwojda/queue/basic/Queue.md)
- [Combine queues](src/test/kotlin/com/igorwojda/queue/combine/Combine.md)
- [Stack](src/test/kotlin/com/igorwojda/stack/basic/Stack.md)
- [Bubble sort](src/test/kotlin/com/igorwojda/list/sort/bubblesort/BubbleSort.md)
- [Selection sort](src/test/kotlin/com/igorwojda/list/sort/selectionsort/SelectionSort.md)
- [Square equals](src/test/kotlin/com/igorwojda/list/squareequal/SquareEquals.md)
- [Sum zero](src/test/kotlin/com/igorwojda/list/sumzero/SumZero.md)
- [Digit frequency](src/test/kotlin/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Get duplicated arguments](src/test/kotlin/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Find pair with target average](src/test/kotlin/com/igorwojda/list/pairaverage/PairAverage.md)
- [Binary search tree](src/test/kotlin/com/igorwojda/tree/binarysearchtree/BinarySearchTree.md)
- [Tree traversal](src/test/kotlin/com/igorwojda/tree/classic/traversal/TreeTraversal.md)
- [Tree level width](src/test/kotlin/com/igorwojda/tree/classic/levelwidth/LevelWidth.md)
- [Binary search tree (insert)](src/test/kotlin/com/igorwojda/binarytree/insert/Insert.md)
- [Binary search tree (validate)](src/test/kotlin/com/igorwojda/binarytree/validate/Validate.md)
- [Any callback](src/test/kotlin/com/igorwojda/various/anycallback/AnyCallback.md)
- [Flatten](src/test/kotlin/com/igorwojda/list/flatten/Flatten.md)
- [Binary search](src/test/kotlin/com/igorwojda/list/search/binarysearch/BinarySearch.md)
- [Surrounded letter](src/test/kotlin/com/igorwojda/string/surroundedletter/SurroundedLetter.md)
- [Insertion sort](src/test/kotlin/com/igorwojda/list/sort/insertionsort/InsertionSort.md)
- [Quick sort](src/test/kotlin/com/igorwojda/list/sort/quicksort/QuickSort.md)
- [Radix sort](src/test/kotlin/com/igorwojda/list/sort/radixsort/RadixSort.md)
- [Doubly linked list](src/test/kotlin/com/igorwojda/linkedlist/doubly/base/DoublyLinkedList.md)
- [Max binary heap](src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap/MaxBinaryHeap.md)

**Commander**

- [List chunk](src/test/kotlin/com/igorwojda/list/listchunk/ListChunk.md)
- [Singly linked list](src/test/kotlin/com/igorwojda/linkedlist/singly/base/SinglyLinkedList.md)
- [Linked list midpoint](src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/Midpoint.md)
- [Circular check](src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/CircularCheck.md)
- [Linked list take n-th element from last](src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast/FromLast.md)
- [Is sub string](src/test/kotlin/com/igorwojda/string/issubstring/IsSubstring.md)
- [Merge sort](src/test/kotlin/com/igorwojda/list/sort/mergesort/MergeSort.md)
- [Fibonacci](src/test/kotlin/com/igorwojda/integer/fibonacci/basic/Fibonacci.md)
- [Fibonacci with recursive cache](src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Max sub list sum](src/test/kotlin/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub list length](src/test/kotlin/com/igorwojda/list/minsublistlength/MinSubListLength.md)
- [Subtract](src/test/kotlin/com/igorwojda/list/subtract/Subtract.md)

# Useful links

## More coding challenges

- [GeeksForGeeks](https://practice.geeksforgeeks.org) - large and nicely segregated set of problems.
- [HackerRank](https://www.hackerrank.com/dashboard) - large set of problems and additional interview problems for
  business.
- [Project Euler](https://projecteuler.net/archives) - more complex challenges, usually related to mathematics. The site
  already contains 600+ problems and a new code challenge is available very week or two. You will probably have to
  discuss the problem with the community because solutions are not on the website.
- [Advent of code](https://adventofcode.com/2018/events) - one month of various programing problems released daily at
  the end of the year. Fortunately archive of past events is still there.
- [Code Google Com Codejam](https://code.google.com/codejam/past-contests) - Google Code Jam, calls on programmers
  around the world to solve challenging, algorithmic puzzles against the clock. They publish all the past problems on
  their website.
- [CoderByte](https://coderbyte.com/challenges) - 200+ challenges, data structures / algorithms / company interview
  problems segregated by difficulty. Unfortunately most of them are only available for premium users. Premium gives you
  access to premium step-by-step solutions and user solutions.
- [CodeChef](https://www.codechef.com/problems/school) - contains set of programming problems segregated by difficulty.
- [LeetCode](https://leetcode.com/problemset/all) - data structures / algorithms / company interview problems segregated
  by difficulty.
- [Code Forces](http://codeforces.com/problemset) - list of programming puzzles is smaller than other websites, but you
  will still have plenty of problems to solve.
- [Spoj](https://www.spoj.com/problems/classical) - list of programming puzzles is smaller than other websites, but you
  will still have plenty of problems to solve.

## Video courses

- [JavaScript Algorithms and Data Structures Masterclass](https://www.udemy.com/js-algorithms-and-data-structures-masterclass)
- [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure)
- [Master the Coding Interview Data Structures + Algorithms](https://www.udemy.com/master-the-coding-interview-data-structures-algorithms)
- [Learning Algorithms in JavaScript from Scratch](https://www.udemy.com/learning-algorithms-in-javascript-from-scratch/)
- [Data Structures and Algorithms Deep Dive Using Java](https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java)

## Books

- [Cracking the Coding Interview, 6th Edition](https://www.amazon.co.uk/Cracking-Coding-Interview-6th-Programming/dp/0984782850)
- [Algorithms, 4th Edition](https://www.amazon.co.uk/Algorithms-Robert-Sedgewick/dp/032157351X)
- [Introduction to Algorithms, 3rd Edition (The MIT Press)](https://www.amazon.com/Introduction-Algorithms-3rd-MIT-Press/dp/0262033844)
- [More books...](https://www.quora.com/What-are-the-best-books-on-algorithms-and-data-structures)

## Websites

- [Hiring without whiteboards](https://github.com/poteto/hiring-without-whiteboards) - listing of companies (or teams)
  that don't do "whiteboard" interviews.
- [VisuAlgo](https://visualgo.net/en) - visualizes data structures and algorithms through animations algorithms.
- [Data structures explained](https://medium.com/basecs/tagged/data-structures) - description of various data
  structures.
- [Sorting algorithms animations](https://www.toptal.com/developers/sorting-algorithms) - visually compares most popular
  sorting algorithms using animations.
- [Big-O Reference](http://bigoref.com/) - summarizes the complexities in terms of space and time (Big-O) of the most
  important algorithms and operations in common data structures.
- [Big-O poster](https://github.com/ro31337/bigoposter/blob/master/bigoposter.pdf) - time/space complexity poster to
  print ant put on the wall.
- [Big-O Cheat Sheet](http://bigocheatsheet.com/) - covers the space and time Big-O complexities of common algorithms.

## Coding interview repositories
- [Coding Interview University](https://github.com/jwasham/coding-interview-university)
- [Awesome Interview Questions](https://github.com/MaximAbramchuck/awesome-interview-questions)
- [Google Interview University](https://github.com/P1xt/google-interview-university)
- [Interviews](https://github.com/kdn251/interviews)

# Contribute

Feedback and new contributions are welcome whether it's through bug reports or new PRs. To add new coding puzzle just
follow this [guide](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Adding-a-new-puzzle) and open PR.

## Contributors

- [Alan Evans](https://github.com/alanevansbc)
- [Norbert Kiesel](https://github.com/nkiesel)
- [David Mozano](https://github.com/mozano)
- [Yannis Barbakadze](https://github.com/yannisbarbakadze)

# Author

[![Follow me](https://github.com/igorwojda/kotlin-coding-puzzle/raw/main/misc/image/avatar.png)](https://twitter.com/igorwojda)

[![Follow me](https://img.shields.io/twitter/follow/igorwojda?style=social)](https://twitter.com/igorwojda)

# License
```
MIT License

Copyright (c) 2019 Igor Wojda

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
