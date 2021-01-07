package racingcar.view

import racingcar.domain.Cars

const val POSITION_DELIMITER = "-"

fun showResult() = println("\n실행 결과")

fun showEachResults(cars: Cars) {
    cars.cars.forEach {
        print("${it.name} : ")
        for (i in 1..it.position.position)
            print(POSITION_DELIMITER)
        println()
    }
    println()
}

fun showFinalResult(winners: List<String>) {
    println("${winners.joinToString()}가 최종 우승했습니다.")
}
