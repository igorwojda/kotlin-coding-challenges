# Problem-solving strategy

## A bit of history

In 1945 Hungarian mathematician [George Pólya](https://en.wikipedia.org/wiki/George_P%C3%B3lya)
[described](https://en.wikipedia.org/wiki/How_to_Solve_It) a famous method of problem-solving:

1. Understand the problem.
2. Make a plan.
3. Carry out the plan.
4. Look back on your work. How could it be done better?

This may sound a bit abstract, so let's translate this method into more concrete steps.

## Strategy

### Understand the problem

1. Can I rephrase the problem using my own words?
2. What are the inputs?
3. What are the outputs?
4. How should I name the important pieces of data that are a part of the problem?
5. Explore concrete examples:
   1. Start with simple examples and progress to more complex ones.
   2. Explore empty inputs.
   3. Explore invalid inputs.

### Break it down

Write exact, atomic steps needed to solve the problem. They can be written on a piece of paper or as comments in the
file containing the code.

This forces you to think about the code before you write it and helps you catch issues or misunderstandings before you
dive into details (e.g. language syntax).

### Solve the problem

With well-defined steps, solving the problem should be much easier. If you struggle, go back to the previous steps to
make sure you understand the problem and know exactly what to do. You can also try alternative approaches, such as
solving a similar problem or solving a simplified version of the current problem by temporarily excluding the most
difficult part.

### Refactor & simplify

1. Refactor the code.
2. Improve performance ([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)).
3. Check how other people solved this problem.

> This strategy is inspired by [Colt Steele](https://www.udemy.com/js-algorithms-and-data-structures-masterclass/).

## Deliberate practice

Deliberate ([Kata](https://en.wikipedia.org/wiki/Kata)) practice is a great supplement to the above strategy. It
requires attention and rework, and leads to new knowledge and skills that can later be developed into more complex
ones.

In practice:

1. Solve a coding challenge.
2. Compare your solution with the solutions in this repository (or other solutions on the internet).
3. Think about how the solutions differ and what can be improved.
4. Solve the challenge again (without looking at the original solution) and compare again.

Repeat these steps over a period of days, weeks, or months. Bit by bit you will understand the problem better and the
challenge will feel familiar. Keep going until solving it is as easy as adding 97 and 3.
