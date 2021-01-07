package racingcar.domain

class Position(val position: Int = 0) {
    fun accelerate() = Position(position + 1)
}
