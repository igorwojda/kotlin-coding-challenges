# Any callback

## Nice to solve before

- [Count down](../../integer/countdown/CountDown.md)
- [Get odd](../../integer/getodd/GetOdd.md)

## Instructions

Given list of integers and callback implement the **recursive** function which returns `true` if simple value in the
list passed to callback returns `true`, otherwise return `false`.

[Puzzle](AnyCallback.kt) | [Solution](AnyCallbackSolution.kt)

## Examples

Example 1

```
val callback:((Int) -> Boolean) = { it > 3 }
anyCallback(listOf(1, 2, 3, 4), callback) shouldEqual true
```

Example 2

```
val callback:((Int) -> Boolean) = { it > 3 }
anyCallback(listOf(1, 2, 3), callback) shouldEqual false
```

