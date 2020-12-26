package racingcar.car.domain

import racingcar.view.CAR_NAME_DELIMITER

const val CARS_SIZE_LOWER_BOUND = 1

class Cars private constructor(private val cars: List<Car>) {
    init {
        require(cars.size > CARS_SIZE_LOWER_BOUND)
    }

    companion object {
        fun fromCarNamesInput(carNamesInput: String): Cars {
            val cars = carNamesInput.split(CAR_NAME_DELIMITER)
                .map { it.trim() }
                .map { Car(it) }

            return Cars(cars)
        }
    }
}
