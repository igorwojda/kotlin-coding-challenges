package com.igorwojda.codingpuzzle.shape.steps

//iterative solution
private fun stepsSolution1(n: Int): MutableList<String> {
    val list = mutableListOf<String>()

    (1..n).forEach { row ->
        var item = ""

        (1..n).forEach { column ->
            val char = if (column <= row) '#' else ' '
            item += char
        }

        list.add(item)
    }

    return list
}

//recursive solution
private fun stepsSolution2(n: Int, row: Int = 0, stair: String = "") {
    //handle complete all of the work
    if (n == row) {
        return
    }

    //handle end of the row
    if (n == stair.length) {
        stepsSolution2(n, row + 1)
        return
    }

    //handle the case where we are assembling stare string
    val char = if (stair.length <= row) '#' else ' '
    val currentStar = stair + char

    stepsSolution2(n, row, currentStar)
}
