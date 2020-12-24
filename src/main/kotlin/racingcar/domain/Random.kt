package racingcar.domain

import java.util.Random

const val RANDOM = 10

class Random {
    fun getRandomValue(): Int = Random().nextInt(RANDOM)
}
