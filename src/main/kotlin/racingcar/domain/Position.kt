package racingcar.domain

class Position(var position: String) {
    fun accelerate() = Position("$position-")
}
