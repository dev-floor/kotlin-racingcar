package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Cars

class CarsTest {

    @Test
    fun `Should get the most moved cars when wanting to get winner list`() {
        val cars = Cars(listOf(Car("carA"), Car("carB"), Car("carC")))
        cars.cars[0].move(4)
        cars.cars[1].move(4)
        assertThat(cars.winners.count()).isEqualTo(2)
    }

    @Test
    fun `Car should move when random value is threshold or over`() {
        val cars = Cars(listOf(Car("carA"), Car("carB"), Car("carC")))
        val movableNumber = MovableNumberGenerator()

        cars.moveCars(movableNumber)
        cars.cars.forEach() { assertThat(it.position.position).isEqualTo(1) }
        assertThat(cars.winners.count()).isEqualTo(3)
    }
}
