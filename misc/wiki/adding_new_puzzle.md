# Adding new puzzle

Copy all files from [Puzzle template folder](../template/puzzlename) into new puzzle folder and update files accordingly:

1. `PuzzleName.md`
   1. Update description (install [Markdown Navigator plugin](https://plugins.jetbrains.com/plugin/7896-markdown-navigator) to have live
      markdown preview in the IDE)
2. `Puzzle.kt` file and change the name of the test
   1. Rename test class
   2. add puzzle test
   3. and body of the class/function where puzzle will be should
3. `PuzzleSolution.kt`
   4. Add solution
4. Add link for the new puzzle to [README.md](../../README.md) file
5. Create PR
