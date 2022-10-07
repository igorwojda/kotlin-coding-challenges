# Kotlin coding challenges

This repository contains a set of [programming challenges](#lets-solve-some-challenges) that are intended to be solved by using the
[Kotlin](https://kotlinlang.org/) language (hints, solutions tests and [useful links](#useful-links) are here as well).

The purpose of this repository is to help you to practice coding and develop strong problem-solving skills. This will
help you to become a better programmer and improve your chance of getting a new job by passing
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

## Challenge structure

Each challenge is located in separate package, and it contains 3 main
files ([screen](./misc/image/challenge-structure.png)):

- `readme.md` - the task description.
- `challenge.kt` - file containing an empty method/class where challenge should be solved. This file also contains
  set of test and occasionally helper methods. You can run all tests directly from this file (click green arrow next to
  `Test` class).
  [JUnit](https://junit.org/junit4/) tests which verify that task was solved correctly.
- `solution.kt` - a file containing one or more solutions.

Keep in mind that each challenge will usually have more than one solution. Even simple challenges like
[String reversal](src/test/kotlin/com/igorwojda/string/reverse) can be solved in
[10 different ways](https://eddmann.com/posts/ten-ways-to-reverse-a-string-in-javascript/). Usually, we compare various
solutions using
([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)) to
determine space/time complexity and we look at code readability.

## How do I start?

1. Install [IntelliJ IDEA](https://www.jetbrains.com/idea/)
2. Import project by using IntelliJ IDEA menu: `File | New | Project From Version Control | Git`
3. Choose a challenge ([src\test\kotlin\com\igorwojda](src/test/kotlin/com/igorwojda) directory) and code
   the solution
4. [Run the tests](https://github.com/igorwojda/kotlin-coding-challenges/wiki/Running-tests) to verify your solution

# Let's solve some challenges

Challenges below are segregated by different difficulties. The repository also contains challenges grouped by
[problem type](misc/ChallengeGroups.md).

Some challenges may contain a reference to other challenges that should be solved before to have a better understanding
of the problem. Check the
look at [problem-solving strategy](https://github.com/igorwojda/kotlin-coding-challenges/wiki/Solving-coding-challenges)
.

Take your time before you view the presented solution. To succeed you need to practice often, repeat the same challenges
multiple times and be persistent over time.

**Good luck!**

**New in Town**

- [Capitalize sentence](src/test/kotlin/com/igorwojda/string/capitalizesentence)
- [Get odd numbers](src/test/kotlin/com/igorwojda/integer/getodd)
- [Range contains range?](src/test/kotlin/com/igorwojda/range/containsrange)
- [Add up to](src/test/kotlin/com/igorwojda/integer/addupto)
- [Linear search](src/test/kotlin/com/igorwojda/list/search/linearsearch)
- [Count down](src/test/kotlin/com/igorwojda/integer/countdown)
- [Count up and down](src/test/kotlin/com/igorwojda/integer/countupanddown)
- [Format train route](src/test/kotlin/com/igorwojda/list/formattrainroute)
- [Generate all pairs](src/test/kotlin/com/igorwojda/integer/generateallpairs)
- [Count unique values](src/test/kotlin/com/igorwojda/list/countuniquevalues)
- [Print number](src/test/kotlin/com/igorwojda/integer/printnumber/basic)
- [Print number with steps](src/test/kotlin/com/igorwojda/integer/printnumber/steps)
- [Power](src/test/kotlin/com/igorwojda/integer/power)
- [Factorial](src/test/kotlin/com/igorwojda/integer/factorial)
- [Product](src/test/kotlin/com/igorwojda/list/product)
- [Capitalize first](src/test/kotlin/com/igorwojda/list/capitalizeFirst)
- [Decapitalize const](src/test/kotlin/com/igorwojda/string/decapitalizeconst)
- [Longest word](src/test/kotlin/com/igorwojda/string/longestword)

**Apprentice**

- [Is palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/basic)
- [Is tolerant palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant)
- [Is permutation palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/permutation)
- [Is anagram](src/test/kotlin/com/igorwojda/string/isanagram)
- [Max occurring char](src/test/kotlin/com/igorwojda/string/maxchar)
- [String reverse](src/test/kotlin/com/igorwojda/string/reverse)
- [Find the vowels](src/test/kotlin/com/igorwojda/string/vowels)
- [Int reverse](src/test/kotlin/com/igorwojda/integer/reverse)
- [Pyramid generator](src/test/kotlin/com/igorwojda/integer/pyramidgenerator)
- [Steps generator](src/test/kotlin/com/igorwojda/integer/stepsgenerator)
- [Fizz Buzz](src/test/kotlin/com/igorwojda/integer/fizzbuzz)
- [Caesar Cipher](src/test/kotlin/com/igorwojda/string/caesarcipher)
- [Has repeated char](src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter)

**Warrior** 

- [Spiral matrix generator](src/test/kotlin/com/igorwojda/matrix/spiralmatrixgenerator)
- [Find rectangle](src/test/kotlin/com/igorwojda/matrix/findrectangle)
- [Queue](src/test/kotlin/com/igorwojda/queue/basic)
- [Combine queues](src/test/kotlin/com/igorwojda/queue/combine)
- [Stack](src/test/kotlin/com/igorwojda/stack/basic)
- [Bubble sort](src/test/kotlin/com/igorwojda/list/sort/bubblesort)
- [Selection sort](src/test/kotlin/com/igorwojda/list/sort/selectionsort)
- [Square equals](src/test/kotlin/com/igorwojda/list/squareequal)
- [Sum zero](src/test/kotlin/com/igorwojda/list/sumzero)
- [Digit frequency](src/test/kotlin/com/igorwojda/integer/digitfrequency)
- [Get duplicated arguments](src/test/kotlin/com/igorwojda/string/getduplicatedarguments)
- [Find pair with target average](src/test/kotlin/com/igorwojda/list/pairaverage)
- [Binary search tree](src/test/kotlin/com/igorwojda/tree/binarysearchtree)
- [Tree traversal](src/test/kotlin/com/igorwojda/tree/classic/traversal)
- [Tree level width](src/test/kotlin/com/igorwojda/tree/classic/levelwidth)
- [Binary search tree (insert)](src/test/kotlin/com/igorwojda/tree/binarytree/insert)
- [Binary search tree (validate)](src/test/kotlin/com/igorwojda/tree/binarytree/validate)
- [Any callback](src/test/kotlin/com/igorwojda/various/anycallback)
- [Flatten](src/test/kotlin/com/igorwojda/list/flatten)
- [Binary search](src/test/kotlin/com/igorwojda/list/search/binarysearch)
- [Surrounded letter](src/test/kotlin/com/igorwojda/string/surroundedletter)
- [Insertion sort](src/test/kotlin/com/igorwojda/list/sort/insertionsort)
- [Quick sort](src/test/kotlin/com/igorwojda/list/sort/quicksort)
- [Radix sort](src/test/kotlin/com/igorwojda/list/sort/radixsort)
- [Doubly linked list](src/test/kotlin/com/igorwojda/linkedlist/doubly/base)
- [Max binary heap](src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap)

**Commander**

- [List chunk](src/test/kotlin/com/igorwojda/list/listchunk)
- [Singly linked list](src/test/kotlin/com/igorwojda/linkedlist/singly/base)
- [Linked list midpoint](src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint)
- [Circular check](src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck)
- [Linked list take n-th element from last](src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast)
- [Is sub string](src/test/kotlin/com/igorwojda/string/issubstring)
- [Merge sort](src/test/kotlin/com/igorwojda/list/sort/mergesort)
- [Fibonacci](src/test/kotlin/com/igorwojda/integer/fibonacci/basic)
- [Fibonacci with recursive cache](src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached)
- [Max sub list sum](src/test/kotlin/com/igorwojda/list/maxsublistsum)
- [Min sub list length](src/test/kotlin/com/igorwojda/list/minsublistlength)
- [Subtract](src/test/kotlin/com/igorwojda/list/subtract)
- [Coins](src/test/kotlin/com/igorwojda/list/coins)

# Useful links

## More coding challenges

### Challanges

- [GeeksForGeeks](https://practice.geeksforgeeks.org/explore) - large and nicely segregated set of problems.
- [HackerRank](https://www.hackerrank.com/dashboard) - large set of problems and additional interview problems for
  business.
- [LeetCode](https://leetcode.com/problemset/all) - data structures / algorithms / company interview problems segregated
  by difficulty.
- [Exercism](https://exercism.io/) - coding challenge website that offers MANY challenges spanning over 60 programming languages.
- [Project Euler](https://projecteuler.net/archives) - more complex challenges, usually related to mathematics. The site
  already contains 600+ problems and a new code challenge is available very week or two. You will probably have to
  discuss the problem with the community because solutions are not on the website.
- [Advent of code](https://adventofcode.com/2018/events) - one month of various programing problems released daily at
  the end of the year. Fortunately archive of past events is still there.
- [CoderByte](https://coderbyte.com/challenges) - 200+ challenges, data structures / algorithms / company interview
  problems segregated by difficulty. Unfortunately most of them are only available for premium users. Premium gives you
  access to premium step-by-step solutions and user solutions.
- [CodeChef](https://www.codechef.com/problems/school) - contains set of programming problems segregated by difficulty.
- [Code Forces](http://codeforces.com/problemset) - list of programming challenges is smaller than other websites, but
  you will still have plenty of problems to solve.
- [Spoj](https://www.spoj.com/problems/classical) - list of programming challenges is smaller than other websites, but
  you will still have plenty of problems to solve.

### Game challanges
- [CodeWars](https://www.codewars.com/) - solve visuial challanges by writing code for the.
- [CodinGame](https://www.codingame.com/) - solve visuial challanges by writing code for the.

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

Feedback and new contributions are welcome whether it's through bug reports or new PRs. To add new coding challenge just
follow this [guide](https://github.com/igorwojda/kotlin-coding-challenges/wiki/Adding-a-new-challenge) and open PR.

# Author

[![Follow me](https://github.com/igorwojda/kotlin-coding-challenges/raw/main/misc/image/avatar.png)](https://twitter.com/igorwojda)

[![Follow me](https://img.shields.io/twitter/follow/igorwojda?style=social)](https://twitter.com/igorwojda)

# License
```
MIT License

Copyright (c) 2019 Igor Wojda

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
