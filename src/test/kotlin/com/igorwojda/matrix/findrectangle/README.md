# Find rectangle

## Instructions

Image is represent as a simple 2D array where every pixel is a 1 or a 0. The image you get is known to have a single
rectangle of 0s on a background of 1s.

Write a function that takes in the image and returns list containing coordinates of top-left and bottom-right pixels
represented as list of internees:

[Challenge.kt](Challenge.kt) | [solution](Solution.kt)

## Examples

Example 1

```kotlin
val image = listOf(
    listOf(1, 1, 0, 0, 0, 1),
    listOf(1, 1, 0, 0, 0, 1),
    listOf(1, 1, 1, 1, 1, 1),
    listOf(1, 1, 1, 1, 1, 1)
)

findRectangle(image)  // [0, 2, 1, 4]

```

Example 2

```kotlin
val image = listOf(
    listOf(1, 0, 0, 1, 1, 1),
    listOf(1, 0, 0, 1, 1, 1),
    listOf(1, 0, 0, 1, 1, 1)
)

findRectangle(image)  // [0, 1, 2, 2]

```

Example 3

```kotlin
val image = listOf(
    listOf(1, 1, 1, 1, 1),
    listOf(1, 1, 1, 0, 0),
    listOf(1, 1, 1, 0, 0),
    listOf(1, 1, 1, 0, 0),
    listOf(1, 1, 1, 0, 0)
)

findRectangle(image)  // [1, 3, 4, 4]

```
