package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class CarTest {

    private val car = Car("car")

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

    @Test
    fun `Should fail when name length over 5`() {
        assertThatThrownBy { Car("123456") }
    }

    @Test
    fun `Each car should move properly`() {
        val carA = Car("carA")
        val carB = Car("carB")
        val carC = Car("carC")
        carA.move(4)
        carA.move(4)
        carB.move(4)
        assertThat(carA.position.position).isEqualTo(2)
        assertThat(carB.position.position).isEqualTo(1)
        assertThat(carC.position.position).isEqualTo(0)
    }
}
