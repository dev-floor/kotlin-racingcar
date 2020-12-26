package racingcar.domain

import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator {
    companion object {
        const val INCLUSIVE_LOWER_BOUND = 0L
        const val EXCLUSIVE_UPPER_BOUND = 10L
    }

    override fun generate(): Long {
        return Random.nextLong(INCLUSIVE_LOWER_BOUND, EXCLUSIVE_UPPER_BOUND)
    }
}
