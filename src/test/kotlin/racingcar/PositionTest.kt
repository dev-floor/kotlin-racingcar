package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Position

class PositionTest {

    @Test
    fun `Should move one time more when accelerate`() {
        val position = Position()
        assertThat(position.position + 1).isEqualTo(position.accelerate())
    }
}
