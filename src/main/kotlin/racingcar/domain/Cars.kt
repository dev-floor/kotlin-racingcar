package racingcar.domain

class Cars(var cars: List<Car>) {
    val winners: List<String>
        get() {
            return cars.filter { it -> it.position.position == cars.maxByOrNull { it.position.position }!!.position.position }
                .map { it.name }
                .toList()
        }

    fun moveCars() = cars.forEach() { it.move(RandomNumber().getRandomValue()) }
}
