package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumber
import racingcar.view.getCarNames
import racingcar.view.getTrialNumber
import racingcar.view.showFinalResult
import racingcar.view.showResult

fun main() {
    val carNames = getCarNames().map { name -> Car(name) }
        .toList()
    val cars = Cars(carNames)
    val trial = getTrialNumber()

    showResult()
    RacingGame(trial!!).startGame(cars, RandomNumber())
    showFinalResult(cars.winners)
}
