package com.igorwojda.string.TextCompression

private object Solution1 {
    fun compress(text: String): String {
        if (text.isEmpty()) {
            return ""
        }

        val builder = StringBuilder()
        var count = 1
        for (i in 1 until text.length) {
            if (text[i] == text[i - 1]) {
                count++
            } else {
                builder.append(text[i - 1])
                builder.append(count)
                count = 1
            }
        }

        builder.append(text[text.length - 1])
        builder.append(count)

        return builder.toString()
    }
}

private object Solution2 {
    fun compress(text: String): String {
        return text.fold(StringBuilder()) { acc, char ->
            if (acc.isEmpty() || acc.last() != char) {
                acc.append(char).append(1)
            } else {
                acc[acc.lastIndex - 1] = (acc[acc.lastIndex - 1] - '0' + 1).toChar()
                acc
            }
        }.toString()
    }
}

private object Solution3 {
    fun compress(text: String): String {
        return text.groupBy { it }
            .map { "${it.key}${it.value.size}" }
            .joinToString("")
    }
}

fun main() {
    val text = "aaabbbccc"
    println(Solution1.compress(text))
    println(Solution2.compress(text))
    println(Solution3.compress(text))
}
