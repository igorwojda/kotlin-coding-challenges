# Format train route

## Instructions

Given list of strings representing train station names implement a function which will return passenger friendly
`String`:
- String always starts with `Train is calling at`
- If list contains single tran station name then return that station name
- If list contains multiple train station names then return comma separated names, but with last name separated by `and`

[Puzzle](FormatTrainRoute.kt) | [Solution](FormatTrainRouteSolution.kt)

## Examples

```
formatTrainRoute(listOf("Luton")) // "Train is calling at Luton"

formatTrainRoute(listOf("Luton", "Harpenden")) // "Train is calling at Luton and Harpenden"

formatTrainRoute(listOf("Luton", "Harpenden", "London")) // "Train is calling at  Luton, Harpenden and London"
```