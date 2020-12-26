package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test

@Suppress("NonAsciiCharacters")
internal class PositionTest {
    @Test
    internal fun `Position 인스턴스 생성`() {
        // given
        val number = 2L

        // when
        val position = Position(number)

        // then
        assertThat(position).satisfies {
            assertThat(it).isNotNull
            assertThat(position.position).isEqualTo(number)
        }
    }

    @Test
    internal fun `유효하지 않은 위치일 경우 예외 생성`() {
        // given
        val number = -1L

        // then
        assertThatIllegalArgumentException().isThrownBy { Position(number) }
    }
}
