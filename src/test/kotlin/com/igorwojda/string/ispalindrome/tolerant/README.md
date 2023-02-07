# Is tolerant palindrome

## Nice to solve before

- [Palindrome](../basic/README.md)

## Instructions

Given a string, return true if the string is a palindrome or false if it is not.

Palindromes are strings that form the same word when reversed (including spaces and punctuation).

In this exercise one bad character is allowed. The string will be (tolerant) palindrome if after removing one
character string is a palindrome.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
tolerantPalindrome("abba") == true

tolerantPalindrome("abb#a") == true

tolerantPalindrome("abcdefg") == false
```
