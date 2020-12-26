package racingcar.car.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

@Suppress("NonAsciiCharacters")
internal class CarsTest {
    @Test
    internal fun `fromCarNames 메서드로 인스턴스 생성`() {
        // given
        val name1 = "car1"
        val name2 = "car2"

        // when
        val cars = Cars.fromCarNames(arrayListOf(name1, name2))

        // then
        assertThat(cars).isNotNull
    }
}
