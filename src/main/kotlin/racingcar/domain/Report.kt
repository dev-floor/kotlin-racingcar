package racingcar.domain

class Report(var report: String = "") {

    fun roundReport(cars: Cars) =
        cars.cars.forEach {
            report += carReport(it)
        }.run { report += NEW_LINE }

    private fun carReport(car: Car) =
        "${car.name}$RESULT_DELIMITER${numberToDelimiter(car.position.position)}$NEW_LINE"

    private fun numberToDelimiter(position: Int): String {
        var positionWithDelimiter = ""
        for (i in 1..position)
            positionWithDelimiter += POSITION_DELIMITER
        return positionWithDelimiter
    }

    companion object {
        const val RESULT_DELIMITER = " : "
        const val POSITION_DELIMITER = "-"
        const val NEW_LINE = "\n"
    }
}
