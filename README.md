# Kotlin coding puzzles

This repository contains a set of [programming puzzles](#kotlin-programing-puzzles) that meant to be solved using
[Kotlin](https://kotlinlang.org/) language (no worries hints, solutions and tests that will verify your solution are here as well). Purpose
of this repository is to help you to practice deliberately and develop strong problem solving skills. This will make you better programmer
and will help you to get new job by passing [whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

## Solutions

Repository contains one or more solutions for any given puzzle, however keep in mind that each puzzle will usually have more than one
solution. Even simple puzzle like [String reversal](app/src/test/java/com/igorwojda/string/reverse/Reverse.md) can be solved in
[10 different ways](https://eddmann.com/posts/ten-ways-to-reverse-a-string-in-javascript/). Usually we are compare various solutions using
([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)) to determine space/time
complexity and latter we look at code readability.

# How do I start?

## Opening this project

This repository contains [Android Studio](https://developer.android.com/studio/) project. We can quickly open the project simply
by checking out this the project from git repository.

1. Install Android Studio (we need version 3.3+ because of a [bug](https://youtrack.jetbrains.com/issue/KT-28090) that reruns tests incorrectly)
2. Install git `brew install git` using cmd
3. Import project by using Android Studio menu: `File -> New -> Project From Version Control -> Git`
4. Enter Repository URL `https://github.com/igorwojda/kotlin-coding-puzzle.git`  and click `clone`
5. Navigate to [app/src/test/java/com/igorwojda](app/src/test/java/com/igorwojda/) folder in `Project` view or
   [app/java/com (test)/igorwojda](app/src/test/java/com/igorwojda/) in `Android` view in project panel.
6. Optionally install [Markdown Navigator](https://plugins.jetbrains.com/plugin/7896-markdown-navigator) plugin for Android studio to have
   ice preview of markdown files (files containing puzzles description)

## Puzzle structure

Each puzzle is located in separate package and it contains 3 files ([screen](./misc/image/SampleTask.png)):
* `Puzzle.md` - description of the puzzle
* `Puzzle.kt` - contains empty method/class where puzzle should be solved and set of tests to run
* `PuzzleSolution.kt` - file that contains one or more puzzle solutions (encapsulated in Kotlin `object` just to avoid conflicts with
  other coding puzzles)

## Running tests

Open `Puzzle.kt` file for a any puzzle. Locate class with `Test` suffix (`PuzzleTest`). Click on the green green arrow close to line number
to run one or more tests in the class ([screen](./misc/image/RunTest.png)). After running the test you can rerun last configuration using
`Run command` (`⌘ + R`).

Larger puzzles will have larger test base, so tests have to be uncommented one by one while solving various steps of the given puzzle.

## Solving puzzles

To be good at solving programming puzzles you will also need a proper problem solving strategy.

In 1945 Hungarian mathematician
[George Pólya](https://en.wikipedia.org/wiki/George_P%C3%B3lya), [described](https://en.wikipedia.org/wiki/How_to_Solve_It) famous method of
problem solving:

* First, we have to [understand](https://en.wikipedia.org/wiki/Understanding) the [problem](https://en.wikipedia.org/wiki/Problem)
* After understanding [make a plan](https://en.wikipedia.org/wiki/Plan)
* Carry out the plan. [Look back](https://en.wikipedia.org/wiki/Review)
* [Look back ](https://en.wikipedia.org/wiki/Review) on your work.
  [How could it be better?](https://en.wikipedia.org/wiki/Scientific_method)

We can translate this method into more concrete steps.

**Understand the problem**

1. Can I rephrase problem using your my own words?
2. What are the inputs?
3. What are the outputs?
4. How should I label the important pieces of data that are a part of the problem?
5. Explore concrete examples
   1. Start with simple examples and progress to more complex ones
   2. Explore empty inputs
   3. Explore invalid inputs

**Break it down**

1. Write exact, atomic steps we need to take (as comments in file)

**Solve it**

Solve the problem. If you can't just solve similar problem or try to solve current problem by temporally excluding
most difficult part.

**Refactor & Simplify**

1. Try to refactor te code
2. Improve performance (Big-O notation)
3. Check how other people solved this problem

## Kotlin programing puzzles

Puzzles are segregated by different difficulty. Some puzzle may contain a reference to puzzles that should be solved before to
have better understanding of the problem. To succeed you need to practice often, repeat same puzzles multiple times and
be persistent over time. Take your time before you take a look at the presented solution. Good luck!

**New in Town**
* [Sentence capitalization](app/src/test/java/com/igorwojda/string/calitalisesentence/CapitalizeSentence.md)
* [Range contains range?](app/src/test/java/com/igorwojda/range/containsrange/ContainsRange.md)
* [Add up to](app/src/test/java/com/igorwojda/int/addupto/AddUpTo.md)
* [Count up and down](app/src/test/java/com/igorwojda/various/countupanddown/CountUpAndDown.md)
* [Get all pairs](app/src/test/java/com/igorwojda/various/getallpairs/GetAllPairs.md)
* [List count unique values](app/src/test/java/com/igorwojda/list/countuniquevalues/CountUniqueValues.md)

**Apprentice**
* [Palindrome](app/src/test/java/com/igorwojda/string/palindrome/basic/Palindrome.md)
* [Tolerant palindrome](app/src/test/java/com/igorwojda/string/palindrome/tolerant/TolerantPalindrome.md)
* [Anagram](app/src/test/java/com/igorwojda/string/anagram/Anagram.md)
* [Max occurring char](app/src/test/java/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
* [String reversal](app/src/test/java/com/igorwojda/string/reverse/Reverse.md)
* [Find the vowels](app/src/test/java/com/igorwojda/string/vowels/Vowels.md)
* [Int reversal](app/src/test/java/com/igorwojda/int/reverse/Reverse.md)

**Warrior**
* [Int queue](app/src/test/java/com/igorwojda/queue/int/IntQueue.md)
* [Generic queue](app/src/test/java/com/igorwojda/queue/generic/GenericQueue.md)
* [Combine two queues](app/src/test/java/com/igorwojda/queue/weave/Weave.md)
* [Two stack queue](app/src/test/java/com/igorwojda/queue/twostack/TwoStackQueue.md)
* [Int stack](app/src/test/java/com/igorwojda/stack/int/IntStack.md)
* [Generic stack](app/src/test/java/com/igorwojda/stack/generic/GenericStack.md)
* [Bubble sort](app/src/test/java/com/igorwojda/list/bubblesort/BubbleSort.md)
* [Selection sort](app/src/test/java/com/igorwojda/list/selectionsort/SelectionSort.md)
* [Square equals](app/src/test/java/com/igorwojda/list/squareequal/SquareEquals.md)
* [Sum zero](app/src/test/java/com/igorwojda/list/sumzero/SumZero.md)
* [Max sub-list list sum](app/src/test/java/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
* [Digit frequency](app/src/test/java/com/igorwojda/int/digitfrequency/DigitFrequency.md)
* [Get duplicated arguments](app/src/test/java/com/igorwojda/string/getduplicatedparams/GetDuplicatedArguments.md)

**Commander**
* [List chunking](app/src/test/java/com/igorwojda/list/listchunk/ListChunk.md)
* [Linked list](app/src/test/java/com/igorwojda/linkedlist/base/LinkedList.md)
* [Linked list midpoint](app/src/test/java/com/igorwojda/linkedlist/midpoint/Midpoint.md)
* [Circular linked list?](app/src/test/java/com/igorwojda/linkedlist/circularcheck/CircularCheck.md)
* [Linked list take n-th element from last](app/src/test/java/com/igorwojda/linkedlist/fromlast/FromLast.md)
* [Tree traversal](app/src/test/java/com/igorwojda/tree/traversal/TreeTraversal.md)
* [Tree level width](app/src/test/java/com/igorwojda/tree/levelwidth/LevelWidth.md)
* [Binary Search Tree (insert)](app/src/test/java/com/igorwojda/binarytree/insert/Insert.md)
* [Binary Search Tree (validate)](app/src/test/java/com/igorwojda/binarytree/validate/Validate.md)
* [Merge sort](app/src/test/java/com/igorwojda/list/mergesort/MergeSort.md)
* [Pyramid generator](app/src/test/java/com/igorwojda/various/pyramidgenerator/PyramidGenerator.md)
* [Steps generator](app/src/test/java/com/igorwojda/various/stepsgenerator/StepsGenerator.md)
* [Fibonacci](app/src/test/java/com/igorwojda/various/fibonacci/basic/Fibonacci.md)
* [Fibonacci add recursive cache](app/src/test/java/com/igorwojda/various/fibonacci/recursivecached/FibonacciRecursiveCached.md)
* [Fizz Buzz](app/src/test/java/com/igorwojda/various/fizzbuzz/FizzBuzz.md)
* [Spiral matrix generator](app/src/test/java/com/igorwojda/various/spiralmatrixgenerator/SpiralMatrixGenerator.md)
* [Factorial](app/src/test/java/com/igorwojda/various/factorial/Factorial.md)
* [Print number](app/src/test/java/com/igorwojda/various/printnumber/basic/PrintNumber.md)
* [Print number with steps](app/src/test/java/com/igorwojda/various/printnumber/steps/PrintNumberWithSteps.md)

# References

## Articles

* [Data structures explained](https://medium.com/basecs/tagged/data-structures) series

## Books

* [Cracking the Coding Interview, 6th Edition](https://www.amazon.co.uk/Cracking-Coding-Interview-6th-Programming/dp/0984782850/ref=pd_lpo_sbs_14_img_0?_encoding=UTF8&psc=1&refRID=ZKQA82B0MSD2GYPCCZYQ)
* [Algorithms, 4th Edition](https://algs4.cs.princeton.edu/home/)

## Video courses

* [JavaScript Algorithms and Data Structures Masterclass](https://www.udemy.com/js-algorithms-and-data-structures-masterclass/)
* [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure/)
* [Master the Coding Interview Data Structures + Algorithms](https://www.udemy.com/master-the-coding-interview-data-structures-algorithms/)

## Coding problems websites

* [HackerRank](https://www.hackerrank.com/)
* [CoderByte](https://coderbyte.com/challenges)
* [CodeChef](https://www.codechef.com/problems/school)
* [LeetCode](https://leetcode.com/problemset/all)
* [GeeksForGeeks](https://www.geeksforgeeks.org)

# Contribute

If you think something is incorrect, you have found a new puzzle, have a better solution or simply you want to [add new puzzle](/misc/wiki/adding_new_puzzle.md)
please create PR or open a new issue.

# Follow me

![avatar.png](misc/image/avatar.png)

[Twitter](https://twitter.com/igorwojda) | [Medium](https://medium.com/@igorwojda) | [Linkedin](https://www.linkedin.com/in/igorwojda/)
