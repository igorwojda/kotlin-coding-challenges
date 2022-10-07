# List subtract

## Nice to solve before

- [Is anagram](../../string/isanagram/readme.md)
- [Square equals](../squareequal/readme.md)
- [Digit frequency](../../integer/digitfrequency/readme.md)
- [Max occurring char](../../string/maxchar/readme.md)
- [Get duplicated arguments](../../string/getduplicatedarguments/readme.md)

## Instructions

Given two lists implement a function which will determine witch elements from first list have to be subtracted (removed)
to obtain second list (what elements needs to be removed from first list so it it would be equal to second list). There
may be more than one element with the same value. For simplicity we assume that input is always correct (it is always
possible to remove values from first list to form second list).

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
getSubtraction(listOf("A", "B", "C"), listOf("A")) // "B", "C"

getSubtraction(listOf("A", "B", "C"), listOf("A", "B")) // "C"

getSubtraction(listOf("A", "B", "C", "A"), listOf("A", "B")) // "C", "A"
 
getSubtraction(listOf("A", "B", "C"), listOf("A", "B", "C")) // nothing
```

## Hints

<details>
<summary>Hint 1</summary>
Use frequency counter.
</details>

