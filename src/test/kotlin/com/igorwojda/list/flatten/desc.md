# Flatten

## Nice to solve before

## Instructions

Given list containing items (integer, lists, sub-lists) implement **recursive** function which returns list with all
values flattened. This function mimics behaviour of Kotlin build in ` flatten` method.

[challenge](challenge.kt) | [solution](solution.kt)

## Limitations

Don't use Kotlin build in [flatten](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flatten.html) 
function.

## Examples

```kotlin
flatten(listOf(1)) // 1

flatten(listOf(1), listOf(listOf(2))) // 1, 2

flatten(listOf(1), listOf(listOf(2), listOf(listOf(3)))) // 1, 2, 3
```

## Hints

<details>
<summary>Hint 1</summary>
Use helper recursive function.
</details>