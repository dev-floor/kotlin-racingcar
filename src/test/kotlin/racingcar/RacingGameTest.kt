package racingcar

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test
import racingcar.domain.RacingGame
import racingcar.domain.Trial

class RacingGameTest {

    @Test
    fun `Should fail when trial number below zero`() {
        assertThatIllegalArgumentException().isThrownBy { RacingGame(Trial(-1)) }
    }
}
