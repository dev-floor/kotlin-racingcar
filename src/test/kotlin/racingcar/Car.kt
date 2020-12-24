package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class Car {

    private val car = Car()

    @Test
    fun `Car should move when random value is threshold or over`() {
        val prevPosition = car.position
        car.move(4)
        assertThat(car.position).isNotEqualTo(prevPosition)
    }

    @Test
    fun `Car should not move when random value is below threshold`() {
        val prevPosition = car.position
        car.move(3)
        assertThat(car.position).isEqualTo(prevPosition)
    }
}
