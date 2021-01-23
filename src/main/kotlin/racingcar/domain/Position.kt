package racingcar.domain

data class Position(val position: Int = 0) {
    fun accelerate() = copy(position = position + 1)
}
