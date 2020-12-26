package racingcar.domain

class Car(val name: Name, val position: Position = Position()) {
    companion object {
        fun from(name: String) = Car(Name(name))
    }
}
