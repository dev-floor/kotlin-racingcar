package racingcar.domain

data class Position(val position: Long = 0L) : Comparable<Position> {
    init {
        require(position >= MIN_POSITION) { "자동차의 위치는 0보다 작을 수 없습니다." }
    }

    // TODO: 2020/12/27 caching 적용하기
    companion object {
        private const val MIN_POSITION = 0L
    }

    fun increase() = Position(position + 1)

    override fun compareTo(other: Position) = position.compareTo(other.position)
}
