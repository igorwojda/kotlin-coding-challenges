# Caesar Cipher

## Instructions

Given a string and integer `shift` implement a function which shifts each character in that string by `shift` amount (
[cesar cipher](https://cryptii.com/pipes/caesar-cipher)) eg. if shift is `1` then `a` becomes `b`, `c` becomes`d`, `z`
became `a` etc. Allowed input is string containing only lowercase characters from alphabet `abcdefghijklmnopqrstuvwxyz`.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
encodeCaesarCipher("abc", 1) // bcd

encodeCaesarCipher("abc", 3) // def

encodeCaesarCipher("xyz", 1) // yza
```

## Hints

<details>
<summary>Hint 1</summary>
Use <a href="http://sticksandstones.kstrom.com/appen.html">ASCI character table</a>
</details>
