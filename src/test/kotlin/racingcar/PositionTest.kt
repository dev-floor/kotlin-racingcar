package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class PositionTest {

    @Test
    fun `Should get one more hyphen when accelerate`() {
        assertThat(Car("carA").position.position + 1).isEqualTo(Car("carB").position.accelerate().position)
    }
}
