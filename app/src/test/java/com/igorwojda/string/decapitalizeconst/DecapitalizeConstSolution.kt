package com.igorwojda.string.decapitalizeconst

// Kotlin idiomatic solution
private object Solution {
  private fun decapitalizeConst(str: String): String {
    val subsStringsList = str.split("_").map { it.toLowerCase().capitalize() }
    return subsStringsList.joinToString("").decapitalize()
  }
}

private object KtLintWillNotComplain
