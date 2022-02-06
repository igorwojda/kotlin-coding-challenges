package com.igorwojda.list.formattrainroute

private object Solution1 {
    private fun formatTrainRoute(stations: List<String>): String {
        var output = "Train is calling at "

        // Add commas between all but the last 2 stations.
        val intermediateStations = stations.dropLast(1)
            .joinToString { it }

        // Add the "and" if there were intermediate stations.
        if (intermediateStations.isNotEmpty()){
            output = "$intermediateStations and "
        }

        // Append the final station.
        output += stations.last()
        return output
    }
}

private object KtLintWillNotComplain
