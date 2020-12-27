package racingcar.domain

data class Report(val name: String, val position: Long) {
    companion object {
        fun of(name: Name, position: Position) = Report(name.name, position.position)
    }
}
