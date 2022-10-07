# Is anagram

## Instructions

Given two strings, implement a function to determine if the second string is an anagram of the first. An anagram is a
word, phrase, or name formed by rearranging the letters of another, such as `cinema`, formed from `iceman`. Only
consider characters, not spaces or punctuation. Consider capital letters to be the same as lower case.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
anagrams('rail safety', 'fairy tales') --> True

anagrams('RAIL! SAFETY!', 'fairy tales') --> True

anagrams('Hi there', 'Bye there') --> False
```

## Hints

<details>
<summary>Hint 1</summary>
Use frequency counter.
</details>
