package racingcar.car.domain

class Car(val name: String) {
    init {
        require(name.length in 1..5) { "자동차 이름은 5자 이하만 가능합니다." }
    }
}
