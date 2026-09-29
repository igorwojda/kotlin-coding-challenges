package com.igorwojda.list.coins

// Time complexity: O(n * m) - n is amount, m is number of coins
// Space complexity: O(n) - n is amount
private object Solution1 {
    private fun getCoins(
        amount: Int,
        coins: List<Int>,
    ): Int {
        // array of zeros from 0..amount
        val waysOfDoingNCents = IntArray(amount + 1)

        waysOfDoingNCents[0] = 1

        for (coin in coins) {
            for (higherAmount in coin..amount) {
                val higherAmountRemainder = higherAmount - coin
                waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder]
            }
        }

        return waysOfDoingNCents[amount]
    }
}

private object KtLintWillNotComplain
