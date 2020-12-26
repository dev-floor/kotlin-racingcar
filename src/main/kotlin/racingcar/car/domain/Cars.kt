package racingcar.car.domain

const val CARS_SIZE_LOWER_BOUND = 1

class Cars private constructor(private val cars: List<Car>) {
    init {
        require(cars.size > CARS_SIZE_LOWER_BOUND)
    }

    companion object {
        fun fromCarNames(carNames: List<String>): Cars {
            val cars = carNames.asSequence()
                .map { Name(it) }
                .map { Car(it) }
                .toList()

            return Cars(cars)
        }
    }
}
