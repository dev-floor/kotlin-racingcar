package racingcar.domain

class RacingGame(private val cars: Cars, private val attemptNumber: AttemptNumber) {
    fun start(numberGenerator: NumberGenerator): Map<Long, List<Report>> {
        val reports = mutableMapOf<Long, List<Report>>()

        while (attemptNumber.isPresent) {
            val lapNumber = attemptNumber.attemptCountSoFar

            reports[lapNumber] = cars.moveByNumberGenerator(numberGenerator)
            attemptNumber.decrease()
        }
        return reports
    }
}
