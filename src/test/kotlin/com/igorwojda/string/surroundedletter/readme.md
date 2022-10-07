# Surrounded letter

## Instructions

Given a string containing letters and `+` characters implement a function which determines if each letter in the string
is surrounded by `+` character. There may be more than one `+` character between letters (`+a++b+`) and letters may be
surrounded by the same `+` character (`+a+b+`).

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
surroundedLetter("+a+") // true

surroundedLetter("+ab+") // false

surroundedLetter("+a+b+") // true

surroundedLetter("+a++b++") // true
```

## Hints

<details>
<summary>Hint 1</summary>
Use can use regex to determine number of available patterns (plus character ; letter ; plus character) in the string.
</details>


<details>
<summary>Hint 2</summary>
You can also get number of available letters in the string.
</details>
