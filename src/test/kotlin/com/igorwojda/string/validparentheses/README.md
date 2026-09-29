# Valid parentheses

## Instructions

Given a string containing only the characters `(`, `)`, `{`, `}`, `[` and `]`, implement a function to determine if the
input string is valid. An input string is valid if:

- Open brackets must be closed by the same type of bracket.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
isValidParentheses("()") // true

isValidParentheses("()[]{}") // true

isValidParentheses("(]") // false - '(' must be closed by ')' not ']'

isValidParentheses("([)]") // false - brackets are interleaved, not closed in correct order

isValidParentheses("{[]}") // true - properly nested brackets
```

## Hints

<details>
<summary>Hint 1</summary>
Use a stack.
</details>

<details>
<summary>Hint 2</summary>
Push open brackets to the stack. For each close bracket pop the stack and check that popped bracket matches.
</details>
