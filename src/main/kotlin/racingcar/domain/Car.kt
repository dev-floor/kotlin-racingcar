package racingcar.domain

class Car(val name: Name, position: Position = Position()) {
    var position: Position = position
        private set

    fun move(number: Long) {
        when {
            number >= MOVABLE_LOWER_BOUND -> position = position.increase()
        }
    }

    companion object {
        private const val MOVABLE_LOWER_BOUND = 4

        fun from(name: String) = Car(Name(name))
    }
}
