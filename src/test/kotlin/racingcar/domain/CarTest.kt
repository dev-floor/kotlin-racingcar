package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@Suppress("NonAsciiCharacters")
internal class CarTest {
    @Test
    internal fun `Car 인스턴스 생성`() {
        // given
        val name = Name("hello")

        // when
        val car = Car(name)

        // then
        assertThat(car).satisfies {
            assertThat(car).isNotNull
            assertThat(it.name).isEqualTo(name)
        }
    }

    @Test
    internal fun `from 메서드로 Car 인스턴스 생성`() {
        // given
        val name = "hello"

        // when
        val car = Car.from(name)

        // then
        assertThat(car).isNotNull
    }

    @ParameterizedTest
    @CsvSource(value = ["3,0", "4,1"])
    internal fun `숫자에 따라 위치를 이동시킴`(number: Long, expected: Long) {
        // given
        val car = Car.from("hello")

        // when
        car.move(number)

        // then
        assertThat(car.position.position).isEqualTo(expected)
    }
}
