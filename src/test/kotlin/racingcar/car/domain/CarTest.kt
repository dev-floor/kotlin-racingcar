package racingcar.car.domain

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

        assertThat(car).isNotNull
    }
}
