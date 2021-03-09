# Is tolerant palindrome

## Nice to solve before

- [Palindrome](../basic/IsPalindrome.md)

## Instructions

Given a string, return true if the string is a palindrome or false if it is not. Palindromes are strings that form the
same word if it is reversed. Include spaces and punctuation in determining if the string is a palindrome. In this
exercise we will allows one bad character. Our string will be (tolerant) palindrome if after removing one character
string is a palindrome.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
tolerantPalindrome("abba") == true

tolerantPalindrome("abb#a") == true

tolerantPalindrome("abcdefg") == false
```