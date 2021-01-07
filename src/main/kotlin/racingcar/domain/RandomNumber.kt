package racingcar.domain

import java.util.Random

class RandomNumber {
    fun getRandomValue(): Int = Random().nextInt(RANDOM)

    companion object {
        const val RANDOM = 10
    }
}
