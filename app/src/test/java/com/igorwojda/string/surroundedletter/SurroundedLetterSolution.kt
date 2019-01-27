package com.igorwojda.string.surroundedletter

// Regex solution
private object Solution1 {
    private fun surroundedLetter(str: String): Boolean {
        val pattern = Regex("(?=(\\+[a-z]\\+))")
            .findAll(str)
            .count()

        val letters = str.count { it.isLetter() }

        return pattern == letters
    }
}

// Iterative solution
private object Solution2 {
    private fun surroundedLetter(str: String): Boolean {
        if (str.length < 3) {
            return false
        }

        if (str.first().isLetter() || str.last().isLetter()) {
            return false
        }

        var previousCharacter = str.first()

        str.drop(1).forEach { currentCharacter ->
            if (currentCharacter.isLetter() && previousCharacter.isLetter()) {
                return false
            }

            previousCharacter = currentCharacter
        }

        return true
    }
}
