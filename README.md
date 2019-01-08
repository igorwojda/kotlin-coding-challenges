# Kotlin coding puzzles

This repository contains a set of programming problems that are meant to be solved using [Kotlin](https://kotlinlang.org/) language (no
worries hints and solutions are here as well) to help you to practice your coding skills and prepare for
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

This project is [Android Studio](https://developer.android.com/studio/) project because it allows quick out of the box JUnit test support.
To start you just need to import project directly from GitHub into Android Studio (detailed instructions below).

Before solving any task I strongly encourage you to take a pen, piece of paper, take your time and think about the problem. Take your time
before you take a look at the presented solution (sometimes one-night sleep is all we need before solution pop-ups into our head).

Order of the programming problems is random for now, however, some of them may contain a reference to problems that should be solved before
to make the final problem easier. It all up to you how you approach this, just remember that to succeed you need to practice often, repeat
same tasks multiple times and be persistent over time.

# How do I start?

## Opening this project

1. Install [Android Studio](https://developer.android.com/studio/) (free)
2. Install git `brew install git` using cmd
3. Import project by using Android Studio menu: `File -> New -> Project From Version Control -> Git`
4. Enter Repository URL `https://github.com/igorwojda/kotlin-coding-puzzle.git`  and click `clone`
5. Navigate to [app/src/test/java/com/igorwojda](app/src/test/java/com/igorwojda/) folder in `Project` view or
   [app/java/com (test)/igorwojda](app/src/test/java/com/igorwojda/) in `Android` view in project panel.
6. Optionally install [Markdown Navigator](https://plugins.jetbrains.com/plugin/7896-markdown-navigator) plugin for Android studio to have
   ice preview of markdown files (files containing puzzles description)

## Problem structure
Each problem is located in separate package and it contains 3 files:
* `ProblemName.md` - description of the problem
* `ProblemName.kt` - contains empty method/class to solver problem and set of tests (we will write code, solve problem here)
* `ProblemNameSolution.kt` - file that contains one or more problem solutions (encapsulated in Kotlin `object` to avoid conflicts with other
  coding puzzles)

<img src="https://github.com/igorwojda/kotlin-coding-puzzle/master/misc/images/SampleTask.png?sanitize=true&raw=true" />

## Running tests

Open `ProblemName.kt` file for a specific problem. There will be a single class with `Test` suffix (`ProblemNameTest`). Click on the green
green arrow on the left of method name (runs single test) or test class name (run all tests in Test class). After running the test you can
rerun last configuration using `Run command` (`⌘ + R`).

# Coding puzzles

Be patient, persistent and have fun solving 🤓

## Algorithms

1. [Anagram](app/src/test/java/com/igorwojda/codingpuzzle/anagram/Anagram.md)
2. [Sentence capitalization](app/src/test/java/com/igorwojda/codingpuzzle/calitalisesentence/CapitalizeSentence.md)
3. [Fibonacci](app/src/test/java/com/igorwojda/codingpuzzle/fibonacci/basic/Fibonacci.md)
4. [Fibonacci add recursive cache](app/src/test/java/com/igorwojda/codingpuzzle/fibonacci/recursivecached/FibonacciRecursiveCached.md)
5. [Fizz Buzz](app/src/test/java/com/igorwojda/codingpuzzle/fizzbuzz/FizzBuzz.md)
6. [List chunking](app/src/test/java/com/igorwojda/codingpuzzle/listchunk/ListChunk.md)
7. [Spiral matrix generator](app/src/test/java/com/igorwojda/codingpuzzle/matrix/spiralnumbers/SpiralNumbers.md)
8. [Palindrome](app/src/test/java/com/igorwojda/codingpuzzle/palindrome/basic/Palindrome.md)
9. [Tolerant palindrome](app/src/test/java/com/igorwojda/codingpuzzle/palindrome/tolerant/TolerantPalindrome.md)
10. [Range contains range?](app/src/test/java/com/igorwojda/codingpuzzle/rangecontainsrange/RangeContainsRange.md)
11. [Factorial](app/src/test/java/com/igorwojda/codingpuzzle/factorial/Factorial.md)
12. [Print number](app/src/test/java/com/igorwojda/codingpuzzle/printnumber/basic/PrintNumber.md)
13. [Print number with steps](app/src/test/java/com/igorwojda/codingpuzzle/printnumber/steps/PrintNumberWithSteps.md)
14. [Int reversal](app/src/test/java/com/igorwojda/codingpuzzle/reverseint/ReverseInt.md)
15. [Pyramid shape](app/src/test/java/com/igorwojda/codingpuzzle/shape/pyramids/Pyramids.md)
16. [Steps shape](app/src/test/java/com/igorwojda/codingpuzzle/shape/steps/Steps.md)
17. [Max occurring char](app/src/test/java/com/igorwojda/codingpuzzle/string/maxchar/MaxOccurrentChar.md)
18. [String reversal](app/src/test/java/com/igorwojda/codingpuzzle/string/reverse/Reverse.md)
19. [Find the vowels](app/src/test/java/com/igorwojda/codingpuzzle/string/vowels/Vowels.md)

## Data structures

1. [Int queue](app/src/test/java/com/igorwojda/datastructure/queue/int/IntQueue.md)
2. [Generic queue](app/src/test/java/com/igorwojda/datastructure/queue/generic/GenericQueue.md)
3. [Int stack](app/src/test/java/com/igorwojda/datastructure/stack/int/IntStack.md)
4. [Combine two queues](app/src/test/java/com/igorwojda/datastructure/queue/weave/Weave.md)
5. [Generic stack](app/src/test/java/com/igorwojda/datastructure/stack/generic/GenericStack.md)
6. [Two stack queue](app/src/test/java/com/igorwojda/datastructure/queue/twostack/TwoStackQueue.md)
7. [Linked list](app/src/test/java/com/igorwojda/datastructure/linkedlist/base/LinkedList.md)
8. [Linked list midpoint](app/src/test/java/com/igorwojda/datastructure/linkedlist/midpoint/Midpoint.md)
9. [Circular linked list?](app/src/test/java/com/igorwojda/datastructure/linkedlist/circularcheck/CircularCheck.md)
10. [Linked list take n-th element from last](app/src/test/java/com/igorwojda/datastructure/linkedlist/fromlast/FromLast.md)

# Contribute

If you have any doubts, found a problem, found a better solution or simply you want to add new programming problem please create PR
or open a new issue.

# Inspiration & References

For more detailed explanations of various problems please take a look at these courses and books:
* [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure/)

