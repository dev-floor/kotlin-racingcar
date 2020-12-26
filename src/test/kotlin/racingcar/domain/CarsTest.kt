package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
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
        cars.moveByNumberGenerator(movableNumberGenerator)

        // then
        assertThat(cars.cars).extracting("position", Position::class.java)
            .isEqualTo(listOf(Position(1L), Position(1L)))
    }
}
