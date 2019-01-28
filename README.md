# Kotlin coding puzzles

This repository contains a set of [programming puzzles](#lets-solve-some-puzzles) that are solved using
[Kotlin](https://kotlinlang.org/) language (hints, solutions tests and [useful links](#useful-links) are here as well).
Purpose of this repository is to help you to practice and develop strong problem-solving skills. This will help you to
become better programmer and improve you chance of getting new job, by passing
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interview.

## Puzzle structure

Each puzzle is located in separate package and it contains of 3 files ([screen](./misc/image/SampleTask.png)):
- `Puzzle.md` - description of the task.
- `Puzzle.kt` - empty method/class where puzzle should be solved. This file also contains a set of
  [JUnit](https://junit.org/junit4/) tests.
- `PuzzleSolution.kt` - file that contains solutions. 

Keep in mind that each puzzle will usually have more than one solution. Even simple puzzle like
[String reversal](app/src/test/java/com/igorwojda/string/reverse/Reverse.md) can be solved in
[10 different ways](https://eddmann.com/posts/ten-ways-to-reverse-a-string-in-javascript/). Usually, we compare various
solutions using
([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)) to
determine space/time complexity and we look at code readability.

## How do I start?
1. [Checkout the and open the project](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Checkout-and-open-the-project) 
2. [Solve puzzle](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Solving-coding-chalenges)
3. [Run the tests](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Running-tests)

# Let's solve some puzzles

Puzzles below are segregated by different difficulty. If you want to solve puzzles by problem type, please check this
[section](misc/ProblemGroups.md).

Some puzzle may contain a reference to other puzzles that should be solved before to have better understanding of the
problem. To succeed you need to practice often, repeat same puzzles multiple times and be persistent over time. Take
your time before you take a look at the presented solution. **Good luck!**

**New in Town**
- [Capitalize sentence](app/src/test/java/com/igorwojda/string/capitalizesentence/CapitalizeSentence.md)
- [Range contains range?](app/src/test/java/com/igorwojda/range/containsrange/ContainsRange.md)
- [Add up to](app/src/test/java/com/igorwojda/integer/addupto/AddUpTo.md)
- [Linear search](app/src/test/java/com/igorwojda/list/search/linearsearch/LinearSearch.md)
- [Count down](app/src/test/java/com/igorwojda/integer/countdown/CountDown.md)
- [Count up and down](app/src/test/java/com/igorwojda/integer/countupanddown/CountUpAndDown.md)
- [Generate all pairs](app/src/test/java/com/igorwojda/integer/generateallpairs/GenerateAllPairs.md)
- [List count unique values](app/src/test/java/com/igorwojda/list/countuniquevalues/CountUniqueValues.md)
- [Print number](app/src/test/java/com/igorwojda/various/printnumber/basic/PrintNumber.md)
- [Print number with steps](app/src/test/java/com/igorwojda/various/printnumber/steps/PrintNumberWithSteps.md)
- [Power](app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Factorial](app/src/test/java/com/igorwojda/integer/factorial/Factorial.md)
- [Product](app/src/test/java/com/igorwojda/list/product/Product.md)
- [Capitalize first](app/src/test/java/com/igorwojda/list/capitalizeFirst/CapitalizeFirst.md)
- [Decapitalize const](app/src/test/java/com/igorwojda/string/decapitalizeconst/DecapitalizeConst.md)
- [Longest word](app/src/test/java/com/igorwojda/string/longestword/LongestWord.md)

**Apprentice**
- [Is palindrome](app/src/test/java/com/igorwojda/string/ispalindrome/basic/IsPalindrome.md)
- [Is tolerant palindrome](app/src/test/java/com/igorwojda/string/ispalindrome/tolerant/IsTolerantPalindrome.md)
- [Is anagram](app/src/test/java/com/igorwojda/string/isanagram/IsAnagram.md)
- [Max occurring char](app/src/test/java/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
- [String reversal](app/src/test/java/com/igorwojda/string/reverse/Reverse.md)
- [Find the vowels](app/src/test/java/com/igorwojda/string/vowels/Vowels.md)
- [Int reversal](app/src/test/java/com/igorwojda/integer/reverse/Reverse.md)
- [Pyramid generator](app/src/test/java/com/igorwojda/various/pyramidgenerator/PyramidGenerator.md)
- [Steps generator](app/src/test/java/com/igorwojda/various/stepsgenerator/StepsGenerator.md)
- [Fizz Buzz](app/src/test/java/com/igorwojda/various/fizzbuzz/FizzBuzz.md)
- [Caesar Cipher](app/src/test/java/com/igorwojda/string/caesarcipher/CaesarCipher.md)
- [Repeated Character](app/src/test/java/com/igorwojda/string/hasrepeatedcharacter/HasRepeatedCharacter.md)

**Warrior** 
- [Spiral matrix generator](app/src/test/java/com/igorwojda/various/spiralmatrixgenerator/SpiralMatrixGenerator.md)
- [Int queue](app/src/test/java/com/igorwojda/queue/int/IntQueue.md)
- [Generic queue](app/src/test/java/com/igorwojda/queue/generic/GenericQueue.md)
- [Combine two queues](app/src/test/java/com/igorwojda/queue/weave/Weave.md)
- [Two stack queue](app/src/test/java/com/igorwojda/queue/twostack/TwoStackQueue.md)
- [Int stack](app/src/test/java/com/igorwojda/stack/int/IntStack.md)
- [Generic stack](app/src/test/java/com/igorwojda/stack/generic/GenericStack.md)
- [Bubble sort](app/src/test/java/com/igorwojda/list/sort/bubblesort/BubbleSort.md)
- [Selection sort](app/src/test/java/com/igorwojda/list/sort/selectionsort/SelectionSort.md)
- [Square equals](app/src/test/java/com/igorwojda/list/squareequal/SquareEquals.md)
- [Sum zero](app/src/test/java/com/igorwojda/list/sumzero/SumZero.md)
- [Digit frequency](app/src/test/java/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Get duplicated arguments](app/src/test/java/com/igorwojda/string/getduplicatedarguments/GetDuplicatedArguments.md)
- [Find pair with target average](app/src/test/java/com/igorwojda/list/pairaverage/PairAverage.md)
- [Tree traversal](app/src/test/java/com/igorwojda/tree/traversal/TreeTraversal.md)
- [Tree level width](app/src/test/java/com/igorwojda/tree/levelwidth/LevelWidth.md)
- [Binary search tree (insert)](app/src/test/java/com/igorwojda/binarytree/insert/Insert.md)
- [Binary search tree (validate)](app/src/test/java/com/igorwojda/binarytree/validate/Validate.md)
- [Any callback](app/src/test/java/com/igorwojda/various/anycallback/AnyCallback.md)
- [Flatten](app/src/test/java/com/igorwojda/list/flatten/Flatten.md)
- [Binary search](app/src/test/java/com/igorwojda/list/search/binarysearch/BinarySearch.md)
- [Surrounded letter](app/src/test/java/com/igorwojda/string/surroundedletter/SurroundedLetter.md) 
- [Insertion sort](app/src/test/java/com/igorwojda/list/sort/insertionsort/InsertionSort.md)

**Commander**
- [List chunking](app/src/test/java/com/igorwojda/list/listchunk/ListChunk.md)
- [Linked list](app/src/test/java/com/igorwojda/linkedlist/base/LinkedList.md)
- [Linked list midpoint](app/src/test/java/com/igorwojda/linkedlist/midpoint/Midpoint.md)u
- [Circular check](app/src/test/java/com/igorwojda/linkedlist/circularcheck/CircularCheck.md)
- [Linked list take n-th element from last](app/src/test/java/com/igorwojda/linkedlist/fromlast/FromLast.md)
- [Is sub string](app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [Merge sort](app/src/test/java/com/igorwojda/list/sort/mergesort/MergeSort.md)
- [Fibonacci](app/src/test/java/com/igorwojda/various/fibonacci/basic/Fibonacci.md)
- [Fibonacci with recursive cache](app/src/test/java/com/igorwojda/various/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Max sub list sum](app/src/test/java/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub list length](app/src/test/java/com/igorwojda/list/minsublistlength/MinSubListLength.md)
- [Subtract](app/src/test/java/com/igorwojda/list/subtract/Subtract.md)

# Useful links

## More codding challenges

- [GeeksForGeeks](https://practice.geeksforgeeks.org) - data structures / algorithms / company interview problems.
- [CoderByte](https://coderbyte.com/challenges) - data structures / algorithms / company interview problems segregated
  by difficulty. They offer premium membership which gives you official step-by-step solutions and user solutions.
- [HackerRank](https://www.hackerrank.com/dashboard) - data structures / algorithms / mathematics.
- [Project euler](https://projecteuler.net/archives) - More complex challenges, usually related to mathematics. The have
  already 600+ problems and a new code challenge is available very week or two. You will probably have to discuss
  problem with community because solutions are not on the website.
- [Code Google Com Codejam](https://code.google.com/codejam/past-contests) - Google Code Jam, calls on programmers
  around the world to solve challenging, algorithmic puzzles against the clock. FObtusely they publish all the past
  problems on their website.
- [Advent of code](https://adventofcode.com/2018/events) - one months of various programing tasks at the end of each
  year released day by day during the advent. Archive of old problems is still there.
- [CodeChef](https://www.codechef.com/problems/school) - contains set of programming problems segregated by difficulty.
- [LeetCode](https://leetcode.com/problemset/all) - data structures / algorithms / company interview problems segregated
  by difficulty.
- [Code Forces](http://codeforces.com/problemset) - list of programming puzzles is smaller than other websites, but you
  will still have plenty problems to solve.
- [Spoj](https://www.spoj.com/problems/classical) - list of programming puzzles is smaller than other websites, but you
  will still have plenty problems to solve.

## Video courses

- [JavaScript Algorithms and Data Structures Masterclass](https://www.udemy.com/js-algorithms-and-data-structures-masterclass/)
- [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure/)
- [Master the Coding Interview Data Structures + Algorithms](https://www.udemy.com/master-the-coding-interview-data-structures-algorithms/)
- [Learning Algorithms in JavaScript from Scratch](https://www.udemy.com/learning-algorithms-in-javascript-from-scratch/)
- [Data Structures and Algorithms Deep Dive Using Java](https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/)

## Books

- [Cracking the Coding Interview, 6th Edition](https://www.amazon.co.uk/Cracking-Coding-Interview-6th-Programming/dp/0984782850/)
- [Algorithms, 4th Edition](https://www.amazon.com/Algorithms-4th-Robert-Sedgewick/dp/032157351X/)
- [Introduction to Algorithms, 3rd Edition (The MIT Press)](https://www.amazon.com/Introduction-Algorithms-3rd-MIT-Press/dp/0262033844/)
- [More books...](https://www.quora.com/What-are-the-best-books-on-algorithms-and-data-structures)

## Articles

- [Data structures explained](https://medium.com/basecs/tagged/data-structures) - great description of various data structures
- [Big-O Cheat Sheet](http://bigocheatsheet.com/)
- [Sorting algorithms animations](https://www.toptal.com/developers/sorting-algorithms) - visualisation of most popular sorting algorithms

## Coding interview repositories
- [Coding Interview University](https://github.com/jwasham/coding-interview-university)
- [Awesome Interview Questions](https://github.com/MaximAbramchuck/awesome-interview-questions)
- [Google Interview University](https://github.com/P1xt/google-interview-university)
- [Interviews](https://github.com/kdn251/interviews)

# Contribute

If you think something is sdfds sdf ds fsd fds fds fds fds ds dsincorrect, have a better solution, give feedback or
simply you want to [add new coding puzzle](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Adding-a-new-puzzle)
just create PR or open a new issue.

## Contributors

- [Alan Evans](https://github.com/alanevansbc)
- [Norbert Kiesel](https://github.com/nkiesel)

# Follow me

![avatar.png](misc/image/avatar.png)

[Twitter](https://twitter.com/igorwojda) | [Medium](https://medium.com/@igorwojda) | [Linkedin](https://www.linkedin.com/in/igorwojda/)
