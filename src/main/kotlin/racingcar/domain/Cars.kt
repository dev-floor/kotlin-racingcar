package racingcar.domain

class Cars(val cars: List<Car>) {
    val winners: List<Car>
        get() {
            val winningPosition = cars.maxByOrNull { it.position }
                ?.position
                ?: throw AssertionError()

            return cars.filter { it.position == winningPosition }
        }

    init {
        require(cars.size >= MIN_SIZE) { "자동차는 1대 이상 존재해야 합니다." }
    }

    fun moveByNumberGenerator(numberGenerator: NumberGenerator): List<Report> {
        cars.forEach { it.move(numberGenerator.generate()) }
        return cars.map { Report.of(it.name, it.position) }
    }

    companion object {
        private const val MIN_SIZE = 1

        fun from(carNames: List<String>): Cars {
            val cars = carNames.map { Car.from(it) }
            return Cars(cars)
        }
    }
}

