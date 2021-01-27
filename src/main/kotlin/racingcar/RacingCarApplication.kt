package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumber
import racingcar.domain.Report
import racingcar.domain.Trial
import racingcar.view.getCarNames
import racingcar.view.getTrialNumber
import racingcar.view.showEachResults
import racingcar.view.showFinalResult
import java.lang.Exception

fun main() {
    val carNames = getCarNames().map { name -> Car(name) }
    val cars = Cars(carNames)
    val trial = getTrial()
    val report = Report()

//    RacingGame(trial!!).startGame(cars, RandomNumber(), report)
    showEachResults(report)
    showFinalResult(cars.winners.map { it.name })
}

private fun getTrial(): Trial {
    while(true) {
        try {
            return Trial(getTrialNumber())
        } catch(error: Exception){
            println(error.localizedMessage)
        }
    }
}
