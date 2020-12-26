package racingcar.car.domain

const val NAME_LENGTH_LOWER_BOUND = 1
const val NAME_LENGTH_UPPER_BOUND = 5

class Car(val name: String) {
    init {
        require(name.length in NAME_LENGTH_LOWER_BOUND..NAME_LENGTH_UPPER_BOUND) { "자동차 이름은 5자 이하만 가능합니다." }
    }
}
