package com.igorwojda.codingpuzzle.recursiveprintnumber.steps

tailrec fun printNumber(n: Int, step: Int = 1) {
    println("step: $step")
    if (n < 0) {
        return
    } else {
        println(n)
    }

    printNumber(n - step, step)
}

printNumber(10, 2)


