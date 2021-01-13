package racingcar.domain

data class Position(val position: Int = 0) {
    fun accelerate() = this.copy(position + 1)
}
