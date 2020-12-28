package racingcar.domain

class RacingGame(private val cars: Cars, private val attemptNumber: AttemptNumber) {
    val winners
        get() = cars.winners.map { it.name.name }

    fun start(numberGenerator: NumberGenerator): Map<Long, List<Report>> {
        val reports = mutableMapOf<Long, List<Report>>()

        while (attemptNumber.isPresent) {
            reports[attemptNumber.attemptNumberSoFar] = cars.moveByNumberGenerator(numberGenerator)
            attemptNumber.decrease()
        }
        return reports
    }
}
