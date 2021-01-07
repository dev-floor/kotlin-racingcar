package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.RandomNumber

class RandomNumberTest {
    @Test
    fun `Should be a random value from 0 to 9`() {
        val randomValue = RandomNumber().getRandomValue()
        assertThat(randomValue).isGreaterThanOrEqualTo(0)
        assertThat(randomValue).isLessThanOrEqualTo(9)
    }
}
