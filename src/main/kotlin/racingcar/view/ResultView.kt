package racingcar.view

import racingcar.domain.Cars

class ResultView{
    fun showResult() = println("\n" + "실행 결과")

    fun showEachResults(cars: Cars) {
        cars.carList.forEach { println(it.name + " : " + it.position.position) }
        println("")
    }

    fun showFinalResult(winners : List<String>){
        println(winners.joinToString(", ") + "가 최종 우승했습니다.")
    }
}