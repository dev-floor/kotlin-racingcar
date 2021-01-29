package racingcar.domain

class RacingGame(private val trialNumber: Trial, private val cars: Cars = Cars()) {

    fun startGame(numberGenerator: NumberGenerator, report: Report) {
        for (round in 1..trialNumber.trialNumber) {
            cars.moveCars(numberGenerator)
            report.report(round, cars)
        }
    }
}
