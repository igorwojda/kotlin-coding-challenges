# Radix sort

## Instructions

Sort list of numbers from lowest number to greatest number using [radix sort](https://en.wikipedia.org/wiki/Radix_sort).
Algorithm needs to support only positive integers.

[challenge](challenge.kt) | [solution](solution.kt)

## Steps

Before we go into implementing Radix Sort we will implement a few helpers that will remove a bit of complexity from core
algorithm implementation.

### Helper 1: getDigitAt extension

Implement extension function `Int.getDigitAt(index:Int)` which will return character at given index or `0` if given index
is garter than last index.

```kotlin
123.getDigitAt(0) // '1'
123.getDigitAt(1) // '2'
123.getDigitAt(2) // '3'
123.getDigitAt(3) // '0'
123.getDigitAt(7) // '0'
```

After implementing this extension all tests prefixed with `getDigitAt at` must pass:
- `getDigitAt at 0 for 123 is 1`
- `getDigitAt at 1 for 123 is 2`
- `getDigitAt at 2 for 123 is 3`
- `getDigitAt at 3 for 123 is 0`
- `getDigitAt at 7 for 123 is 0`

### Helper 2: digitCount extension

Implement extension property `Int.digitCount` which will return character at given index or `0` if given index is garter
than last index.

```kotlin
1.digitCount // 1
123.digitCount // 3
12345.digitCount // 5
```

After implementing this extension all tests prefixed with `digitCount` must pass:
- `digitCount for 1 is 1`
- `digitCount for 123 is 3`
- `digitCount for 12345 is 5`
  
### Helper 3: maxDigits

Implement a function which will take a list of integer as a param and return maximum number of digits for single
integer in that list. numbers.

```kotlin
mostDigits(listOf(1, 2, 4)) // 1
mostDigits(listOf(1, 25, 42, 7, 9)) // 2
mostDigits(listOf(1, 25, 42, 77898, 1)) // 5

```

After implementing this function all tests starting with `digitCount` should pass:
- `maxDigits is equal to 0`
- `maxDigits is equal to 1`
- `maxDigits is equal to 2`
- `maxDigits is equal to 5`

### Radix sort

Having all the helper methods we can now implement radix sort. After implementing this function all tests must pass.

