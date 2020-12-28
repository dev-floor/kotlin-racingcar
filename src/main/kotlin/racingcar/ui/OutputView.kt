package racingcar.ui

import racingcar.domain.Report

private const val POSITION_DELIMITER = "-"

fun printReports(reports: Map<Long, List<Report>>) {
    println("\n실행 결과")

    for (lapReports in reports.values) {
        lapReports.forEach { (name, position) ->
            println("$name: ${renderCarPosition(position)}")
        }
        println()
    }
}

private fun renderCarPosition(position: Long) = buildString {
    repeat(position.toInt()) {
        append(POSITION_DELIMITER)
    }
    toString()
}

fun printWinners(winners: List<String>) {
    println("${winners.joinToString()}가 승리하였습니다.")
}
