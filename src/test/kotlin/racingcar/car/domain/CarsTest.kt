package racingcar.car.domain

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
}
