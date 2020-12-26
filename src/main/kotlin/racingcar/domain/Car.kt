package racingcar.domain

class Car(val name: Name, position: Position = Position()) {
    var position: Position = position
        private set

    companion object {
        private const val MOVABLE_LOWER_BOUND = 4

        fun from(name: String) = Car(Name(name))
    }

    fun move(number: Long) {
        if (number >= MOVABLE_LOWER_BOUND) {
            position.increase().also { position = it }
        }
    }
}
