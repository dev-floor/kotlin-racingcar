package racingcar

import racingcar.domain.AttemptNumber
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumberGenerator
import racingcar.ui.inputAttemptNumber
import racingcar.ui.inputCarNames
import racingcar.ui.printReports

fun main() {
    val cars = generateCars()
    val attemptNumber = generateAttemptNumber()
    val racingGame = RacingGame(cars, attemptNumber)
    val numberGenerator = RandomNumberGenerator()

    val reports = racingGame.start(numberGenerator)
    printReports(reports)

    println("${cars.winner.joinToString { it.name.name }}가 승리하였습니다.")
}

fun generateCars(): Cars {
    while (true) {
        try {
            return Cars.from(inputCarNames())
        } catch (e: RuntimeException) {
            println("${e.localizedMessage}\n")
        }
    }
}

fun generateAttemptNumber(): AttemptNumber {
    while (true) {
        try {
            return AttemptNumber.from(inputAttemptNumber())
        } catch (e: RuntimeException) {
            println("${e.localizedMessage}\n")
        }
    }
}
