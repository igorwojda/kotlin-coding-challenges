package com.igorwojda.list.formattrainroute

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun formatTrainRoute(stations: List<String>): String {
    return ""
}

class TrainRouteTest {
    @Test
    fun `formatTrainRoute list "Luton"`() {
        formatTrainRoute(listOf("Luton")) shouldEqual "Train is calling at Luton"
    }

    @Test
    fun `formatTrainRoute list "Luton", "Harpenden"`() {
        formatTrainRoute(listOf("Luton", "Harpenden")) shouldEqual "Train is calling at Luton and Harpenden"
    }

    @Test
    fun `formatTrainRoute list "Luton", "Harpenden", "London"`() {
        val list = listOf("Luton", "Harpenden", "London")
        formatTrainRoute(list) shouldEqual "Train is calling at Luton, Harpenden and London"
    }

    @Test
    fun `formatTrainRoute list "Luton", "Harpenden", "St Albans", "London"`() {
        val list = listOf("Luton", "Harpenden", "St Albans", "London")
        formatTrainRoute(list) shouldEqual "Train is calling at Luton, Harpenden, St Albans and London"
    }
}
