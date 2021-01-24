package racingcar.domain

class RacingGame(private val trialNumber: Int) {
    init {
        require(trialNumber > 0)
    }

    fun startGame(cars: Cars, numberGenerator: NumberGenerator, report: Report) {
        for (round in 1..trialNumber) {
            cars.moveCars(numberGenerator)
            report.report(round, cars)
        }
    }
}
