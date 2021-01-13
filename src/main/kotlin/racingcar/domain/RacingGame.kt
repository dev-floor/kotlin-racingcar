package racingcar.domain

import racingcar.view.showEachResults

class RacingGame(private val trialNumber: Int) {
    init {
        require(trialNumber > 0)
    }

    fun startGame(cars: Cars, numberGenerator: NumberGenerator): Cars {
        for (i in 1..trialNumber) {
            cars.moveCars(numberGenerator)
            showEachResults(cars)
        }
        return cars
    }
}
