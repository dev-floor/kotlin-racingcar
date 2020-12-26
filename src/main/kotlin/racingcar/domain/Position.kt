package racingcar.domain

data class Position(val position: Long = 0L) {
    init {
        require(position >= POSITION_LOWER_BOUND) { "자동차의 위치는 0보다 작을 수 없습니다." }
    }

    companion object {
        private const val POSITION_LOWER_BOUND = 0L
    }
}
