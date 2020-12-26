package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.RandomNumberGenerator.Companion.EXCLUSIVE_UPPER_BOUND
import racingcar.domain.RandomNumberGenerator.Companion.INCLUSIVE_LOWER_BOUND

@Suppress("NonAsciiCharacters")
internal class RandomNumberGeneratorTest {
    @Test
    internal fun `RandomNumberGenerator가 0부터 9 사이의 숫자를 생성`() {
        // given
        val numberGenerator: NumberGenerator = RandomNumberGenerator()

        // when
        val number = numberGenerator.generate()

        // then
        assertThat(number).satisfies {
            assertThat(it).isGreaterThanOrEqualTo(INCLUSIVE_LOWER_BOUND)
            assertThat(it).isLessThan(EXCLUSIVE_UPPER_BOUND)
        }
    }
}
