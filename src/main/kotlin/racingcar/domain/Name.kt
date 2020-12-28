package racingcar.domain

data class Name(val name: String) {
    init {
        require(name.length in LENGTH_LOWER_BOUND..LENGTH_UPPER_BOUND) { "자동차 이름은 5자 이하만 가능합니다." }
    }

    companion object {
        private const val LENGTH_LOWER_BOUND = 1
        private const val LENGTH_UPPER_BOUND = 5
    }
}
