package racingcar.domain

class RacingGame(private val trialNumber: Int) {
    init {
        require(trialNumber > 0)
    }

    fun startGame(cars: Cars, numberGenerator: NumberGenerator): Report {
        val report = Report()

        for (i in 1..trialNumber) {
            cars.moveCars(numberGenerator)
            report.roundReport(cars)
        }
        return report
    }
}
