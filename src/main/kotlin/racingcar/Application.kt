package racingcar

import racingcar.domain.AttemptNumber
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumberGenerator
import racingcar.ui.inputAttemptNumber
import racingcar.ui.inputCarNames
import racingcar.ui.printReports
import racingcar.ui.printWinners

fun main() {
    val cars = generateCars()
    val attemptNumber = generateAttemptNumber()

    val racingGame = RacingGame(cars, attemptNumber)
    val reports = racingGame.start(RandomNumberGenerator())

    printReports(reports)
    printWinners(racingGame.winners)
}

fun generateCars(): Cars {
    while (true) {
        try {
            return Cars.from(inputCarNames())
        } catch (e: RuntimeException) {
            println(e.localizedMessage)
        }
    }
}

fun generateAttemptNumber(): AttemptNumber {
    while (true) {
        try {
            return AttemptNumber.from(inputAttemptNumber())
        } catch (e: RuntimeException) {
            println(e.localizedMessage)
        }
    }
}
