package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class Position {

    @Test
    fun `Should get one more hyphen when accelerate`() {
        assertThat(Car().position.position + "-").isEqualTo(Car().position.accelerate().position)
    }
}
