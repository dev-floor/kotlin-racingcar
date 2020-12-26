package racingcar.domain

class Car(val name: String) {
    init {
        require(name.length in 1..5)
    }
}
