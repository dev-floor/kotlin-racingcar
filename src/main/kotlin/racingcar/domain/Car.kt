package racingcar.domain

class Car(val name: String, var position: Position = Position()) {
    init {
        require(name.length <= NAME_MAX_LENGTH) { NAME_LENGTH_ERROR_MESSAGE }
    }

    fun move(number: Int) {
        if (number >= MOVABLE_LOWER_BOUND)
            position = position.accelerate()
    }

    companion object {
        const val MOVABLE_LOWER_BOUND = 4
        const val NAME_MAX_LENGTH = 5
        const val NAME_LENGTH_ERROR_MESSAGE = "자동차 이름은 5자 이하만 가능합니다."
    }
}
