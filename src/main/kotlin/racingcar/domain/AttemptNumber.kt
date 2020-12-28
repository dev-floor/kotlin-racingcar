package racingcar.domain

class AttemptNumber(number: Long) {
    var number = number
        private set

    val isPresent
        get() = number != 0L

    val attemptNumberSoFar
        get() = initialAttemptNumber - number

    private val initialAttemptNumber = number

    init {
        require(number >= ATTEMPT_NUMBER_LOWER_BOUND) { "시도할 횟수는 1회 이상만 가능합니다." }
    }

    fun decrease() = number--

    companion object {
        private const val ATTEMPT_NUMBER_LOWER_BOUND = 1

        fun from(attemptNumber: String) = AttemptNumber(attemptNumber.toLong())
    }
}
