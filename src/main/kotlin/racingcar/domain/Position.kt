package racingcar.domain

class Position(val position: String) {
    fun accelerate() = Position("$position-")
}
