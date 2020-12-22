package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.view.View

fun main(args: Array<String>){
    val view = View()
    val cars = Cars()
    val carNames = view.getCarNames()
    cars.carList = carNames!!.map { name -> Car(name) }
    var trial = view.getHowManyTrial()
    view.showResult()
    while(trial!! > 0){
        cars.moveCars()
        view.showEachResults(cars)
        trial--
    }
    view.showFinalResult(cars.getWinnerList())
}