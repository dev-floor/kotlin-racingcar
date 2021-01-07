package racingcar.domain

import racingcar.view.showEachResults

class RacingGame(private val trialNumber: Int) {
    init {
        require(trialNumber > 0)
    }

    fun startGame(cars: Cars): Cars {
        for (i in 1..trialNumber) {
            cars.moveCars()
            showEachResults(cars)
        }
        return cars
    }
}
