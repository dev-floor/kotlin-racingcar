package racingcar.domain

import kotlin.streams.toList

class Cars(var carList: List<Car> = emptyList()) {
    fun moveCars() = carList.forEach() { it.move(Random().getRandomValue()) }

    fun getWinner(): Car? = carList.maxByOrNull { it.position.position }

    fun getWinnerList():
        List<String> {
            val winner = this.getWinner()
            return carList.stream()
                .filter { it.position.position == winner!!.position.position }
                .map { it.name }
                .toList()
        }
}
