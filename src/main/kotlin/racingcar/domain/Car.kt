package racingcar.domain

class Car(val name: Name) {
    companion object {
        fun from(name: String) = Car(Name(name))
    }
}
