package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumber
import racingcar.domain.Report
import racingcar.domain.Trial
import racingcar.view.errorMessage
import racingcar.view.inputCarNames
import racingcar.view.inputTrialNumber
import racingcar.view.showEachResults
import racingcar.view.showFinalResult
import java.lang.Exception

fun main() {
    val carNames = getCarNames()
    val cars = Cars(carNames)
    val trial = getTrial()
    val report = Report()

    RacingGame(trial, cars).startGame(RandomNumber(), report)
    showEachResults(report)
    showFinalResult(cars.winners.map { it.name })
}

private fun getTrial(): Trial {
    while (true) {
        try {
            return Trial(inputTrialNumber())
        } catch (error: Exception) {
            errorMessage(error)
        }
    }
}

private fun getCarNames(): List<Car> {
    while (true) {
        try {
            return inputCarNames().map { name -> Car(name) }
        } catch (error: Exception) {
            errorMessage(error)
        }
    }
}
