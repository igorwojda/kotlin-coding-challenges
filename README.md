# Kotlin coding challenges

This repository contains a set of [programming challenges](#lets-solve-some-challenges) that are solved using the
[Kotlin](https://kotlinlang.org/) language (hints, solutions tests and [useful links](#useful-links) are here as well).
The purpose of this repository is to help you to practice coding and develop strong problem-solving skills. This will
help you to become a better programmer and improve your chance of getting a new job by passing
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

## Challenge structure

Each challenge is located in separate package and it contains 3 main
files ([screen](./misc/image/challenge-structure.png)):

- `desc.md` - the task description.
- `desc.kt` - an empty method/class where challenge should be solved. This file also contains set of test and
  ocasionally helper methods.
  [JUnit](https://junit.org/junit4/) tests which verify that task was solved correctly.
- `solution.kt` - a file containing one or more solutions.

Keep in mind that each challenge will usually have more than one solution. Even simple challenges like
[String reversal](src/test/kotlin/com/igorwojda/string/reverse/desc.md) can be solved in
[10 different ways](https://eddmann.com/posts/ten-ways-to-reverse-a-string-in-javascript/). Usually, we compare various
solutions using
([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)) to
determine space/time complexity and we look at code readability.

## How do I start?

1. Install [IntelliJ IDEA](https://www.jetbrains.com/idea/)
2. Import project by using IntelliJ IDEA menu: `File | New | Project From Version Control | Git`
3. Choose a challenge and code
   the [solution](https://github.com/igorwojda/kotlin-coding-challenges/wiki/Solving-coding-chalenges)
4. [Run the tests](https://github.com/igorwojda/kotlin-coding-challenges/wiki/Running-tests) to verify your solution

# Let's solve some challenges

Challenges below are segregated by different difficulties. The repository also contains challenges grouped by
[problem type](misc/desc.md).

Some challenges may contain a reference to other challenges that should be solved before to have a better understanding
of the problem. To succeed you need to practice often, repeat the same challenges multiple times and be persistent over
time. Take your time before you take a look at the presented solution. **Good luck!**

**New in Town**

- [Capitalize sentence](src/test/kotlin/com/igorwojda/string/capitalizesentence/desc.md)
- [Get odd numbers](src/test/kotlin/com/igorwojda/integer/getodd/desc.md)
- [Range contains range?](src/test/kotlin/com/igorwojda/range/containsrange/desc.md)
- [Add up to](src/test/kotlin/com/igorwojda/integer/addupto/desc.md)
- [Linear search](src/test/kotlin/com/igorwojda/list/search/linearsearch/desc.md)
- [Count down](src/test/kotlin/com/igorwojda/integer/countdown/desc.md)
- [Count up and down](src/test/kotlin/com/igorwojda/integer/countupanddown/desc.md)
- [Format train route](src/test/kotlin/com/igorwojda/list/formattrainroute/desc.md)
- [Generate all pairs](src/test/kotlin/com/igorwojda/integer/generateallpairs/desc.md)
- [Count unique values](src/test/kotlin/com/igorwojda/list/countuniquevalues/desc.md)
- [Print number](src/test/kotlin/com/igorwojda/integer/printnumber/basic/desc.md)
- [Print number with steps](src/test/kotlin/com/igorwojda/integer/printnumber/steps/desc.md)
- [Power](src/test/kotlin/com/igorwojda/integer/power/desc.md)
- [Factorial](src/test/kotlin/com/igorwojda/integer/factorial/desc.md)
- [Product](src/test/kotlin/com/igorwojda/list/product/desc.md)
- [Capitalize first](src/test/kotlin/com/igorwojda/list/capitalizeFirst/desc.md)
- [Decapitalize const](src/test/kotlin/com/igorwojda/string/decapitalizeconst/desc.md)
- [Longest word](src/test/kotlin/com/igorwojda/string/longestword/desc.md)

**Apprentice**

- [Is palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/basic/desc.md)
- [Is tolerant palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/tolerant/desc.md)
- [Is permutation palindrome](src/test/kotlin/com/igorwojda/string/ispalindrome/permutation/desc.md)
- [Is anagram](src/test/kotlin/com/igorwojda/string/isanagram/desc.md)
- [Max occurring char](src/test/kotlin/com/igorwojda/string/maxchar/desc.md)
- [String reverse](src/test/kotlin/com/igorwojda/string/reverse/desc.md)
- [Find the vowels](src/test/kotlin/com/igorwojda/string/vowels/desc.md)
- [Int reverse](src/test/kotlin/com/igorwojda/integer/reverse/desc.md)
- [Pyramid generator](src/test/kotlin/com/igorwojda/integer/pyramidgenerator/desc.md)
- [Steps generator](src/test/kotlin/com/igorwojda/integer/stepsgenerator/desc.md)
- [Fizz Buzz](src/test/kotlin/com/igorwojda/integer/fizzbuzz/desc.md)
- [Caesar Cipher](src/test/kotlin/com/igorwojda/string/caesarcipher/desc.md)
- [Has repeated char](src/test/kotlin/com/igorwojda/string/hasrepeatedcharacter/desc.md)

**Warrior** 

- [Spiral matrix generator](src/test/kotlin/com/igorwojda/matrix/spiralmatrixgenerator/desc.md)
- [Find rectangle](src/test/kotlin/com/igorwojda/matrix/findrectangle/desc.md)
- [Queue](src/test/kotlin/com/igorwojda/queue/basic/desc.md)
- [Combine queues](src/test/kotlin/com/igorwojda/queue/combine/desc.md)
- [Stack](src/test/kotlin/com/igorwojda/stack/basic/desc.md)
- [Bubble sort](src/test/kotlin/com/igorwojda/list/sort/bubblesort/desc.md)
- [Selection sort](src/test/kotlin/com/igorwojda/list/sort/selectionsort/desc.md)
- [Square equals](src/test/kotlin/com/igorwojda/list/squareequal/desc.md)
- [Sum zero](src/test/kotlin/com/igorwojda/list/sumzero/desc.md)
- [Digit frequency](src/test/kotlin/com/igorwojda/integer/digitfrequency/desc.md)
- [Get duplicated arguments](src/test/kotlin/com/igorwojda/string/getduplicatedarguments/desc.md)
- [Find pair with target average](src/test/kotlin/com/igorwojda/list/pairaverage/desc.md)
- [Binary search tree](src/test/kotlin/com/igorwojda/tree/binarysearchtree/desc.md)
- [Tree traversal](src/test/kotlin/com/igorwojda/tree/classic/traversal/desc.md)
- [Tree level width](src/test/kotlin/com/igorwojda/tree/classic/levelwidth/desc.md)
- [Binary search tree (insert)](src/test/kotlin/com/igorwojda/binarytree/insert/desc.md)
- [Binary search tree (validate)](src/test/kotlin/com/igorwojda/binarytree/validate/desc.md)
- [Any callback](src/test/kotlin/com/igorwojda/various/anycallback/desc.md)
- [Flatten](src/test/kotlin/com/igorwojda/list/flatten/desc.md)
- [Binary search](src/test/kotlin/com/igorwojda/list/search/binarysearch/desc.md)
- [Surrounded letter](src/test/kotlin/com/igorwojda/string/surroundedletter/desc.md)
- [Insertion sort](src/test/kotlin/com/igorwojda/list/sort/insertionsort/desc.md)
- [Quick sort](src/test/kotlin/com/igorwojda/list/sort/quicksort/desc.md)
- [Radix sort](src/test/kotlin/com/igorwojda/list/sort/radixsort/desc.md)
- [Doubly linked list](src/test/kotlin/com/igorwojda/linkedlist/doubly/base/desc.md)
- [Max binary heap](src/test/kotlin/com/igorwojda/tree/heap/maxbinaryheap/desc.md)

**Commander**

- [List chunk](src/test/kotlin/com/igorwojda/list/listchunk/desc.md)
- [Singly linked list](src/test/kotlin/com/igorwojda/linkedlist/singly/base/desc.md)
- [Linked list midpoint](src/test/kotlin/com/igorwojda/linkedlist/singly/midpoint/desc.md)
- [Circular check](src/test/kotlin/com/igorwojda/linkedlist/singly/circularcheck/desc.md)
- [Linked list take n-th element from last](src/test/kotlin/com/igorwojda/linkedlist/singly/fromlast/desc.md)
- [Is sub string](src/test/kotlin/com/igorwojda/string/issubstring/desc.md)
- [Merge sort](src/test/kotlin/com/igorwojda/list/sort/mergesort/desc.md)
- [Fibonacci](src/test/kotlin/com/igorwojda/integer/fibonacci/basic/desc.md)
- [Fibonacci with recursive cache](src/test/kotlin/com/igorwojda/integer/fibonacci/recursivecached/desc.md)
- [Max sub list sum](src/test/kotlin/com/igorwojda/list/maxsublistsum/desc.md)
- [Min sub list length](src/test/kotlin/com/igorwojda/list/minsublistlength/desc.md)
- [Subtract](src/test/kotlin/com/igorwojda/list/subtract/desc.md)
- [Coins](src/test/kotlin/com/igorwojda/list/coins/desc.md)

# Useful links

## More coding challenges

### Challanges

- [GeeksForGeeks](https://practice.geeksforgeeks.org/explore) - large and nicely segregated set of problems.
- [HackerRank](https://www.hackerrank.com/dashboard) - large set of problems and additional interview problems for
  business.
- [TopCoder](https://www.topcoder.com/challenge) - platforms for competitive programming online.
- [Project Euler](https://projecteuler.net/archives) - more complex challenges, usually related to mathematics. The site
  already contains 600+ problems and a new code challenge is available very week or two. You will probably have to
  discuss the problem with the community because solutions are not on the website.
- [Advent of code](https://adventofcode.com/2018/events) - one month of various programing problems released daily at
  the end of the year. Fortunately archive of past events is still there.
- [CoderByte](https://coderbyte.com/challenges) - 200+ challenges, data structures / algorithms / company interview
  problems segregated by difficulty. Unfortunately most of them are only available for premium users. Premium gives you
  access to premium step-by-step solutions and user solutions.
- [CodeChef](https://www.codechef.com/problems/school) - contains set of programming problems segregated by difficulty.
- [LeetCode](https://leetcode.com/problemset/all) - data structures / algorithms / company interview problems segregated
  by difficulty.
- [Code Forces](http://codeforces.com/problemset) - list of programming challenges is smaller than other websites, but
  you will still have plenty of problems to solve.
- [Spoj](https://www.spoj.com/problems/classical) - list of programming challenges is smaller than other websites, but
  you will still have plenty of problems to solve.
- [Exercism](https://exercism.io/) - coding challenge website that offers 3100+ challenges spanning 52 different programming languages.

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

Feedback and new contributions are welcome whether it's through bug reports or new PRs. To add new coding puzzle just
follow this [guide](https://github.com/igorwojda/kotlin-coding-challenges/wiki/Adding-a-new-puzzle) and open PR.

## Contributors

- [Alan Evans](https://github.com/alanevansbc)
- [Norbert Kiesel](https://github.com/nkiesel)
- [David Mozano](https://github.com/mozano)
- [Yannis Barbakadze](https://github.com/yannisbarbakadze)

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
