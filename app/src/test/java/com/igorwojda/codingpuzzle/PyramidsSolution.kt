package com.igorwojda.codingpuzzle

//iterative solution
private fun pyramidSolution1(n: Int): List<String> {
    val list = mutableListOf<String>()
    val numColumns = (n * 2) - 1

    (0 until n).forEach { row ->
        val numHashes = (row * 2) + 1
        val numSpaces = numColumns - numHashes
        var sideString = ""
        repeat(numSpaces / 2) { sideString += " " }
        var hashString = ""
        repeat(numHashes) { hashString += "#" }
        list.add("$sideString$hashString$sideString")
    }

    return list
}

//iterative solution - calculate mid point
private fun pyramidSolution2(n: Int): List<String> {
    val list = mutableListOf<String>()
    val midpoint = ((2 * n) - 1) / 2
    val numColumns = (n * 2) - 1

    (0 until n).forEach { row ->
        var rowStr = ""
        (0 until numColumns).forEach { column ->
            rowStr += if (midpoint - row <= column && midpoint + row >= column) {
                "#"
            } else {
                " "
            }
        }
        list.add(rowStr)
    }

    return list
}

//recursive solution
private fun pyramidSolution3(n: Int, row: Int = 0) {
    val numColumns = ((n - 1) * 2) + 1
    val midpoint = ((2 * n) - 1) / 2

    //handle complete all of the work
    if (n == row) {
        return
    }

    //handle the case where we are assembling string
    var rowStr = ""

    (0 until numColumns).forEach { column ->
        rowStr += if(midpoint - row <= column && midpoint + row >= column) {
            "#"
        } else {
            " "
        }
    }

    println(rowStr)

    //handle row
    pyramidSolution3(n, row + 1)
}

//recursive solution
private fun pyramidSolution4(n: Int, row: Int = 0, level: String = "") {
    val numColumns = (n * 2) - 1

    //handle complete all of the work
    if (n == row) {
        return
    }

    if (level.length == numColumns) {
        println(level)
        pyramidSolution4(n, row + 1)
        return
    }

    //handle the case where we are assembling string
    val midpoint = ((2 * n) - 1) / 2
    var add = ""

    add += if (midpoint - row <= level.length && midpoint + row >= level.length) {
        "#"
    } else {
        " "
    }

    //handle row
    pyramidSolution4(n, row, level + add)
}
