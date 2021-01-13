package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Position

class PositionTest {

    @Test
    fun `Should get one more hyphen when accelerate`() {
        val position = Position()
        assertThat(position.position + 1).isEqualTo(position.accelerate())
    }
}
