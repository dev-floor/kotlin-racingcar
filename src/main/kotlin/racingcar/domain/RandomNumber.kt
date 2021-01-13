package racingcar.domain

import java.util.Random

class RandomNumber {
    fun getRandomValue(): Int = Random().nextInt(RANDOM_UPPER_BOUND)

    companion object {
        const val RANDOM_UPPER_BOUND = 10
    }
}
