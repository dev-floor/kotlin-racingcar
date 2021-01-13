package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.view.*

fun main() {
    val carNames = getCarNames().map { name -> Car(name) }
            .toList()
    val cars = Cars(carNames)
    val trial = getTrialNumber()

    showResult()
    RacingGame(trial!!).startGame(cars)
    showFinalResult(cars.winners)
}
