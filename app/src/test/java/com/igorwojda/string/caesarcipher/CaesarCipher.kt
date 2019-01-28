package com.igorwojda.string.caesarcipher

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun encodeCaesarCipher(str: String, shift: Int): String {
    return str
}

class CaesarCipherTest {
    @Test
    fun `"abc" with shift 1 return "bcd"`() {
        encodeCaesarCipher("abc", 1) shouldEqual "bcd"
    }

    @Test
    fun `"abcdefghijklmnopqrstuvwxyz" shift 1 returns "bcdefghijklmnopqrstuvwxyza"`() {
        encodeCaesarCipher("abcdefghijklmnopqrstuvwxyz", 1) shouldEqual "bcdefghijklmnopqrstuvwxyza"
    }

    @Test
    fun `"abcdefghijklmnopqrstuvwxyz" shift 7 returns "hijklmnopqrstuvwxyzabcdefg"`() {
        encodeCaesarCipher("abcdefghijklmnopqrstuvwxyz", 7) shouldEqual "hijklmnopqrstuvwxyzabcdefg"
    }

    @Test
    fun `"abcdefghijklmnopqrstuvwxyz" shift 50 returns "yzabcdefghijklmnopqrstuvwx"`() {
        encodeCaesarCipher("abcdefghijklmnopqrstuvwxyz", 50) shouldEqual "yzabcdefghijklmnopqrstuvwx"
    }
}
