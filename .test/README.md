# Test Project Consistency And The Solutions Correctness

This subproject is designed to verify the root project. Checks are running with every PR.

## Solution Checks

Verify correctness of the provided solutions.

Every coding challenge in this repo consists of a container that has tests and
empty placeholder for a user-coded solution. Since the placeholder is non-implemented method
all tests in the root project will fail by design. This subproject allows to generate a test suite for each challenge
by combining challenge container (`Challenge.kt` file) with every solution present in the `Solution.kt` file.

To generate tests go into `.test` subproject and run the `generateTests` command:

```shell
cd .test && ./gradlew generateTests
````

Generated tests will be placed in the `src/test/kotlin/generated` directory (root project).

To run generated tests use `./gradlew test --tests "generated.com.igorwojda.*"` (root project).

## Consistency Checks

Verify consistency across various challenges such as file naming and file structure.

To run checks go into `.test` subproject and run the `test` command:

To run tests use `cd .test && ./gradlew test` command.





