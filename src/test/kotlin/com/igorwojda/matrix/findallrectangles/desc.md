# Find All rectangle

## Instructions

Image is represent as a simple 2D array where every pixel is a 1 or a 0. The image you get is known to have multiple
rectangles of 0s on a background of 1s.

Write a function that takes in the image and returns list containing coordinates of top-left and bottom-right pixels
represented of each rectangle:

[challenge.kt](challenge.kt) | [solution](solution.kt)

## Examples

Example 1

```kotlin
val image = listOf(
    listOf(0, 1, 0, 0, 0, 1),
    listOf(1, 1, 0, 0, 0, 1),
    listOf(1, 1, 1, 1, 1, 1),
    listOf(0, 0, 1, 1, 1, 1),
)

findRectangle(image) // listOf(listOf(0, 0, 0, 0), listOf(2, 0, 4, 1), listOf(3, 0, 3, 1))

```
