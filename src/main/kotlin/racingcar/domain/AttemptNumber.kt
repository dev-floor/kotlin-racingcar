package racingcar.domain

class AttemptNumber(number: Long) {
    var number = number
        private set

    init {
        require(number > ATTEMPT_NUMBER_LOWER_BOUND) { "시도할 횟수는 1회 이상만 가능합니다." }
    }

    companion object {
        private const val ATTEMPT_NUMBER_LOWER_BOUND = 1

        fun from(attemptNumber: String) = AttemptNumber(attemptNumber.toLong())
    }

    private val initialAttemptNumber = number

    val isPresent
        get() = number != 0L

    val attemptCountSoFar
        get() = initialAttemptNumber - number

    fun decrease() = number--
}
