package com.igorwojda.string.caesarcipher

private object Solution1 {
    private fun encodeCaesarCipher(str: String, shift: Int): String {
        val aCode = 'a'.code
        val zCode = 'z'.code
        val realShift = shift % (zCode - aCode + 1)

        return str.map {
            var code = it.code
            code += realShift

            if (code > zCode) {
                code = aCode + (code % zCode) - 1
            }

            code.toChar()
        }.joinToString(separator = "")
    }
}

private object Solution2 {
    private fun encodeCaesarCipher(str: String, shift: Int): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        var encoded = ""

        str.forEach {
            val indexInAlphabet = alphabet.indexOf(it)
            val newIndex = (indexInAlphabet + shift) % alphabet.length
            encoded += alphabet[newIndex]
        }

        return encoded
    }
}

private object KtLintWillNotComplain
