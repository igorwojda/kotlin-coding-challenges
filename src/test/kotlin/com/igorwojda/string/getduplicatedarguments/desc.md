# Get duplicated arguments

## Instructions

Given variable number of arguments (list of strings) checks whether there are any duplicates among the arguments and
return list of all unique duplicates. If no arguments are passes return empty list.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
getDuplicatedParams("a", "b", "c") //empty list

getDuplicatedParams("a", "b", "c", "a") // [a]
```

## Hints

<details>
<summary>Hint 1</summary>
Use frequency counter or multiple pointers pattern.
</details>
