package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@Suppress("NonAsciiCharacters")
internal class NameTest {
    @Test
    internal fun `Name 인스턴스 생성`() {
        // given
        val name = "hello"

        // when
        val actual = Name(name)

        // then
        assertThat(actual).satisfies {
            assertThat(it).isNotNull
            assertThat(it.name).isEqualTo(name)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["helloCar", ""])
    internal fun `유효하지 않은 이름일 경우 예외 발생`(name: String) {
        // then
        assertThatIllegalArgumentException().isThrownBy { Name(name) }
    }
}
