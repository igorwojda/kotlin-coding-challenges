# Kotlin coding puzzles
This repository contains set of programming problems that are meant to be solved using [Kotlin](https://kotlinlang.org/) language (no
worries solutions are here as well). These challenges will help you to prepare for
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews by revealing certain tricks, present problem solving
strategies and train your mind to thing is specific way.

This project is Android Studio project, because it allow quick out of the box JUnit test support. To start you just need to import project
directly from github into Android Studio (detailed instructions below).

I strongly encourage you to take a pen, piece of paper, take your time and think about problem before you look at the presented solution
(sometimes one night sleep is all we need before solution pop ups into our head).

Order of the programming problems is random for now, however some of them may contain reference to problems that should be solved before to
make final problem easier. It all up to you how you approach this, just remember that to succeed you need to practice often, repeat same
tasks multiple times and be persistent over time.
# How to start?
## How to open project?
1. Install [Android Studio](https://developer.android.com/studio/)
2. Install [Git](https://git-scm.com/downloads) or make sure it's already installed by running `git --version` command
3. Import project by using Android Studio menu: File //return New //return Project From Version Control //return Git
4. Enter Repository URL `https://github.com/igorwojda/kotlin-coding-puzzle.git`  and click `clone`
5. Open [app/src/test/java/com/igorwojda](app/src/test/java/com/igorwojda/) folder in `Project` view or
   [app/java/com (test)/igorwojda](app/src/test/java/com/igorwojda/) in `Android` view in project panel.
7. Each problem is located in separate package and it contains 3 files:
* `ProblemName.md` - description of the problem
* `ProblemName.kt` - contains empty method/class to solver problem and set of tests (we will write code, solve problem here)
* `ProblemNameSolution.kt` - file that contains one or more problem solutions (encapsulated in Kotlin `object` to avoid conflicts with other
coding puzzles)

## How to run the tests?
Open `ProblemName.kt` file for specific problem. There will be single class with `Test` suffix (`ProblemNameTest`). Click on green arrow
on the left of method name (runs single test) or test class name (run all tests in Test class). After running test you can rerun last
configuration using `Run command` (`⌘ + R`).

# Coding puzzles
Be patient, persistent and have fun solving 🤓

## Algorithms
1. [Anagram](app/src/test/java/com/igorwojda/codingpuzzle/anagram/Anagram.md)
2. [Capitalize sentence](app/src/test/java/com/igorwojda/codingpuzzle/calitalisesentence/CapitalizeSentence.md)
3. [Fibonacci](app/src/test/java/com/igorwojda/codingpuzzle/fibonacci/classic/Fibonacci.md)
4. [Fibonacci add recursive cache](app/src/test/java/com/igorwojda/codingpuzzle/fibonacci/classic/Fibonacci.md)
5. [Fizz Buzz](app/src/test/java/com/igorwojda/codingpuzzle/fizzbuzz/FizzBuzz.md)
6. [List chunk](app/src/test/java/com/igorwojda/codingpuzzle/listchunk/ListChunk.md)
7. [Matrix spiral numbers](app/src/test/java/com/igorwojda/codingpuzzle/matrix/spiralnumbers/SpiralNumbers.md)
8. [Palindrome](app/src/test/java/com/igorwojda/codingpuzzle/palindrome/classic/Palindrome.md)
9. [Tolerant palindrome](app/src/test/java/com/igorwojda/codingpuzzle/palindrome/tolerant/TolerantPalindrome.md)
10. [Range contains range](app/src/test/java/com/igorwojda/codingpuzzle/rangecontainsrange/RangeContainsRange.md)
11. [Factorial](app/src/test/java/com/igorwojda/codingpuzzle/factorial/Factorial.md)
12. [Print number](app/src/test/java/com/igorwojda/codingpuzzle/printnumber/classic/PrintNumber.md)
13. [Print number with steps](app/src/test/java/com/igorwojda/codingpuzzle/printnumber/steps/PrintNumberWithSteps.md)
14. [Reverse numbers](app/src/test/java/com/igorwojda/codingpuzzle/reverseint/ReverseInt.md)
15. [Shape pyramids](app/src/test/java/com/igorwojda/codingpuzzle/shape/pyramids/Pyramids.md)
16. [Shape steps](app/src/test/java/com/igorwojda/codingpuzzle/shape/steps/Steps.md)
17. [String max char](app/src/test/java/com/igorwojda/codingpuzzle/string/maxchar/MaxChar.md)
18. [String recurring char](app/src/test/java/com/igorwojda/codingpuzzle/string/recurringchar/RecurringChar.md)
19. [String reverse](app/src/test/java/com/igorwojda/codingpuzzle/string/reverse/Reverse.md)
20. [String vowels](app/src/test/java/com/igorwojda/codingpuzzle/string/vowels/Vowels.md)

## Data structures
1. [Int queue](app/src/test/java/com/igorwojda/datastructure/queue/int/IntQueue.md)
2. [Generic queue](app/src/test/java/com/igorwojda/datastructure/queue/generic/GenericQueue.md)
3. [Int stack](app/src/test/java/com/igorwojda/datastructure/stack/int/IntStack.md)
4. [Generic stack](app/src/test/java/com/igorwojda/datastructure/stack/generic/GenericStack.md)
5. [Two stack queue](app/src/test/java/com/igorwojda/datastructure/queue/twostack/TwoStackQueue.md)
6. [Linked list](app/src/test/java/com/igorwojda/datastructure/linkedlist/base/LinkedList.md)
7. [Linked list midpoint](app/src/test/java/com/igorwojda/datastructure/linkedlist/midpoint/Midpoint.md)

# Contribute
If you have any doubts, found a problem, found better solution or simply you want to add new programming problem please create PR
or open new issue.

# Inspiration & References
For more detailed explanations of various problems please take a look at these courses and books:
* [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure/)
