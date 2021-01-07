package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.view.*

fun main() {
    val cars = Cars(getCarNames().map { name -> Car(name) }.toList())
    val trial = getTrialNumber()

    showResult()
    RacingGame(trial!!).startGame(cars)
    showFinalResult(cars.winners)
}
