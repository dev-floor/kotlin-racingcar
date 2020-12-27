package racingcar.domain

class Cars(val cars: List<Car>) {
    init {
        require(cars.size >= MIN_SIZE) { "자동차는 1대 이상 존재해야 합니다." }
    }

    val winner: List<Car>
        get() {
            val winningPosition = cars.maxByOrNull { it.position }
                ?.position
                ?: throw AssertionError()

            return cars.filter { it.position == winningPosition }
                .toList()
        }

    companion object {
        private const val MIN_SIZE = 1

        fun from(carNames: List<String>): Cars {
            val cars = carNames.map { Car.from(it) }
            return Cars(cars)
        }
    }

    fun moveByNumberGenerator(numberGenerator: NumberGenerator) =
        cars.forEach { it.move(numberGenerator.generate()) }
}
