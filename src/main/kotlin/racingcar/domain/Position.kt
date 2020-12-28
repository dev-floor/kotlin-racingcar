package racingcar.domain

class Position private constructor(val position: Long) : Comparable<Position> {
    init {
        require(position >= MIN_POSITION) { "자동차의 위치는 0보다 작을 수 없습니다." }
    }

    fun increase() = Position(position + 1)

    override fun compareTo(other: Position) = position.compareTo(other.position)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position

        if (position != other.position) return false

        return true
    }

    override fun hashCode(): Int {
        return position.hashCode()
    }

    companion object {
        const val MIN_POSITION = 0L
        private val CACHE = mutableMapOf<Long, Position>()

        fun valueOf(position: Long) = CACHE.getOrPut(position) { Position(position) }
    }
}
