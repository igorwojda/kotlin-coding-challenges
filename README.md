# Kotlin coding puzzles
This repository contains set of programming problems that are meant to be solved using [Kotlin](https://kotlinlang.org/) language. These
challenges will help you to prepare for [whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

This project is Android Studio project, because it allow quick out of the box JUnit test support. To start you just need to import project
directly from github into Android Studio (detailed instructions below).

I strongly encourage you to take a pen, piece of paper and take your time thinking about problem before you look at the presented solution
(sometimes one night sleep is all we need before solution pop ups into our head).

Order of the programming problems is random, however in the future I many split hem into various levels.

# How to open project and run the tests?
1. Install [Android Studio](https://developer.android.com/studio/)
1. Install [Git](https://git-scm.com/downloads) or make sure it's already installed by running `git --version` command
2. Import project by using Android Studio menu: File -> New -> Project From Version Control -> Git
3. Enter Repository URL `https://github.com/igorwojda/kotlin-coding-puzzle.git`  and click `clone`
4. Open (app/src/test/java/com/igorwojda) [app/src/test/java/com/igorwojda] folder and select problem you want to solve
 (if you have Android project view selected it will be (app/java/com (test)/igorwojda) [app/src/test/java/com/igorwojda]
5. Each problem is located in separate package and it contains 3 files:
* `ProblemName.md` - description of the problem
* `ProblemName.kt` - contains empty method/class to solver problem and set of tests (we will write code, solve problem here)
* `ProblemNameSolution.kt` - file that contains problem solution (encapsulated in Kotlin object to avoid conflicts with other
functions/methods)

# How to run the tests?
Open `ProblemName.kt` file for specific problem. There will be single class with `Test` suffix (`ProblemNameTest`). Click on green arrow
on the left of method name (runs single test) or test class name (run all tests in Test class). After running test you can rerun last
configuration using `Run command` (`Cmd+R`).

# Coding puzzles
Be patient, persistent and have fun solving 🤓

## Algorithms
1. [Anagram](app/src/test/java/com/igorwojda/codingpuzzle/anagram/Anagram.md)
1. [Capitalize sentence](app/src/test/java/com/igorwojda/codingpuzzle/calitalisesentence/CapitalizeSentence.md)
1. [Fibonacci](app/src/test/java/com/igorwojda/codingpuzzle/fibonacci/classic/Fibonacci.md)
1. [Fibonacci add recursive cache](app/src/test/java/com/igorwojda/codingpuzzle/fibonacci/recursivecache/FibonacciRecursiveCache.md)
1. [Fizz Buzz](app/src/test/java/com/igorwojda/codingpuzzle/fizzbuzz/FizzBuzz.md)
1. [List chunk](app/src/test/java/com/igorwojda/codingpuzzle/listchunk/ListChunk.md)
1. [Matrix spiral numbers](app/src/test/java/com/igorwojda/codingpuzzle/matrix/spiralnumbers/SpiralNumbers.md)
1. [Palindrome](app/src/test/java/com/igorwojda/codingpuzzle/palindrome/classic/Palindrome.md)
1. [Tolerant palindrome](app/src/test/java/com/igorwojda/codingpuzzle/palindrome/tolerant/TolerantPalindrome.md)
1. [Range contains range](app/src/test/java/com/igorwojda/codingpuzzle/rangecontainsrange/RangeContainsRange.md)
1. [Factorial](app/src/test/java/com/igorwojda/codingpuzzle/factorial/Factorial.md)
1. [Print number](app/src/test/java/com/igorwojda/codingpuzzle/printnumber/classic/PrintNumber.md)
1. [Print number with steps](app/src/test/java/com/igorwojda/codingpuzzle/printnumber/steps/PrintNumberWithSteps.md)
1. [Reverse numbers](app/src/test/java/com/igorwojda/codingpuzzle/reverseint/ReverseInt.md)
1. [Shape pyramids](app/src/test/java/com/igorwojda/codingpuzzle/shape/pyramids/Pyramids.md)
1. [Shape steps](app/src/test/java/com/igorwojda/codingpuzzle/shape/steps/Steps.md)
1. [String max char](app/src/test/java/com/igorwojda/codingpuzzle/string/maxchar/MaxChar.md)
1. [String recurring char](app/src/test/java/com/igorwojda/codingpuzzle/string/recurringchar/RecurringChar.md)
1. [String reverse](app/src/test/java/com/igorwojda/codingpuzzle/string/reverse/Reverse.md)
1. [String vowels](app/src/test/java/com/igorwojda/codingpuzzle/string/vowels/Vowels.md)

## Data structures
1. [Queue](app/src/test/java/com/igorwojda/datastructure/queue/classic/Queue.md)
1. [Generic queue](app/src/test/java/com/igorwojda/datastructure/queue/generic/GenericQueue.md)
1. [Queue weave](app/src/test/java/com/igorwojda/datastructure/queue/weave/Weave.md)

# Contribute
If you have any doubts, found a problem, found better solution or simply you want to add new programming problem please create PR
or open new issue.

# Inspiration & References
* [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure/)
