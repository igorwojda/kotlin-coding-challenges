package com.igorwojda.list.formattrainroute

// Time complexity: O(n)
// Space complexity: O(n)
private object Solution1 {
    private fun formatTrainRoute(stations: List<String>): String {
        val prefix = "Train is calling at "

        if (stations.size == 1) {
            return prefix + stations[0]
        }

        val lastStation =
            stations
                .takeLast(1)
                .joinToString { it }

        val followingStations =
            stations
                .dropLast(1)
                .joinToString { it }

        return "$prefix$followingStations and $lastStation"
    }
}

// Time complexity: O(n^2) - string concatenation in loop
// Space complexity: O(n)
private object Solution2 {
    private fun formatTrainRoute(stations: List<String>): String {
        var res = ""
        stations.forEach {
            res +=
                when (it) {
                    stations.first() -> it
                    stations.last() -> " and $it"
                    else -> ", $it"
                }
        }
        return "Train is calling at $res"
    }
}
