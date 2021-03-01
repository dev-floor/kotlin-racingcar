package racingcar.domain

class Report(val report: MutableMap<Int, Set<Pair<String, Int>>> = mutableMapOf()) {

    fun report(round: Int, cars: Cars) {
        val reportSet = mutableSetOf<Pair<String, Int>>()
        cars.cars.forEach {
            reportSet.add(carReport(it))
        }
        report[round] = reportSet
    }

    private fun carReport(car: Car) = Pair(car.name, car.position.position)
}
