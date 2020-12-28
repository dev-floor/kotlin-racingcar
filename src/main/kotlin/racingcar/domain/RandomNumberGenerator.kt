package racingcar.domain

import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator {
    override fun generate() = Random.nextLong(INCLUSIVE_LOWER_BOUND, EXCLUSIVE_UPPER_BOUND)

    companion object {
        const val INCLUSIVE_LOWER_BOUND = 0L
        const val EXCLUSIVE_UPPER_BOUND = 10L
    }
}
