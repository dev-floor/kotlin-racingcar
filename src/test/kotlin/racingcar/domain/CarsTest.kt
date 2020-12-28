package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test

@Suppress("NonAsciiCharacters")
internal class CarsTest {
    @Test
    internal fun `Cars 인스턴스 생성`() {
        // given
        val car1 = Car.from("car1")
        val car2 = Car.from("car2")

        // when
        val cars = Cars(arrayListOf(car1, car2))

        // then
        assertThat(cars).satisfies {
            assertThat(it).isNotNull
            assertThat(it.cars).hasSize(2)
        }
    }

    @Test
    internal fun `유효하지 않은 자동차 개수일 경우 예외 발생`() {
        // given
        val empty = emptyList<Car>()

        // then
        assertThatIllegalArgumentException().isThrownBy { Cars(empty) }
    }

    @Test
    internal fun `from 메서드로 Cars 인스턴스 생성`() {
        // given
        val name1 = "car1"
        val name2 = "car2"

        // when
        val cars = Cars.from(arrayListOf(name1, name2))

        // then
        assertThat(cars).isNotNull
    }

    @Test
    internal fun `NumberGenerator에 따라 모든 자동차를 이동`() {
        // given
        val cars = Cars.from(arrayListOf("car1", "car2"))
        val movableNumberGenerator = MovableNumberGenerator()

        // when
        val reports = cars.moveByNumberGenerator(movableNumberGenerator)

        // then
        assertThat(reports).extracting("position", Long::class.java)
            .isEqualTo(listOf(1L, 1L))
    }
}
