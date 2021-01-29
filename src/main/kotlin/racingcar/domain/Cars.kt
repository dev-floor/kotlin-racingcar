package racingcar.domain

class Cars(val cars: List<Car> = listOf()) {
    val winners: List<Car>
        get() {
            val winningPosition = cars.maxByOrNull { it.position.position }!!.position.position

            return cars.filter { it.position.position == winningPosition }
        }

    fun moveCars(numberGenerator: NumberGenerator) = cars.forEach() { it.move(numberGenerator.generate()) }
}
