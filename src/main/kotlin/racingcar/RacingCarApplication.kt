package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumber
import racingcar.view.*

fun main() {
    val carNames = getCarNames().map { name -> Car(name) }
    val cars = Cars(carNames)
    val trial = getTrialNumber()

    showResult()
    val report = RacingGame(trial!!).startGame(cars, RandomNumber())
    showEachResults(report)
    showFinalResult(cars.winners.map { it.name })
}
