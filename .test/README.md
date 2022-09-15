# Test project consistency and the solutions

This is a subproject designed to verify the root project correctness.

## Solution Checks

Every puzzle in this repo consists of a container (`challenge.kt` file) that has tests and 
empty placeholder for a user-coded solution. Since the placeholder is non-implemented method 
all tests in the root project fail by design. 

This subproject generates a test suite for each puzzle by combining puzzle container 
(`challenge.kt` file) with every puzzle solutions (`solution.kt` file).

## Consistency Checks

Verify consistency across various puzzles e.g. check puzzle naming and file structure each puzzle.

## Run

Run all checks `./gradle generateTests`




