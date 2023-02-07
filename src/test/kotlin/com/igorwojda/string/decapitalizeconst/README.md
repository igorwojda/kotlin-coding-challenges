# Decapitalize const

## Instructions

Given a string representing constant name (upper case words
separated by underscore eg `FOO_BAR`) implement a function which
converts it into variable name (eg. `fooBar`):
- convert first word to lowercase
- convert next words to lowercase, but first character is still uppercase
- remove all underscore characters

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
decapitalizeConst("FOO") // foo

decapitalizeConst("FOO_BAR") // fooBar

decapitalizeConst("__FOO_BAR_BAZ") // fooBarBaz
```

