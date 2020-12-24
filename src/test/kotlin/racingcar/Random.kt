package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.RANDOM
import java.util.Random

class Random {

    @Test
    fun `Should be a random value from 0 to 9`() {
        val randomValue = Random().nextInt(RANDOM)
        assertThat(randomValue).isGreaterThanOrEqualTo(0)
        assertThat(randomValue).isLessThanOrEqualTo(9)
    }
}
