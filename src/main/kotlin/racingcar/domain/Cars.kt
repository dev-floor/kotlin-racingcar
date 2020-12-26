package racingcar.domain

class Cars(val cars: List<Car>) {
    init {
        require(cars.size > CARS_SIZE_LOWER_BOUND) { "자동차는 1대 이상 존재해야 합니다." }
    }

    companion object {
        private const val CARS_SIZE_LOWER_BOUND = 1

        fun from(carNames: List<String>): Cars {
            val cars = carNames.map { Car.from(it) }
            return Cars(cars)
        }
    }
}
