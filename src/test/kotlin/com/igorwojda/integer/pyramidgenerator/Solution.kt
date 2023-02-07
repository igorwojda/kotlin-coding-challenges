package com.igorwojda.integer.pyramidgenerator

// iterative solution
private object Solution1 {
    private fun generatePyramid(n: Int): List<String> {
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
}

// iterative solution - calculate mid point
private object Solution2 {
    private fun generatePyramid(n: Int): List<String> {
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
}

// simplified iterative solution
private object Solution3 {
    private fun generatePyramid(n: Int): MutableList<String> {
        val list = mutableListOf<String>()
        val maxRowLen = n * 2 - 1

        for (i in 1..n) {
            val rowLen = i * 2 - 1

            val sideString = " ".repeat((maxRowLen - rowLen) / 2)
            val hashString = "#".repeat(rowLen)

            list.add("$sideString$hashString$sideString")
        }
        return list
    }
}
