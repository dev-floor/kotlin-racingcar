package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
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
        assertThatIllegalArgumentException().isThrownBy { Car("123456") }
    }
}
