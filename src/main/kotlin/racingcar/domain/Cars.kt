package racingcar.domain

class Cars(val cars: List<Car>) {
    val winners: List<String>
        get() {
            val winningPosition = cars.maxByOrNull { it.position.position }!!.position.position

            return cars.filter { it.position.position == winningPosition }
                .map { it.name }
                .toList()
        }

    fun moveCars(numberGenerator: NumberGenerator) {
        cars.forEach() { it.move(numberGenerator.generate()) }
    }
}
