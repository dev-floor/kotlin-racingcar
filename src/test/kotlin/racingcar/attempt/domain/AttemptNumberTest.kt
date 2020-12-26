package racingcar.attempt.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@Suppress("NonAsciiCharacters")
internal class AttemptNumberTest {
    @Test
    internal fun `AttemptNumber 인스턴스 생성`() {
        // given
        val number = 4L

        // when
        val attemptNumber = AttemptNumber(number)

        // then
        assertThat(attemptNumber).satisfies {
            assertThat(it).isNotNull
            assertThat(it.number).isEqualTo(number)
        }
    }

    @ParameterizedTest
    @ValueSource(longs = [-1L, 0L])
    internal fun `유효하지 않은 시도 횟수의 경우 예외 발생`(number: Long) {
        // then
        assertThatIllegalArgumentException().isThrownBy { AttemptNumber(number) }
    }

    @Test
    internal fun `from 메서드로 AttemptNumber 인스턴스 생성`() {
        // given
        val number = "2"

        // when
        val attemptNumber = AttemptNumber.from(number)

        // then
        assertThat(attemptNumber).satisfies {
            assertThat(it).isNotNull
            assertThat(it.number).isEqualTo(2L)
        }
    }

    @Test
    internal fun `from 메서드에서 시도 횟수가 정수가 아닐 경우 예외 발생`() {
        // given
        val number = "abc"

        // then
        assertThatThrownBy { AttemptNumber.from(number) }
            .isInstanceOf(NumberFormatException::class.java)
    }
}
