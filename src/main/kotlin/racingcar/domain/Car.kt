package racingcar.domain

const val THRESHOLD = 4

class Car(val name: String = "", var position: Position = Position("")) {
    fun move(randomValue: Int) {
        if (randomValue >= THRESHOLD)
            position = position.accelerate()
    }
}
