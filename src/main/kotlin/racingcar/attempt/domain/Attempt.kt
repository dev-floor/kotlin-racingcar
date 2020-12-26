package racingcar.attempt.domain

const val ATTEMPT_NUMBER_LOWER_BOUND = 1

class Attempt private constructor(private val number: Long) {
    init {
        require(number > ATTEMPT_NUMBER_LOWER_BOUND)
    }

    companion object {
        fun fromAttemptInput(inputNumber: String) {
            Attempt(inputNumber.toLong())
        }
    }
}
