# Test Project Consistency And The Solutions Correctness

This subproject is designed to verify the root project. Checks are running with every PR.

## Consistency Checks

Verify consistency across various challenges e.g. check challenge naming and file structure.

## Solution Checks

Every coding challenge in this repo consists of a container (`challenge.kt` file) that has tests and
empty placeholder for a user-coded solution. Since the placeholder is non-implemented method
all tests in the root project will fail by design.

This subproject generates a test suite for each challenge by combining challenge container (`challenge.kt` file) with
every solution present in the `solution.kt` file.

To generate tests run the `cd .test && ./gradlew generateTests && cd ..` command.
Generated tests will be placed in the `src/test/kotlin/generated` directory.

To run only generated tests use `./gradlew test --tests "generated.com.igorwojda.*"` command.
`





