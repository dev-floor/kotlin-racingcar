package racingcar.attempt.domain

class Attempt private constructor(private val number: Long) {
    init {
        require(number > 1)
    }

    companion object {
        fun fromAttemptInput(inputNumber: String) {
            Attempt(inputNumber.toLong())
        }
    }
}
