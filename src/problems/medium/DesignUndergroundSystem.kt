package problems.medium

import problems.medium.DesignUndergroundSystem.UndergroundSystem


fun main() {
    val undergroundSystem = UndergroundSystem()

    undergroundSystem.checkIn(45, "Leyton", 3)
    undergroundSystem.checkIn(32, "Paradise", 8)
    undergroundSystem.checkIn(27, "Leyton", 10)
    undergroundSystem.checkOut(45, "Waterloo", 15)
    undergroundSystem.checkOut(27, "Waterloo", 20)
    undergroundSystem.checkOut(32, "Cambridge", 22)
    println(
        undergroundSystem.getAverageTime(
            "Paradise",
            "Cambridge"
        )
    )       // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
    println(
        undergroundSystem.getAverageTime(
            "Leyton",
            "Waterloo"
        )
    )          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
    undergroundSystem.checkIn(10, "Leyton", 24)
    println(undergroundSystem.getAverageTime("Leyton", "Waterloo"))          // return 11.00000
    undergroundSystem.checkOut(10, "Waterloo", 38)
    println(undergroundSystem.getAverageTime("Leyton", "Waterloo"))          // return 12.00000


    val undergroundSystem2 = UndergroundSystem()

    undergroundSystem2.checkIn(10, "Leyton", 3)
    undergroundSystem2.checkOut(10, "Paradise", 8)
    println(undergroundSystem2.getAverageTime("Leyton", "Paradise")) // return 5.00000

    undergroundSystem2.checkIn(5, "Leyton", 10)
    undergroundSystem2.checkOut(5, "Paradise", 16)
    println(undergroundSystem2.getAverageTime("Leyton", "Paradise")) // return 5.50000

    undergroundSystem2.checkIn(2, "Leyton", 21)
    undergroundSystem2.checkOut(2, "Paradise", 30)
    println(undergroundSystem2.getAverageTime("Leyton", "Paradise")) // return 6.66667
}

class DesignUndergroundSystem {

    class UndergroundSystem {
        private val idMap = HashMap<Int, StationEvent>()

        private val stToStMap = HashMap<StationPair, MutableList<Int>>()

        fun checkIn(id: Int, stationName: String, t: Int) {
            idMap[id] = StationEvent(stationName, t)
        }

        fun checkOut(id: Int, stationName: String, t: Int) {
            val start = idMap[id]

            val key = StationPair(start!!.name, stationName)
            if (stToStMap[key] == null) {
                stToStMap[key] = mutableListOf()
            }

            stToStMap[key]!!.add(t - start.t)
        }

        fun getAverageTime(startStation: String, endStation: String): Double {
            val key = StationPair(startStation, endStation)

            return stToStMap[key]!!.average()
        }

    }

    data class StationEvent(val name: String, val t: Int)
    data class StationPair(val first: String, val second: String)
}