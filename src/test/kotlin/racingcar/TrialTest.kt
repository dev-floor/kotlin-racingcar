package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import racingcar.domain.Trial

class TrialTest {
    @Test
    fun `Should fail when trial below 1`() {
        Assertions.assertThatThrownBy { Trial(0) }
    }
}