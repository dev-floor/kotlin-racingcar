package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
}
