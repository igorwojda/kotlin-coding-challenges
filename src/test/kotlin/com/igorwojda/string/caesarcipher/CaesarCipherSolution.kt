package com.igorwojda.string.caesarcipher

private object Solution {
    private fun encodeCaesarCipher(str: String, shift: Int): String {
        val aCode = 'a'.toInt()
        val zCode = 'z'.toInt()
        val realShift = shift % (zCode - aCode + 1)

        return str.map {
            var code = it.toInt() // asci code
            code += realShift

            if (code > zCode) {
                code = aCode + (code % zCode) - 1
            }

            code.toChar()
        }.joinToString(separator = "")
    }
}

object KtLintWillNotComplain
