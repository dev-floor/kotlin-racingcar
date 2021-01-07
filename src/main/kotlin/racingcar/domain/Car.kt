package racingcar.domain

class Car(val name: String, var position: Position = Position()) {
    init {
        require(name.length <= NAME_THRESHOLD) { "자동차 이름은 5자 이하만 가능합니다." }
    }

    fun move(number: Int) {
        if (number >= MOVE_THRESHOLD)
            position = position.accelerate()
    }

    companion object {
        const val MOVE_THRESHOLD = 4
        const val NAME_THRESHOLD = 5
    }
}
