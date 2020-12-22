package racingcar

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.view.InputView
import racingcar.view.ResultView

fun main(args: Array<String>){
    val inputView = InputView()
    val resultView = ResultView()
    val cars = Cars()
    val carNames = inputView.getCarNames()
    cars.carList = carNames!!.map { name -> Car(name) }
    var trial = inputView.getHowManyTrial()
    resultView.showResult()
    while(trial!! > 0){
        cars.moveCars()
        resultView.showEachResults(cars)
        trial--
    }
    resultView.showFinalResult(cars.getWinnerList())
}