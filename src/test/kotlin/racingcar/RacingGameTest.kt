package racingcar

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test
import racingcar.domain.RacingGame

class RacingGameTest {

    @Test
    fun `Should fail when trial number below zero`() {
        assertThatIllegalArgumentException().isThrownBy { RacingGame(-1) }
    }
}
