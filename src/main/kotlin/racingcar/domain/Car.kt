package racingcar.domain

import java.util.*

const val RANDOM = 10

const val THRESHOLD = 4

class Car(val name: String = "", var position: Position = Position("")) {
    fun move(){
        val random = Random()
        if(random.nextInt(RANDOM) >= THRESHOLD)
            position = position.accelerate()
    }
}

