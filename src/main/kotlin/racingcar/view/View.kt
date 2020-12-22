package racingcar.view

import racingcar.domain.Cars

class View{
    fun getCarNames(): List<String>? {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        return validateCarNames(readLine()?.split(","))
    }

    private fun validateCarNames(names: List<String>?): List<String>? {
        names!!.forEach { require(it.length <= 5) { "자동차 이름은 5자 이하만 가능합니다." } }
        return names
    }

    fun getHowManyTrial(): Int? {
        println("\n" + "시도할 횟수는 몇 회인가요?")
        return readLine()?.toInt()
    }

    fun showResult() = println("\n" + "실행 결과")

    fun showEachResults(cars: Cars) {
        cars.carList.forEach { println(it.name + " : " + it.position.position) }
        println("")
    }

    fun showFinalResult(winners : List<String>){
        println(winners.joinToString(", ") + "가 최종 우승했습니다.")
    }
}