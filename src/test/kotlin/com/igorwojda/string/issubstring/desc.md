# Is substring

## Nice to solve before

## Instructions

Given two strings implement a function which determines whether the characters in the `second` string is a substring of
the characters in the `first` string (check if `second` string exists as continuous/unbroken chain of characters the
`first` string).

[challenge](challenge.kt) | [solution](solution.kt)

## Limitations

Don't use `String.contains` method.

## Examples

```kotlin
isSubstring("go home", "ome") // true

isSubstring("go home", "me") // true

isSubstring("go home", "abc") // false
```

## Hints

<details>
<summary>Hint 1</summary>
Use double pointer or recursion
</details>
